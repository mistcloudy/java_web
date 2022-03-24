package mvc.control;

public class ActionForward {

	// url 
	
	private String url;
	private boolean redirect;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ActionForward() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionForward(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
	}
	
	public ActionForward(String url, boolean redirect) {
		// TODO Auto-generated constructor stub
	this.url = url;
	this.redirect = redirect;
	}
	
	
	public boolean isRedirect() {
		return redirect;
	}
	
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}




	
}
