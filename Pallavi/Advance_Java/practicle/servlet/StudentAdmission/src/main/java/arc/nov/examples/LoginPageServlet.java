package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginPageServlet")
public class LoginPageServlet extends HttpServlet {
	
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
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        
//		        String origin = (String) request.getAttribute("origin");
//		        response.getWriter().println("<h1>Hello! , " + origin + "</h1>");

		        // Write the HTML content
		        out.println("<!DOCTYPE html>");
		        out.println("<html lang='en'>");
		        out.println("<head>");
		        out.println("    <meta charset='UTF-8'>");
		        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		        out.println("    <title>Login</title>");
		        out.println("    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		        out.println("	 <link rel='stylesheet' href='css/style.css'>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("    <div class='container mt-5'>");
		        out.println("        <div class='row justify-content-center'>");
		        out.println("            <div class='col-md-6'>");
		        out.println("                <div class='card shadow'>");
		        out.println("                    <div class='card-header text-center bg-primary text-white'>");
		        out.println("                        <h3>Login</h3>");
		        out.println("                    </div>");
		        out.println("                    <div class='card-body'>");
		        out.println("                        <form action='LoginPageServlet' method='post'>");
		        out.println("                            <div class='mb-3'>");
		        out.println("                                <label for='email' class='form-label'>Email</label>");
		        out.println("                                <input type='email' id='email' name='email' class='form-control' placeholder='Enter your email' required>");
		        out.println("                            </div>");
		        out.println("                            <div class='mb-3'>");
		        out.println("                                <label for='password' class='form-label'>Password</label>");
		        out.println("                                <input type='password' id='password' name='password' class='form-control' placeholder='Enter your password' required>");
		        out.println("                            </div>");
		        out.println("                            <div class='mb-3'>");
		        out.println("                                <label for='role' class='form-label'>Login As</label>");
		        out.println("                                <select id='role' name='role' class='form-select' required>");
		        out.println("                                    <option value='' disabled selected>Choose an option</option>");
		        out.println("                                    <option value='user'>User</option>");
		        out.println("                                    <option value='admin'>Admin</option>");
		        out.println("                                </select>");
		        out.println("                            </div>");
		        out.println("                            <div class='d-grid'>");
		        out.println("                                <button type='submit' class='btn btn-primary'>Login</button>");
		        out.println("                            </div>");
		        out.println("                        </form>");
		        out.println("                    </div>");
		        out.println("                    <div class='card-footer text-center'>");
		        out.println("                        <small>Don't have an account? <a href='register.html' class='text-primary'>Register here</a></small>");
		        out.println("                    </div>");
		        out.println("                </div>");
		        out.println("            </div>");
		        out.println("        </div>");
		        out.println("    </div>");
		        out.println("    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js'></script>");
		        out.println("</body>");
		        out.println("</html>");
		        
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In doPost");
		    	// Set response content type
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();

		        // Collect form data
		        String email = request.getParameter("email");
		        String password = request.getParameter("password");
		        String role = request.getParameter("role");
		        
		        // httpSession
		        
		        
		        System.out.println("email: "+email+"pass: "+password+"role: "+role);


		        PreparedStatement preparedStatement = null;
		        ResultSet resultSet = null;

		        try( Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

		            // Query based on the selected role
		            String sql;
		            String idquery=null;
		            if ("admin".equalsIgnoreCase(role)) {
		                sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
		                
		            } else if ("user".equalsIgnoreCase(role)) {
		                sql = "SELECT * FROM student WHERE email = ? AND password = ?";
		                
		            } else {
		                throw new IllegalArgumentException("Invalid role specified");
		            }

		            System.out.println("sql: "+sql);
		            // Prepare the statement
		            preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setString(1, email);
		            preparedStatement.setString(2, password); // Password should be hashed in production
		            // Execute the query
		            resultSet = preparedStatement.executeQuery();
		            
		           
		           
		                // Create a session
		                HttpSession session = request.getSession();
//		                session.setAttribute("userName", userName);
		                session.setAttribute("role", role);
		                session.setAttribute("email", email);
		             // Set session timeout (optional, in seconds)
		                session.setMaxInactiveInterval(30 * 60); // 30 minutes
		                
		                Cookie userCookie = new Cookie("userEmail", String.valueOf(email));
		                userCookie.setMaxAge(60*60);// Cookie valid for 1 hour
		                response.addCookie(userCookie);
		                
		                
		                

		                // Check if a record was found
			            if (resultSet.next()) {
			                // Login successful
			                String userName = resultSet.getString("name");
			                // Redirect to the appropriate dashboard
			                if ("admin".equalsIgnoreCase(role)) {
			                	System.out.println("in if");
			                    response.sendRedirect("AdminServlet");
			                } else {
			                	System.out.println("in else");
			                    response.sendRedirect("AdmissionServlet");
			                }
		               
		            } else {
		                // Login failed
		                out.println("<h3>Invalid email or password. Please try again.</h3>");
		                RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
		                dispatcher.include(request, response);
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		            out.println("<h3>Error: " + e.getMessage() + "</h3>");
		        } finally {
		            // Close resources
		            try {
		                if (resultSet != null) resultSet.close();
		                if (preparedStatement != null) preparedStatement.close();
		               
		            } 
		            catch (Exception ex) {
		                ex.printStackTrace();
		            }
		       }
	}

}
