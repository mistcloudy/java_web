package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver"; // Database connection information
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "system";
	private static final String pwd = "1234";
	private Connection con;
	private Statement stmt;

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			connDB(); // Call Database connection function
			String query = "select * from t_member ";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query); // Membership information inquiry
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate"); // Receipt of record values
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate); // Set it to the object attribute
				list.add(vo); // Save it in ArrayList
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private void connDB() { // Database connection
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver loading success");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection Successfully created");
			stmt = con.createStatement();
			System.out.println("Statement Successfully created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}  // Link database - DAO