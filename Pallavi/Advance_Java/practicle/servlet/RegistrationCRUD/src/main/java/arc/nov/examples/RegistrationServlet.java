package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String option = request.getParameter("action");
		System.out.println("Option is: "+option);

		// get the path to store the file
		String filePath = getServletContext().getRealPath("WEB-INF\\Registration.txt");
//		System.out.print(filePath);

		if (option.equals("create")) {

			// get the data from request object
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");

			writeToFile(filePath, name, email, contact);
			displayRecords(out, filePath);
		}
		else if(option.equals("delete")) {
			String email = request.getParameter("email");
			deleteRecords(email, filePath);
			displayRecords(out, filePath);
		}
		else if(option.equals("update")) {
			
			System.out.println("In Update");
			
			String data = request.getParameter("data");
			updateRecord(out, data);
		}
		else if(option.equals("updateconfirm")) {
			
			String olddata = request.getParameter("data");
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			
			String newdata = name+", "+email+", "+contact;
			
			updateWrite(filePath, olddata, newdata);
			displayRecords(out, filePath);
		}
	}

	private void updateWrite(String filePath, String olddata, String newdata) throws FileNotFoundException, IOException {
		
		List<String> records = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String line = "";
			
			while( (line=br.readLine()) != null ) {
				
				if( line.equals(olddata) ){
					records.add(newdata);
				}
				else {
					records.add(line);
				}
			}
		}
		
		try(FileWriter fw = new FileWriter(filePath)){
			for(String record : records) {
				fw.write(record+"\n");
			}
		}
	}

	private void updateRecord(PrintWriter out, String data) {
		
		String []record = data.split(",");
		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>updating...</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Update Records</h1>");
		
		out.println("<form action='RegistrationServlet' method='post'>");
		out.println("Name:<input type='hidden' name='action' value='updateconfirm'>");
		out.println("Name:<input type='hidden' name='data' value='"+data+"'>");
		out.println("Name:<input type='text' name='name' value='"+record[0]+"'><br><br>");
		out.println("Email:<input type='email' name='email' value='"+record[1]+"'><br><br>");
		out.println("Contact:<input type='text' name='contact' value='"+record[2]+"'><br><br>");
		out.println("<input type='submit' value='Update'>");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	private void deleteRecords(String email, String filePath) throws FileNotFoundException, IOException {
		
		System.out.println("In delete records");
		List<String> records = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = "";
			
			while ( (line = br.readLine()) != null ) {
				String []fields = line.split(",");
				
				if(!fields[1].equals(email)) {
					records.add(line);
				}
			}
			
			try(FileWriter fw = new FileWriter(filePath)){
				for(String record : records) {
					fw.write(record+"\n");
				}
			}
		}
		
	}

	private void displayRecords(PrintWriter out, String filePath) throws FileNotFoundException, IOException {

		// read all the records

		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Registration Data</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>All Registration Records</h1>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");
		int totalRecords = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";

			while ((line = br.readLine()) != null) {
				totalRecords++;

				String[] fields = line.split(",");
				out.println("<tr>");
				for (String field : fields) {
					out.println("<td>" + field + "</td>");
				}
				out.println("<td>");
				
				out.println("<form action='RegistrationServlet' method='post' style='display:inline;'>");
				out.println("<input type='hidden' name='action' value='delete'>");
				out.println("<input type='hidden' name='email' value='"+fields[1]+"'>");
				out.println("<input type='submit' value='Delete'>");
				out.println("</form>");
				
				out.println("<form action='RegistrationServlet' method='post' style='display:inline;'>");
				out.println("<input type='hidden' name='action' value='update'>");
				out.println("<input type='hidden' name='data' value='"+line+"'>");
				out.println("<input type='submit' value='Update'>");
				out.println("</form>");
				
				out.println("</td>");
				out.println("</tr>");
			}
		}
		out.println("</table>");
		out.println("<p>Total Records: " + totalRecords + "</p>");
		out.println("<br><a href='index.html'> Register Another Name</a>");
		out.println("<br><a href='sortdata.html'> Sort Data</a>");

		out.println("</body>");
		out.println("</html>");

	}

	private void writeToFile(String filePath, String name, String email, String contact) throws IOException {
		
		try(FileWriter fw = new FileWriter(filePath, true)){
			fw.write(name+", "+email+", "+contact+"\n");
		}

	}

}
