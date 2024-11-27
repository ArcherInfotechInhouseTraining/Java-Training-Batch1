package arc.nov.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/AdmissionDemo")
public class AdmissionDemo extends HttpServlet {
	private static String URL = "jdbc:mysql://localhost:3306/admission_db";
	private static String USER = "root";
	private static String PASSWORD = "root";

	@Override
	public void init(ServletConfig config) throws ServletException {

		// load drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers Loaded Successfully");
		} catch (Exception e) {
			throw new ServletException("Unable To Load Drivers");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Print the HTML form inside the doGet method
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Student Admission</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head>");
		out.println("<body>");

		out.println("<div class='container mt-5'>");
		out.println("<div class='row justify-content-center'>");
		out.println("<div class='col-md-6'>");
		out.println("<div class='card shadow'>");

		// Card header
		out.println("<div class='card-header text-center bg-primary text-white'>");
		out.println("<h3>Student Admission</h3>");
		out.println("</div>");

		// Card body
		out.println("<div class='card-body'>");

		out.println("<form action='AdmissionDemo' method='post' enctype='multipart/form-data'>");


		// File Upload for Documents (multiple files)
				out.println("<!-- Document Upload -->");
				out.println("<div class='mb-3'>");
				out.println("<label for='documents' class='form-label'>Upload Pan Card (Multiple Files)</label>");
				out.println("<input type='file' id='documents' name='pancard' class='form-control' multiple required>");
				out.println("</div>");
				
				out.println("<div class='mb-3'>");
				out.println("<label for='documents' class='form-label'>Upload 12th Markssheeet (Multiple Files)</label>");
				out.println("<input type='file' id='twelveth' name='twelveth' class='form-control' multiple required>");
				out.println("</div>");
				
				out.println("<div class='mb-3'>");
				out.println("<label for='documents' class='form-label'>Upload cet marksheet (Multiple Files)</label>");
				out.println("<input type='file' id='cet' name='cet' class='form-control' multiple required>");
				out.println("</div>");

		// Submit Button
		out.println("<div class='d-grid'>");
		out.println("<input type='submit' class='btn btn-primary' value='Submit'>");
		out.println("</div>");
		out.println("</div>");
		

		out.println("</form>");

		
		
		// Bootstrap JS
		out.println(
				"<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js'></script>");

		out.println("</body>");
		out.println("</html>");
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();
        
        // Set up a file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        // Get the upload items (file fields)
        try {
           
        	List<FileItem> items = upload.parseRequest(request);
        	
        	 String uploadPath = getServletContext().getRealPath("/") + "uploads";
             
       	     System.out.println("upload path"+uploadPath);
       	  File uploadDir = new File(uploadPath);
          if (!uploadDir.exists()) {
              uploadDir.mkdir(); // Create the directory if it doesn't exist
          }
          
          for (FileItem item : items) {
              // Check if the item is a form field or file upload
              if (!item.isFormField()) {
                  String fileName = item.getName();
                  String fieldName = item.getFieldName();
                  
                  // Process the file upload
                  if (fileName != null && !fileName.isEmpty()) {
                      File file = new File(uploadPath, fileName);

//                      File file = new File(path, fileName);
                      item.write(file); // Save the file to the server
                      
                      // You can store the file information in a database or log it for reference
                      System.out.println(fieldName + ": " + fileName + " uploaded successfully.");
                  }
              }
          }
          
          // Send a success response
          PrintWriter out = response.getWriter();
          out.println("<h3>Files uploaded successfully!</h3>");
          out.println("<a href='index.html'>Go back</a>");
        }
        catch (Exception e) {
			e.printStackTrace();
		}
	}

}
