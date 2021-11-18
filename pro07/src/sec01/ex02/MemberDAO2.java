package sec01.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO2 {
	private static final String driver = "oracle.jdbc.driver.OracleDriver"; // Database connection information
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "system";
	private static final String pwd = "1234";
	private Connection con;
	private PreparedStatement pstmt;

	public List<MemberVO2> listMembers() {
		List<MemberVO2> list = new ArrayList<MemberVO2>();
		try {
			connDB(); // Call Database connection function
			String query = "select * from t_member ";
			System.out.println("prepareStatememt: " + query);
			pstmt = con.prepareStatement(query); // Send SQL statement to pstmt method
			ResultSet rs = pstmt.executeQuery(query); // Membership information inquiry
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate"); // Receipt of record values
				MemberVO2 vo = new MemberVO2();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate); // Set it to the object attribute
				list.add(vo); // Save it in ArrayList
			}
			rs.close();
			pstmt.close();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}  // Link database - DAO with prepareStatememt