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
 * Servlet implementation class LoginTest
 */
@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {

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
			
	      System.out.println("Id   : "+ id);  
	      System.out.println("Password : "+ pw);
		
	     if(id!= null &&(id.length()!=0)){
			out.print("<html>");  
			out.print("<body>");
			out.print( id +" !! You login." );
			out.print("</html>");
			out.print("</body>");
	      }else{
			out.print("<html>");  
			out.print("<body>");
			out.print("Enter your Id!!!" ) ;
			out.print("<br>");
			out.print("<a href='http://localhost:8090/pro06/login6.html'>Go to the login frame  </a>");
			out.print("</html>");
			out.print("</body>");
	      }
	   } 
} // Login validation
