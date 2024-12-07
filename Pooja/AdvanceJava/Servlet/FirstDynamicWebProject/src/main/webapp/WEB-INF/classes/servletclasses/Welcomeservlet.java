package servletclasses;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcomeservlet extends HttpServlet
 {
 	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
 		response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
 		out.println("<html><body>");
 		out.println("<h1>Welcome to the Servlet World!</h1>");
 		out.println("</body></html>");
 	}
}