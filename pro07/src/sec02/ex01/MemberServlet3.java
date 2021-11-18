package sec02.ex01;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member3")
public class MemberServlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=utf-8");
	      PrintWriter out=response.getWriter();	
	      MemberDAO3 dao=new MemberDAO3();
	      List<MemberVO3> list=dao.listMembers();
		
	      out.print("<html><body>");
	      out.print("<table  border=1><tr align='center' bgcolor='lightgreen'>");
	      out.print("<td>Id</td><td>Password</td><td>Name</td><td>Email</td><td>JoinDate</td></tr>");
	     
	     for (int i=0; i<list.size();i++){ // print out the membership information as a list
			MemberVO3 memberVO=(MemberVO3) list.get(i);
			String id=memberVO.getId();
			String pwd = memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			out.print("<tr><td>"+id+"</td><td>"+
				                pwd+"</td><td>"+
				                name+"</td><td>"+
				                email+"</td><td>"+
				                joinDate+"</td></tr>");		
	      }
	      out.print("</table></body></html>");
	   }
	} // / Link database - Servlet with DataSource