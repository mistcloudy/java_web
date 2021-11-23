package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/sess")
public class SessionTest extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("Session ID : " + session.getId() + "<br>");
		out.println("time when the session was created : " + new Date(session.getCreationTime()) + "<br>");
		out.println("latest session access time : " + new Date(session.getLastAccessedTime()) + "<br>");
		out.println("Session validity time : " + session.getMaxInactiveInterval() + "<br>");
		if (session.isNew()) {
			out.print("new session has been created.");
	}
	}
}	// Servlet uses session api
