package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//get the data from request object
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		// Create a single string with all values separated by comma and ends with newline character
		
		String data = name+", "+email+", "+contact+"\n";
		
		
		
		
		//get the path to store the file
		String filePath = getServletContext().getRealPath("WEB-INF\\Registration.txt");
//		String filePath = getServletContext().getRealPath("D:\\JavaWorkspace\\registerAndDisplayInTableForm\\src\\main\\webapp\\WEB-INF\\Registration.txt");
		
		System.out.println("Data is: "+data);
		System.out.println("Path"+filePath);
		//create a file and keep apending
		
		try(FileWriter fw = new FileWriter(filePath, true)){
			fw.write(data);
		}
		
		//read all the records
		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Registration Data</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>All Registration Records</h1>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> </tr>");
		int totalRecords = 0;
		
		try( BufferedReader br = new BufferedReader(new FileReader(filePath)) ){
			String line = "";
			
			while( ( line=br.readLine() ) != null  ) {
				totalRecords++;

				String[]fields = line.split(",");
				out.println("<tr>");
				for(String field : fields) {
					out.println("<td>"+field+"</td>");
					
				}
				out.println("</tr>");
			}
		}
		out.println("</table>");
		out.println("<p>Total Records: "+totalRecords+"</p>");
		out.println("<br><a href='index.html'> Register Another Name</a>");
		out.println("<br><a href='sortdata.html'> Sort Data</a>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
