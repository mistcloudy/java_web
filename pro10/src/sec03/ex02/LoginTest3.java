package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/login3")
public class LoginTest3 extends HttpServlet {
	ServletContext context = null;
	List user_list = new ArrayList();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		LoginImpl2 loginUser = new LoginImpl2(user_id, user_pw);
		if (session.isNew()) {
			session.setAttribute("loginUser", loginUser);
			user_list.add(user_id);
			context.setAttribute("user_list", user_list);
		}

		out.println("<html><body>");
		out.println("Id is " + loginUser.user_id + "<br>");
		out.println("total number of users is" + LoginImpl2.total_user + "<br>");
		out.println("Acceses id :<br>");
		List list = (ArrayList) context.getAttribute("user_list");
		for (int i = 0; i < list.size(); i++) {
			out.println(list.get(i) + "<br>");
		}
		out.println("<a href='logout?user_id=" + user_id + "'>Logout </a>");
		out.println("</body></html>");
	}

} // Displaying the number of users using HttpSessionListener
