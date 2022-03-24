package mvc;

import java.io.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Command - Command process class
	private Map<String, Object> commandMap = new HashMap<String, Object>();
	
	// save to Map object read to Command.properties file
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestPro(request, response);
	}

	
	// process to Request of User
	protected void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
