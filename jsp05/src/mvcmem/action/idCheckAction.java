package mvcmem.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcmem.control.ActionForward;
import mvcmem.model.StudentDAO;

public class idCheckAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		StudentDAO dao = StudentDAO.getInstance();
		
		String id = request.getParameter("id");
		
		boolean check = dao.idCheck(id);
		
		return new ActionForward("/mvcmem/.jsp", false);
	}

}
