package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member4")
public class MemberServlet4 extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      MemberDAO4 dao=new MemberDAO4();
	      PrintWriter out=response.getWriter();
	      String command=request.getParameter("command"); // Received command value of html
	      if(command!= null && command.equals("addMember")){ // Case of addMemeber
			 String _id=request.getParameter("id");
			 String _pwd=request.getParameter("pwd");
			 String _name=request.getParameter("name");
			 String _email=request.getParameter("email");
			 
			 MemberVO4 vo=new MemberVO4();
			 vo.setId(_id);
			 vo.setPwd(_pwd);
			 vo.setName(_name);
			 vo.setEmail(_email);
		     dao.addMember(vo);
	      }else if(command!= null && command.equals("delMember")) { // Case of delMember
	    	  String id = request.getParameter("id");
	    	  dao.delMember(id);
	      }
	       List list=dao.listMembers();
	     out.print("<html><body>");
	     out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
	     out.print("<td>Id</td><td>Password</td><td>Name</td><td>Email</td><td>Date</td><td >Delete</td></tr>");
	    
	     for (int i=0; i<list.size();i++){
	 		MemberVO4 memberVO=(MemberVO4) list.get(i);
	 		String id=memberVO.getId();
	 		String pwd = memberVO.getPwd();
	 		String name = memberVO.getName();
	 		String email =memberVO.getEmail();
	 		Date joinDate = memberVO.getJoinDate();
	 		out.print("<tr><td>"+id+"</td><td>"
	 			                +pwd+"</td><td>"
	 			                +name+"</td><td>"
	 			                +email+"</td><td>"
	 			                +joinDate+"</td><td>"
	 		                    +"<a href='/pro07/member4?command=delMember&id="+id+"'>Delete </a></td></tr>");

	 	 }
	 	 out.print("</table></body></html>");
	     out.print("<a href='/pro07/memberForm.html'>Registering as a new member</a");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

} // Add and delete membership information
 