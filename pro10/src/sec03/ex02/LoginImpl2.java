package sec03.ex02;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Loginlmpl
 *
 */
@WebListener
public class LoginImpl2 implements HttpSessionListener {
	String user_id;
	String user_pw;
	static int total_user = 0;

	public LoginImpl2() {
	}

	public LoginImpl2(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Create session");
		++total_user;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Disappeare session");
		--total_user;
	}
} // Displaying the number of users using HttpSessionListener
