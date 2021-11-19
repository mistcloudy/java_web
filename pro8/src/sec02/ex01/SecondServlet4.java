package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second4")
public class SecondServlet4 extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=utf-8");
	      PrintWriter out = response.getWriter();

	      String name=request.getParameter("name");
	      out.println("<html><body>");
	      out.println("name:"+name);
	      out.println("<br>");
	      out.println("This is a redirect practice using dispatch.");
	      out.println("</body></html>");   
	}
} // Call due to dispatch

