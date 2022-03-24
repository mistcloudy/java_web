package mvcmem.control;

import mvcmem.action.Action;
import mvcmem.action.IndexAction;
import mvcmem.action.RegFormAction;

public class ActionFactory {
	private static ActionFactory factory;
	
	private ActionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized ActionFactory getInstance() {
		
		if(factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		
		switch (cmd) {
		case "index":
		action = new IndexAction();
			break;
		case "regForm":
			action = new IndexAction();
				break;
		default:
			action = new RegFormAction();
			break;
		}
		
		return action;
	}
	
	
}
