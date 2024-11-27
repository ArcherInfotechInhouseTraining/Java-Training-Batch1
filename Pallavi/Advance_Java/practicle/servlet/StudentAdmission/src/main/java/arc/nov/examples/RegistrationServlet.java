package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	private static String URL = "jdbc:mysql://localhost:3306/admission_db";
	private static String USER = "root";
	private static String PASSWORD = "root";

	
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        System.out.println("in dopost");

        // Collect form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String contact = request.getParameter("contact");
        String role = request.getParameter("role");

        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {

            // Establish the connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // Insert data into the appropriate table based on the role
            String sql;
            if ("student".equalsIgnoreCase(role)) {
                sql = "INSERT INTO student (name, password, email, contact) VALUES (?, ?, ?, ?)";
            } else if ("admin".equalsIgnoreCase(role)) {
                sql = "INSERT INTO admin (name,  password, email, contact) VALUES (?, ?, ?, ?)";
            } else {
                throw new IllegalArgumentException("Invalid role specified");
            }

            // Prepare the statement
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password); // In production, hash the password before storing
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, contact);

            // Execute the query
            int rowsInserted = preparedStatement.executeUpdate();

            // Provide feedback to the user
            if (rowsInserted > 0) {
                out.println("<h3>Registration successful!</h3>");
                response.sendRedirect("LoginPageServlet");
                
                // Simple authentication logic
             // Forward the request to WelcomeServlet
//                request.setAttribute("origin", "You Can Login Now!");
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginPageServlet");
//                dispatcher.forward(request, response);
                
            } else {
                out.println("<h3>Registration failed. Please try again.</h3>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	}

}
