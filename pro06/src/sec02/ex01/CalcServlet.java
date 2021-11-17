package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static float USD_RATE = 1124.70F;
	private static float JPY_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		String command = request.getParameter("command"); // Request to perform
		String won = request.getParameter("won"); // won to convert
		String operator = request.getParameter("operator"); // Type of foreign currency to be convert

		if (command != null && command.equals("calculate")) { // Return command 
			String result = calculate(Float.parseFloat(won), operator);
			pw.print("<html><font size=10>Transformation Result</font><br>");
			pw.print("<html><font size=10>" + result + "</font><br>");
			pw.print("<a href='/pro06/calc'>Exchange rate calculator </a>");
			return;
		} 

		pw.print("<html><title>Exchange rate calculator</title>");
		pw.print("<font size=5>Exchange rate calculator</font><br>");
		pw.print("<form  name='frmCalc' method='get'  action='/pro06/calc'  />  ");
		pw.print("won: <input type='text' name='won' size=10  />  ");
		pw.print("<select name='operator' >");
		pw.print("<option value='dollar'>dollar</option>");
		pw.print("<option value='en'>en</option>");
		pw.print("<option value='wian'>wian</option>");
		pw.print("<option value='pound'>pound</option>");
		pw.print("<option value='euro'>euro</option>");
		pw.print("</select>");
		pw.print("<input type='hidden' name='command' value='calculate'  />  "); // Use the calculate function & Use hidden tag
		pw.println("<input type='submit' value='Transformation'  />"); 
		pw.println("</form>");
		pw.print("</html>");
		pw.close();
	}

	private static String calculate(float won, String operator) { // Calculator function
		String result = null;
		if (operator.equals("dollar")) {
			result = String.format("%.6f", won / USD_RATE);
		} else if (operator.equals("en")) {
			result = String.format("%.6f", won / JPY_RATE);
		} else if (operator.equals("wian")) {
			result = String.format("%.6f", won / CNY_RATE);
		} else if (operator.equals("pound")) {
			result = String.format("%.6f", won / GBP_RATE);
		} else if (operator.equals("euro")) {
			result = String.format("%.6f", won / EUR_RATE);
		}
		return result;
	}
} // Servlet response using an exchange rate calculator