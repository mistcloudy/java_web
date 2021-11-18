package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO3 {
	/*
	private static final String driver = "oracle.jdbc.driver.OracleDriver"; // Database connection information
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "system";
	private static final String pwd = "1234";
	*/
	// Don't use it anymore
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO3() {
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
			//connDB();
			con=dataFactory.getConnection();
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
				MemberVO3 vo = new MemberVO3();
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
}  // Link database - DAO with DataSource