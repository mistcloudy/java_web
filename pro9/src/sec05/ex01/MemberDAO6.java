package sec05.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

	public class MemberDAO6 {
		private Connection con;
		private PreparedStatement pstmt;
		private DataSource dataFactory;

		public MemberDAO6() {
			try {
				Context ctx = new InitialContext();
				Context envContext = (Context) ctx.lookup("java:/comp/env");
				dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public List listMembers() {
			List list = new ArrayList();
			try {
				// connDB();
				con = dataFactory.getConnection();
				String query = "select * from t_member ";
				System.out.println("prepareStatememt: " + query);
				pstmt = con.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					String id = rs.getString("id");
					String pwd = rs.getString("pwd");
					String name = rs.getString("name");
					String email = rs.getString("email");
					Date joinDate = rs.getDate("joinDate");
					MemberVO6 vo = new MemberVO6();
					vo.setId(id);
					vo.setPwd(pwd);
					vo.setName(name);
					vo.setEmail(email);
					vo.setJoinDate(joinDate);
					list.add(vo);
				}
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}

		public void addMember(MemberVO6 memberVO) {
			try {
				Connection con = dataFactory.getConnection();
				String id = memberVO.getId();
				String pwd = memberVO.getPwd();
				String name = memberVO.getName();
				String email = memberVO.getEmail();
				String query = "insert into t_member";
				query += " (id,pwd,name,email)";
				query += " values(?,?,?,?)";
				System.out.println("prepareStatememt: " + query);
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void delMember(String id) {
			try {
				Connection con = dataFactory.getConnection();
				Statement stmt = con.createStatement();
				String query = "delete from t_member" + " where id=?";
				System.out.println("prepareStatememt:" + query);
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public boolean isExisted(MemberVO6 memberVO) {
			boolean result = false;
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			try {
				con = dataFactory.getConnection();
				String query = "select decode(count(*),1,'true','false') as result from t_member";
				query += " where id=? and pwd=?";
				System.out.println(query);
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				ResultSet rs = pstmt.executeQuery();
				rs.next(); //?????? ?????? ???????? ????????????.
				result = Boolean.parseBoolean(rs.getString("result"));
				System.out.println("result=" + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		}
/*
	private void connDB() { // Database connection
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver loading success");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection Successfully created");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}*/
	// Don't use it anymore
}  // Log in using a session