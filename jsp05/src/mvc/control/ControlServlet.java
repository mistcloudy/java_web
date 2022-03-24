package mvc.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.action.Action;


public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String cmd = request.getParameter("cmd");
		
		if(cmd != null) {
		
			ActionFactory factory = ActionFactory.getInstance();
			Action action = factory.getAction(cmd);
			ActionForward af = action.execute(request, response);
			
			if(af.isRedirect()) {
				response.sendRedirect(af.getUrl());	
			} else {
				RequestDispatcher rd = request.getRequestDispatcher(af.getUrl());
				rd.forward(request, response);
				
			}
			
			// System.out.println("send to parameter!");
			
			
		} else if (cmd == null) {
			response.setContentType("text/html;charset=UTF=8"); 
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<head><title>Error</title></head>");
			out.println("<body>");
			out.println("<h4> Not correct request! </h4>");
			out.println("<h4> http://localhost:8090/jsp05/mvc/test.do?cmd=</h4>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
