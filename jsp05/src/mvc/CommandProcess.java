package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandProcess {

	// Super interface of Command to request parameter
	
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable;
	
}
