package arc.nov.examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 	throws ServletException, IOException {
 		response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
		//out.print("Hello From Archer.");
 
 	}
}