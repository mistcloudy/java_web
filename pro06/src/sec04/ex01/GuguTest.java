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
 * Servlet implementation class GuguTest
 */
@WebServlet("/guguTest")
public class GuguTest extends HttpServlet {

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));

		out.print(" <table border=1 width=800 align=center>");
		out.print("<tr align=center bgcolor='#FFFF66'>");
		out.print("<td colspan=2>" + dan + " Table Output  </td>");
		out.print("</tr>");

		for (int i = 1; i < 10; i++) {
			out.print("<tr align=center>");
			out.print("<td width=400>");
			out.print(dan + " *  " + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
		}

		out.print("</table>");
	}

} // simple multiplication table using servlet
