package arc.nov.examples;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Servlet Annotation
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/college_db"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "password"; 

    // doGet method
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
     // Check if the user is logged in by verifying the cookie
     		Cookie[] cookies = request.getCookies();
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
     			
//     			HttpSession session = request.getSession();
////                session.setAttribute("userName", userName);
//                session.setAttribute("email", email);
     		

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL Query to fetch all profiles
            String sql = "SELECT * FROM user_profiles WHERE email=?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Generate HTML response
            out.println("<html>");
            out.println("<head><title>User Profiles</title></head>");
            out.println("<body>");
            out.println("<h1>User Profiles</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th><th>Address</th></tr>");

            // Loop through the result set and display data
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("phone") + "</td>");
                out.println("<td>" + rs.getString("address") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body></html>");

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            out.close();
        }
    }
    }
}

