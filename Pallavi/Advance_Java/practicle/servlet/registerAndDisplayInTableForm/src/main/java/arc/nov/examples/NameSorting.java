package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameSorting
 */
@WebServlet("/NameSorting")
public class NameSorting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<String> list = new ArrayList<>();
		
		String filePath = getServletContext().getRealPath("WEB-INF\\Registration.txt");
		
		
		
		out.println("<!Doctype html>");
		out.println("<html>");
		
		out.println("<head> <title>Sorted Records</title> </head>");
		
		out.println("<body >");
		out.println("<h1 style='text-align:center'> Sorted Records </h1>");
		
		try(BufferedReader br = new BufferedReader( new FileReader(filePath))){
			
			String line = "";
		
		while( ( line=br.readLine() ) != null  ) {
			System.out.println("Data inserted");
			System.out.println("line: "+line);
			list.add(line);
		}
	}
		
		Collections.sort(list);
		
		for(String s: list) {
			out.println("<p>"+s+"</p>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

}
