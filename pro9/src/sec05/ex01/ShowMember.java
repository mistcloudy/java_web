package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowMember
 */
@WebServlet("/show")
public class ShowMember extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String id ="", pwd="" ;
        Boolean isLogon=false;
        HttpSession session =  request.getSession(false);			

        if( session != null){
	    isLogon=(Boolean)session.getAttribute("isLogon");
           if(isLogon==true){ 
	        id = (String)session.getAttribute("login4.id");
	        pwd = (String)session.getAttribute("login4.pwd");
   	        out.print("<html><body>");
	        out.print("id: " + id+"<br>");
	        out.print("password: " + pwd+"<br>");
	        out.print("</body></html>");
	    }else{
	       response.sendRedirect("/pro9/login4.html");
	    }
         }else{
            response.sendRedirect("/pro9/login4.html");
        }
	} 
} // Log in using a session
