package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

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
	    PrintWriter out=response.getWriter();	
	    String user_id = request.getParameter("user_id");
	    String user_pw = request.getParameter("user_pw");
	    String user_address = request.getParameter("user_address");
	    String user_email = request.getParameter("user_email");
	    String user_hp = request.getParameter("user_hp");
	    
	    String data="Hello!<br> login.<br><br>";
	    data+="<html><body>";
	    data += "id : " + user_id;
		data += "<br>";
		data += "password : " + user_pw;
		data += "<br>";
		data += "address : " + user_address;
		data += "<br>";
		data += "email : " + user_email;
		data += "<br>";
		data += "hp : " + user_hp;
		data += "</html></body>";
		out.print(data);
	    }
} // Session tracking using hidden tag
