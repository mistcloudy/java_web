package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/login")
public class LoginTest extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// request.setCharacterEncoding( "utf-8" );
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();

				String user_name = request.getParameter("user_name");
				String user_pw = request.getParameter("user_pw");
				out.println("<html><body>");
				out.println("Name is " + user_name + "<br>");
				out.println("Password is " + user_pw + "<br>");
				out.println("</body></html>");
	}

} // Korean encoding using a filter