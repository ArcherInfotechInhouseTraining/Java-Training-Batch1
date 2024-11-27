package arc.nov.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/AdmissionServlet")

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		maxFileSize = 1024 * 1024 * 10, // 10 MB
		maxRequestSize = 1024 * 1024 * 100 // 100 MB
)

public class AdmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

		// Check if the user is logged in by verifying the cookie
/*		Cookie[] cookies = request.getCookies();
		boolean isLoggedIn = false;
		String email = null;

		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("email".equals(cookie.getName())) {
					isLoggedIn = true;
					email = cookie.getValue(); // Get user ID from cookie
					break;
				}
			}
		}

		if (!isLoggedIn || email == null) {
			// If no cookie or invalid user ID, redirect to login page
			response.getWriter()
					.println("<script>alert('Please log in first.'); window.location='login.html';</script>");
		} else {

	*/		// Print the HTML form inside the doGet method
			out.println("<!DOCTYPE html>");
			out.println("<html lang='en'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
			out.println("<title>Student Admission</title>");
			out.println(
					"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet'>");
			 out.println("<link rel='stylesheet' href='css/style.css'>");
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

			out.println("<form action='AdmissionServlet' method='post' enctype='multipart/form-data'>");

			// Date of Birth field
			out.println("<div class='mb-3'>");
			out.println("<label for='dob' class='form-label'>Date of Birth</label>");
			out.println("<input type='date' id='dob' name='dob' class='form-control' required>");
			out.println("</div>");

			// Gender field
			out.println("<div class='mb-3'>");
			out.println("<label class='form-label'>Gender</label><br>");
			out.println("<input type='radio' id='genderMale' name='gender' value='Male' required> Male<br>");
			out.println("<input type='radio' id='genderFemale' name='gender' value='Female' required> Female<br>");
			out.println("<input type='radio' id='genderOther' name='gender' value='Other' required> Other");
			out.println("</div>");

			// Address field
			out.println("<div class='mb-3'>");
			out.println("<label for='address' class='form-label'>Address</label>");
			out.println("<textarea id='address' name='address' class='form-control' rows='3' required></textarea>");
			out.println("</div>");

			// Admission Type field
			out.println("<div class='mb-3'>");
			out.println("<label for='admissionType' class='form-label'>Admission Type</label>");
			out.println("<select id='admissionType' name='admissionType' class='form-select' required>");
			out.println("<option value='' disabled selected>Choose an option</option>");
			out.println("<option value='degree'>Degree</option>");
			out.println("<option value='diploma'>Diploma</option>");
			out.println("</select>");
			out.println("</div>");

			// Conditional Marks Inputs based on Admission Type
			out.println("<!-- Degree Marks Section -->");
			out.println("<div id='degreeMarksSection' style='display: none;'>");

			out.println("<div class='mb-3'>");
			out.println("<label for='twelvethMarks' class='form-label'>12th Marks</label>");
			out.println(
					"<input type='number' id='twelvethMarks' name='twelvethMarks' class='form-control' placeholder='Enter your 12th marks'>");
			out.println("</div>");

			out.println("<div class='mb-3'>");
			out.println("<label for='cetMarks' class='form-label'>CET Marks</label>");
			out.println(
					"<input type='number' id='cetMarks' name='cetMarks' class='form-control' placeholder='Enter your CET marks'>");
			out.println("</div>");

			// ----------File Upload ---------------
			out.println("<div class='mb-3'>");
			out.println("<label for='documents' class='form-label'>Upload Cet Marksheet (Multiple Files)</label>");
			out.println("<input type='file' id='documents' name='cet' class='form-control' multiple >");
			out.println("</div>");

			out.println("<div class='mb-3'>");
			out.println("<label for='documents' class='form-label'>Upload 12th Markssheeet (Multiple Files)</label>");
			out.println("<input type='file' id='documents' name='twelveth' class='form-control' multiple >");
			out.println("</div>");

			out.println("</div>");

			out.println("<!-- Tenth Marks Section -->");
			out.println("<div id='diplomaMarksSection' style='display: none;'>");

			out.println("<div class='mb-3'>");
			out.println("<label for='diplomaMarks' class='form-label'>Tenth Marks</label>");
			out.println(
					"<input type='number' id='diplomaMarks' name='diplomaMarks' class='form-control' placeholder='Enter your diploma marks'>");
			out.println("</div>");

			out.println("<div class='mb-3'>");
			out.println("<label for='documents' class='form-label'>Upload 10th marksheet (Multiple Files)</label>");
			out.println("<input type='file' id='documents' name='tenth' class='form-control' multiple >");
			out.println("</div>");

			out.println("</div>");

			// Stream Dropdown
			out.println("<div class='mb-3'>");
			out.println("<label for='stream' class='form-label'>Stream</label>");
			out.println("<select id='stream' name='stream' class='form-select' required>");
			out.println("<option value='' disabled selected>Choose a stream</option>");
			try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
					Statement stmt = conn.createStatement();
					ResultSet rst = stmt.executeQuery("SELECT DISTINCT name FROM streamdata")) {

				while (rst.next()) {
					String streamName = rst.getString("name");
					out.println("<option value='" + streamName + "'>" + streamName + "</option>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				out.println("<option value='' disabled>No streams available</option>");
			}
			out.println("</select>");
			out.println("</div>");

			// File Upload for Documents (multiple files)
			out.println("<!-- Document Upload -->");

			// Submit Button
			out.println("<div class='d-grid'>");
			out.println("<input type='submit' class='btn btn-primary' value='Submit'>");
			out.println("</div>");

			out.println("</form>");

			// Bootstrap JS
			out.println(
					"<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js'></script>");

			// JavaScript for Conditional Display
			out.println("<!-- JavaScript to toggle the marks section based on admission type -->");
			out.println("<script>");
			out.println("document.getElementById('admissionType').addEventListener('change', function() {");
			out.println("var admissionType = this.value;");
			out.println("if (admissionType === 'degree')");
			out.println("{document.getElementById('degreeMarksSection').style.display = 'block';");
			out.println("document.getElementById('diplomaMarksSection').style.display = 'none';");
			out.println("} else if (admissionType === 'diploma') ");
			out.println("{");
			out.println("document.getElementById('diplomaMarksSection').style.display = 'block';");
			out.println("document.getElementById('degreeMarksSection').style.display = 'none';");
			out.println("}");
			out.println(" else{");
			out.println("document.getElementById('degreeMarksSection').style.display = 'none'; ");
			out.println("document.getElementById('diplomaMarksSection').style.display = 'none';}});");
			out.println("</script>");

			out.println("</body>");
			out.println("</html>");
		}
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("In dopost");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		System.out.println("in dopost");

		// Retrieve form data
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
//	        String email = request.getParameter("email");
//	        String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String admissionType = request.getParameter("admissionType");
		String stream = request.getParameter("stream");
		String twelvethMarks = request.getParameter("twelvethMarks");
		String cetMarks = request.getParameter("cetMarks");
		String tenth_marks = request.getParameter("diplomaMarks");

		HttpSession session = request.getSession(false);
		String email = (String) session.getAttribute("email");

		System.out.println("email is: " + email);

		String uploadPath = "D:/JavaWorkspace/StudentAdmission/src/main/webapp/documents";
//	        String uploadPath = getServletContext().getRealPath("/") + "uploads";

		String query = "Select * from student WHERE email=?";
		// Establish a connection to the database
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();

			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Set up a file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

//	        	List<FileItem> items = upload.parseRequest(request);

			int sid = -1;

			if (rs.next()) {
				sid = rs.getInt("id");
			}

			File studentFolder = new File(uploadPath + "/" + sid);

			if (!studentFolder.exists()) {
				if (studentFolder.mkdirs()) {
					System.out.println("Folder created: " + studentFolder.getAbsolutePath());
				} else {
					out.println("<h3>Failed to create student folder. Please try again.</h3>");
					return;
				}
			}

			Part tenthPart = request.getPart("tenth");
			Part twelvethPart = request.getPart("twelveth");
			Part cetPart = request.getPart("cet");

			String tenthFile = tenthPart.getSubmittedFileName();
			String twelvethFile = twelvethPart.getSubmittedFileName();
			String cetFile = cetPart.getSubmittedFileName();

			String img_url1 = "documents/" + sid + "/" + tenthFile;
			String img_url2 = "documents/" + sid + "/" + twelvethFile;
			String img_url3 = "documents/" + sid + "/" + cetFile;

//		        	  img_url = "documents/" + sid + "/" + tenthFile;

			String filePath = studentFolder.getAbsolutePath() + "/" + tenthFile;
			String filePath1 = studentFolder.getAbsolutePath() + "/" + twelvethFile;
			String filePath2 = studentFolder.getAbsolutePath() + "/" + cetFile;

			// Save the uploaded file to the server

			System.out.println("File saved: " + filePath);

			/*
			 * if (fileName != null && !fileName.isEmpty()) { // Construct the correct path
			 * for storing the file img_url = "documents/" + sid + "/" + fileName; // Store
			 * relative path in DB String filePath = studentFolder.getAbsolutePath() + "/" +
			 * fileName;
			 * 
			 * // Save the uploaded file to the server tenthPart.write(filePath);
			 * System.out.println("File saved: " + filePath); }
			 */

			if (sid != -1) {

				// Check admission type and execute corresponding query
				if ("degree".equals(admissionType)) {

					twelvethPart.write(filePath1);
					cetPart.write(filePath2);

					// Define SQL queries for degree and diploma admissions
					String degreeInsertQuery = "INSERT INTO degree_data (sid,dob, gender,  address, stream, twelvethMarks, cetMarks, twelvethMarksheet, cet) VALUES (?, ?, ?, ?, ?, ?,?, ?, ?)";

					try (PreparedStatement preparedStatement = connection.prepareStatement(degreeInsertQuery)) {

						preparedStatement.setInt(1, sid);
						preparedStatement.setString(2, dob);
						preparedStatement.setString(3, gender);
						preparedStatement.setString(4, address);
						preparedStatement.setString(5, stream);
						preparedStatement.setInt(6, Integer.parseInt(twelvethMarks));
						preparedStatement.setInt(7, Integer.parseInt(cetMarks));
						preparedStatement.setString(8, img_url2);
						preparedStatement.setString(9, img_url3);

						// Execute query for degree
						int rowsAffected = preparedStatement.executeUpdate();
						if (rowsAffected > 0) {
							out.println("<h3>Degree Admission form Submitted Successfully!</h3>");
							out.println("<a href='PaymentServlet?sid=" + sid + "'>Make A Payment</a>");
							/*
							 * RequestDispatcher dispatcher =
							 * request.getRequestDispatcher("/PaymentServlet"); dispatcher.forward(request,
							 * response);
							 */
						} else {
							out.println("<h3>Something went wrong! Please try again later.</h3>");
						}
					}
				} else if ("diploma".equals(admissionType)) {

					tenthPart.write(filePath);
					String diplomaInsertQuery = "INSERT INTO diploma_data (sid,dob, gender,address, stream, tenth_marks, image) VALUES (?, ?, ?, ?, ?,?, ?)";

					try (PreparedStatement preparedStatement = connection.prepareStatement(diplomaInsertQuery)) {
						preparedStatement.setInt(1, sid);
						preparedStatement.setString(2, dob);
						preparedStatement.setString(3, gender);
						preparedStatement.setString(4, address);
						preparedStatement.setString(5, stream);
						preparedStatement.setInt(6, Integer.parseInt(tenth_marks));
//			                    preparedStatement.setString(7, img_url);

						// Execute query for diploma
						int rowsAffected = preparedStatement.executeUpdate();
						if (rowsAffected > 0) {
							out.println("<h3>Diploma Admission Form Submitted Successfully!</h3>");
						} else {
							out.println("<h3>Something went wrong! Please try again later.</h3>");
						}
					}
				} else {
					out.println("<h3>Invalid Admission Type</h3>");
				}
			} else {
				response.getWriter().println("Student not found. Please register first.");
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
