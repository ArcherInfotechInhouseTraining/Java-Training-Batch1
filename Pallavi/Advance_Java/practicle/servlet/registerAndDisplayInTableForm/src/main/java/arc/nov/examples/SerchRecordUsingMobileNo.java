package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerchRecordUsingMobileNo
 */
@WebServlet("/SerchRecordUsingMobileNo")
public class SerchRecordUsingMobileNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String filePath = getServletContext().getRealPath("WEB-INF\\Registration.txt");
		
		out.println("<!Doctype html>");
		out.println("<html>");
		
		out.println("<head> <title>Find Records</title> </head>");
		
		out.println("<body>");
		out.println("<h1> Data </h1>");
		
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> </tr>");
		
		String mb = request.getParameter("mobile");
		try( BufferedReader br = new BufferedReader(new FileReader(filePath)) ){
			String line = "";
			int flg=0;
			
			while( ( line=br.readLine() ) != null  ) {
				
				String []fields = line.split(",");
				
				out.println("<tr>");
				for(String field : fields) {
					if(field.contains(mb)) {
						flg=1;
						for(String f : fields) {
							out.println("<td>"+f+"</td>");
						}
					}
				}
				
				out.println("</tr>");
			}
			if(flg==0) {
				out.println("<td> Record Not Present </td>");
			}
		}
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
