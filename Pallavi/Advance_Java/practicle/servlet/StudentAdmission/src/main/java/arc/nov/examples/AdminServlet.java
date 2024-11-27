package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String URL = "jdbc:mysql://localhost:3306/admission_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @Override
	public void init(ServletConfig config) throws ServletException {

		// load drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Drivers Loaded Successfully");
		} catch (Exception e) {
			throw new ServletException("Unable To Load Drivers");
		}
	}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
     // Check if the user is logged in by verifying the cookie
    /* 		Cookie[] cookies = request.getCookies();
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
     		} 
     		else {

*/
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Admin Panel</title>");
        
        out.println("<script>");
        // JavaScript to toggle visibility of sections
        out.println("function showSection(sectionId) {");
        out.println("  var sections = document.getElementsByClassName('section');");
        out.println("  for (var i = 0; i < sections.length; i++) {");
        out.println("    sections[i].style.display = 'none';");
        out.println("  }");
        out.println("  document.getElementById(sectionId).style.display = 'block';");
        out.println("}");
        out.println("</script>");
        out.println("<style>");
        // Basic CSS for layout
        out.println("body { font-family: Arial, sans-serif; }");
        out.println(".btn { margin: 5px; padding: 10px 20px; background-color: #007bff; color: white; border: none; cursor: pointer; }");
        out.println(".btn:hover { background-color: #0056b3; }");
        out.println(".section { display: none; margin-top: 20px; }");
        out.println("table { border-collapse: collapse; width: 100%; margin-top: 20px; }");
        out.println("table, th, td { border: 1px solid black; }");
        out.println("th, td { padding: 10px; text-align: left; }");
        out.println("</style>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Admin Panel</h1>");
        // Buttons to display sections
        out.println("<button class='btn'  onclick=\"showSection('docVerificationSection')\">Document Verification</button>");
        out.println("<button class='btn' onclick=\"showSection('setCutoffSection')\">Set Cutoff</button>");
        out.println("<button class='btn' onclick=\"showSection('setFeesSection')\">Set College Fees</button>");
      
        // Document Verification Section
        out.println("<div id='docVerificationSection' class='section'>");
        out.println("<h2>Document Verification</h2>");
        
        out.println("<div class='d-flex justify-content-around mt-4'>");
        out.println("<form action='AdminServlet' method='post'>");
        out.println("<button type='submit' name='action' value='degree' class='btn btn-primary'>Degree Documents</button>");
        out.println("</form>");
        out.println("<form action='AdminServlet' method='post'>");
        out.println("<button type='submit' name='action' value='diploma' class='btn btn-secondary'>Diploma Documents</button>");
        out.println("</form>");
        out.println("</div>");
        
        
        /*
        out.println("<table>");
        out.println("<tr><th>Student ID</th><th>Documents</th></tr>");

        // Fetch student IDs and document links
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT id, document_link FROM student_documents";
            PreparedStatement pstmt = connection.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int studentId = rs.getInt("id");
                String docLink = rs.getString("document_link");

                out.println("<tr>");
                out.println("<td>" + studentId + "</td>");
                out.println("<td><a href='" + docLink + "' target='_blank'>View Documents</a></td>");
                out.println("</tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<tr><td colspan='2'>Error fetching data</td></tr>");
        }

        out.println("</table>");*/
        
        
        out.println("</div>");

        // Set Cutoff Section
        out.println("<div id='setCutoffSection' class='section'>");
        out.println("<h2>Set Cutoff</h2>");
        out.println("<form action='AdminServlet' method='post'>");
        out.println("<label for='stream'>Stream:</label>");
        out.println("<input type='text' id='stream' name='stream' required><br><br>");
        out.println("<label for='cutoff'>Cutoff Marks:</label>");
        out.println("<input type='number' id='cutoff' name='cutoff' required><br><br>");
        out.println("<input type='submit' name='action' value='Set Cutoff'>");
        out.println("</form>");
        out.println("</div>");

        // Set Fees Section
        /*
        out.println("<div id='setFeesSection' class='section'>");
        out.println("<h2>Set College Fees</h2>");
        out.println("<form action='AdminServlet' method='post'>");
        out.println("<label for='category'>Category:</label>");
        out.println("<input type='text' id='category' name='category' required><br>");
        out.println("<label for='fees'>Fees Amount:</label>");
        out.println("<input type='number' id='fees' name='fees' required><br>");
        out.println("<input type='submit' name='action' value='Set Fees'>");
        out.println("</form>");
        out.println("</div>");
	*/
        out.println("</body>");
        out.println("</html>");
    }
//    }

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String action = request.getParameter("action");
	        System.out.println("action="+action);

	        // Start of HTML
	        out.println("<!DOCTYPE html>");
	        out.println("<html lang='en'>");
	        out.println("<head>");
	        out.println("<meta charset='UTF-8'>");
	        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	        out.println("<title>Admin Panel - Document Verification</title>");
	        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css'>");
	        out.println("<link rel='stylesheet' href='css/style.css'>");

	        out.println("</head>");
	        out.println("<body>");
	        out.println("<div class='container mt-5'>");


	        // Fetch and display table data based on the button clicked
	        if (action.equals("degree") || action.equals("diploma")) {
	            String query = null;
	            String title = null;

	            if ("degree".equals(action)) {
	                query = "SELECT id, twelvethMarksheet, cet,  document_status FROM degree_data";
	                title = "Degree Documents";
	            } else if ("diploma".equals(action)) {
	                query = "SELECT id, image FROM diploma_data";
	                title = "Diploma Documents";
	            }

	            
	            if (query != null) {
	                try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	                     PreparedStatement pstmt = conn.prepareStatement(query);
	                     ResultSet rs = pstmt.executeQuery()) {

	                    // Display table
	                    out.println("<div class='mt-5'>");

	                    out.println("<form action='ConfirmServlet' method='post'>"); // Start form

	                    out.println("<div class='mt-5'>");
	                    out.println("<h3>Document Verification - " + title + "</h3>");
	                    out.println("<table class='table table-bordered mt-3'>");
	                    out.println("<thead><tr><th>Student ID</th><th>Twelveth Marksheet</th><th>CET</th><th>Document Status</th><th>Approve</th></tr></thead>");
	                    out.println("<tbody>");

	                    while (rs.next()) {
	                        int studentId = rs.getInt("id");
	                        String documentPath = rs.getString("twelvethMarksheet");
	                        String cetPath = rs.getString("cet");
	                        String status = rs.getString("document_status");

	                        out.println("<tr>");
	                        out.println("<td>" + studentId + "</td>");
	                        out.println("<td><a href='" + documentPath + "' target='_blank'>View Documents</a></td>");
	                        out.println("<td><a href='" + cetPath + "' target='_blank'>View Documents</a></td>");
	                        out.println("<td>" + status + "</td>");

	                        // Checkbox for approval
	                        out.println("<td>");
	                        out.println("<input type='checkbox' name='studentIds' value='" + studentId + "' " +
	                                    ("approved".equalsIgnoreCase(status) ? "checked disabled" : "") + ">");
	                        out.println("</td>");
	                        out.println("</tr>");
	                    }

	                    out.println("</tbody>");
	                    out.println("</table>");

	                    // Submit button
	                    out.println("<button type='submit' class='btn btn-primary'>Confirm</button>");
	                    out.println("</div>");

	                    out.println("</form>"); // End form


	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    out.println("<h3 class='text-danger'>Error fetching data. Please try again later.</h3>");
	                }
	            }
	        }
	        
	        //-------- to set cut off --------------
	        
	        else if(action.equals("Set Cutoff")) {
	       
	        	String stream = request.getParameter("stream");
	        	int cutoff = Integer.parseInt(request.getParameter("cutoff"));
	        	
	        	System.out.println("Stream: "+stream+"CutOff: "+cutoff);
	        	
	        	String sql = "UPDATE streamdata SET cuttOff=? WHERE name=?";
	        	
	        	 try( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	        		 PreparedStatement pstmt = connection.prepareStatement(sql);
	        		 pstmt.setInt(1, cutoff);
	        		 pstmt.setString(2, stream);
	        		pstmt.executeUpdate();
	        		
	        		System.out.println("Data Updated Successfully");
	        		 
	        	 }
	        	 catch (Exception e) {
					e.printStackTrace();
				}
	        }
	 /*       else if(action.equals("Set Fees")) {
	        	String category = request.getParameter("category");
	        	int fees = Integer.parseInt(request.getParameter("fees"));
	        	
	        	System.out.println("category: "+category+"fees: "+fees);
	        	
	        	String sql = "INSERT INTO fess(cast,fee) VALUES(?, ?)";
	        	
	        	 try( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	        		 PreparedStatement pstmt = connection.prepareStatement(sql);
	        		 pstmt.setInt(1, fees);
	        		 pstmt.setString(2, category);
	        		 pstmt.executeUpdate();
	        		
	     
	        		System.out.println("Data Updated Successfully");
	        		 
	        	 }
	        	 catch (Exception e) {
					e.printStackTrace();
				}
	        }
	   */     	

	        // End of HTML
	        out.println("</div>");
	        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js'></script>");
	        out.println("</body>");
	        out.println("</html>");
		
		
	}
}
