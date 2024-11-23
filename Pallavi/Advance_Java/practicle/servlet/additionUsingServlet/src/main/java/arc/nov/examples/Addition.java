package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")

public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Addition() {
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Addition</title>");
		out.println("<body>");
		out.println("<h1>Add Two Numbers</h1>");
		out.println("<form action='Addition' method='post'>");
		out.println("<input type='text' name='no1' placeholder='Enter any number'><br><br>");
		out.println("<input type='text' name='no2' placeholder='Enter any number'><br><br>");
		out.println("<input type='submit' value='Add'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int x = Integer.parseInt(request.getParameter("no1"));
		int y = Integer.parseInt(request.getParameter("no2"));
		int z = x+y;
		
		out.println("<html><head><title>Addition</title>");
		out.println("<body>");
		out.println("<h1>Addition is: "+z+"</h1>");
		out.println("</body>");
		out.println("</html>");
				
	}

}
