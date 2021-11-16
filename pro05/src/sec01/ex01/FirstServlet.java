package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Import Servlet 

public class FirstServlet  extends HttpServlet{//inherit Httpservlet 
   public void init() throws ServletException { //Servlet creation
      System.out.println("init Call the method");
   }

   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException { //Request processed
      System.out.println("doGet Call the method");
   } 

   public void destroy() { //Servlet disappears
      System.out.println("destroy Call the method");
   }
} // Create Servlet, Mapping Servlet 