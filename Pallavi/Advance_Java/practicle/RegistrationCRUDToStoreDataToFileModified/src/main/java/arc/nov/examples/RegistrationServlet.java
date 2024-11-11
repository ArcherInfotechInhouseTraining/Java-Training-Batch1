package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")

public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String option = request.getParameter("action");
		System.out.println("Option: "+option);
		
		// get the path to store the file
		String filePath = getServletContext().getRealPath("WEB-INF/Registration.txt");
		System.out.println("Path: "+filePath);
		
		if(option.equals("create")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			
			writeToFile(filePath,name,email,contact);
			displayRecords(filePath,out);
		}
		else if(option.equals("update")) {
			System.out.println("in update");
			String oldemail = request.getParameter("oldemail");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			String newdata = name+", "+email+", "+contact;
			updateWrite(filePath, newdata, oldemail);
			displayRecords(filePath, out);
		}
		else if(option.equals("search")) {
			String searchtearm = request.getParameter("searchtearm");
			searchRecord(out,filePath,searchtearm);
		}
		else if(option.equals("delete")) {
			String email = request.getParameter("email");
			deleteRecord(filePath, email);
			displayRecords(filePath, out);
		}
	}


	private void deleteRecord(String filePath, String email) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<String> records = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String line = "";
			
			while((line=br.readLine()) != null) {
				String fields[] = line.split(",");
				if(!fields[1].equals(email)) {
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


	private void searchRecord(PrintWriter out, String filePath, String searchtearm) throws FileNotFoundException, IOException {
		

		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head><title>All Records</title></head>");
		out.println("<body>");
		out.println("<h1> search option </h1>");
		
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");
		
		int totalrecords = 0;
	
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String line = "";
			
			while( (line=br.readLine()) != null) {
				if(line.toLowerCase().contains(searchtearm.toLowerCase())) {
					totalrecords++;
					String []fields = line.split(",");
					out.println("<tr>");
					for(String field : fields) {
						out.println("<td>"+field+"</td>");
					}
					out.println("<td>");
					//delete button
					out.println("<form action='RegistrationServlet' method='post' style='display:inline';>");
					out.println("<input type='hidden' name='action' value='delete'>");
					out.println("<input type='hidden' name='email' value='"+fields[1]+"'>");
					out.println("<input type='submit' value='Delete'>");
					out.println("</form>");
					//update button
					out.println("<form action='RegistrationServlet' method='post' style='display:inline';>");
					out.println("<input type='hidden' name='action' value='update'>");
					out.println("<input type='hidden' name='data' value='"+line+"'>");
					out.println("<input type='submit' value='Update'>");
					out.println("</form>");
					out.println("</td>");
					out.println("</tr>");
				}
			}
		}
		
		out.println("</table>");
		out.println("<p>"+totalrecords+"</p>");
		out.println("</body>");
		out.println("</html>");
		
	}


	private void updateWrite(String filePath, String newdata, String oldemail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		List<String> records = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			
			String line = "";
			
			while( (line=br.readLine()) != null) {
				if(line.split(",")[1].equals(oldemail)) {
					records.add(newdata);
				}
				else {
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


	private void displayRecords(String filePath, PrintWriter out) throws FileNotFoundException, IOException {
		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head><title>All Records</title></head>");
		out.println("<body>");
		out.println("<h1> All Records </h1>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");
		
		int totalrecords = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = "";
			
			while( (line = br.readLine()) != null ) {
				totalrecords++;
				String[] fields = line.split(",");
				
				out.println("<tr>");
				for(String field : fields) {
					out.println("<td>"+field+"</td>");
				}
				
				
				out.println("<td>");
				//for updation button
				out.println("<button onclick=\"showUpdateForm('"+fields[0]+"','"+fields[1]+"','"+fields[2]+"')\">Update</button>");
				
				//delete button
				out.println("<form action='RegistrationServlet' method='post' style='display:inline';>");
				out.println("<input type='hidden' name='action' value='delete'>");
				out.println("<input type='hidden' name='email' value='"+fields[1]+"'>");
				out.println("<input type='submit' value='Delete'>");
				out.println("</form>");
				out.println("</td>");
				
				out.println("</tr>");
			}
		}
		out.println("</table>");
		out.println("<p>Totalrecords are: "+totalrecords+"</p>");
		
		// to search record
		out.println("<h1>Search Record</h1>");
		out.println("<form action='RegistrationServlet' method='post'>");
		out.println("<input type='hidden' name='action' value='search'>");
		out.println("Search:<input type='text' name='searchtearm' placeholder='Enter Search Tearm'>");
		out.println("<input type='submit' value='search'>");
		out.println("</form>");
		
		// For Update - hidden by-default
		out.println("<div id='updateForm' style='display:none;'>");
		out.println("<h1>Update Records</h1>");
		out.println("<form action='RegistrationServlet' method='post'>");
		out.println("<input type='hidden' name='action' value='update'>");
		out.println("<input type='hidden' name='oldemail' id='oldemail'>");
		out.println("Name: <input type='text' name='name' id='updatename'><br><br>");
		out.println("Email: <input type='email' name='email' id='updateemail'><br><br>");
		out.println("Contact: <input type='text' name='contact' id='updatecontact'><br><br>");
		out.println("<input type='submit' value='update'>");
		out.println("</form>");
		out.println("</div>");
		
		// script for update operation
		out.println("<script type='text/javascript'>");
		out.println("function showUpdateForm(name,email,contact){");
		out.println("alert('Update Started...!!!');");
		out.println(" document.getElementById('updateForm').style.display='block'; ");
		out.println(" document.getElementById('updatename').value=name; ");
		out.println(" document.getElementById('updatecontact').value=contact; ");
		out.println(" document.getElementById('updateemail').value=email; ");
		out.println(" document.getElementById('oldemail').value=email; ");
		out.println("}");
		out.println("</script>");
		
		out.println("<br><a href='index.html'>Register Another Name</a>");
		out.println("</body>");
		out.println("</html>");
		
	}


	private void writeToFile(String filePath, String name, String email, String contact) throws IOException {
		
		try(FileWriter fw = new FileWriter(filePath, true) ){
			fw.write(name+","+email+","+contact+"\n");
		}
		
	}


	

}
