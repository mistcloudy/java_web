package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest2
 */
@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init Call the method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy Call the method");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("utf-8");   
	      response.setContentType("text/html;charset=utf-8");  
	      PrintWriter out = response.getWriter();				
	      String id = request.getParameter("user_id");  
	      String pw = request.getParameter("user_pw");  
			
	      System.out.println("아이디   : "+ id);  
	      System.out.println("패스워드 : "+ pw);

	      if(id!= null &&(id.length()!=0)){
			 if(id.equals("admin")){
			   out.print("<html>");
			   out.print("<body>");
		 	   out.print( "<font size='12'>You logged in as an administrator!! </font>" );
			   out.print("<br>");
			   out.print("<input type=button value='Modifying membership information'  />");
			   out.print("<input type=button value='Delete membership information'  />");
			   out.print("</body>");
			   out.print("</html>");
			 }else{
			   out.print("<html>");
			   out.print("<body>");
			   out.print( id +" !! You login." );
			   out.print("</body>");
			   out.print("</html>");
			 }     
	      }else{
			out.print("<html>");  
			out.print("<body>");
			out.print("Enter your Id and Password!!!" ) ;
			out.print("<br>");
			out.print("<a href='http://localhost:8090/pro06/login.html'> Go to the login frame  </a>");
			out.print("</body>");
			out.print("</html>");
	      }
	   }

} //Add an admin account