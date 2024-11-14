package arc.nov.examples;

import java.beans.Statement;
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterNewUser")
public class RegisterNewUser extends HttpServlet {
	
	private static String URL = "jdbc:mysql://localhost:3306/library_db";
	private static String USER = "root";
	private static String PASSWORD = "root";
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("User Driver loaded successfully.");
		} catch (ClassNotFoundException e) {
			throw new ServletException("Unable To Load Drivers");
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head> <title>New User Registration</title> </head>");

		out.println("<body>");
		
		//display users
		out.println("<h1>All Users Details</h1>");
		try {

			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");

			out.println("<table border='1'>");
			out.println("<tr> <th>Id</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString("id") + "</td>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td>" + rs.getString("email") + "</td>");
				out.println("<td>" + rs.getString("contact") + "</td>");
				out.println("<td>");
				out.println("<a href='BookIssueServlet?action=bookissue&id="+rs.getString("id")+"'>Issue Book</a>");
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table><br><br><br>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// enter new user
		out.println("<h1>Add new User Details</h1>");
		out.println("<form action='RegisterNewUser' method='post'>");
		out.println("Name: <input type='text' name='name' placeholder='Enter User Name'><br><br>");
		out.println("Email: <input type='email' name='email' placeholder='Enter User Email'><br><br>");
		out.println("Contact: <input type='text' name='contact' placeholder='Enter User Contact'><br><br>");
		out.println("<input type='submit' value='Add User'><br><br>");
		out.println("<form>");
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head> <title>User Data</title> </head>");
		out.println("<body>");

		PreparedStatement pstmt = null;
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Data: " + name + ", " + email+", "+contact);

		String sqlquery = "INSERT INTO users(name, email, contact) VALUES(?,?,?)";

		try {
			// data insertion
			pstmt = conn.prepareStatement(sqlquery);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, contact);
			System.out.println("Data inserted successfully");
			pstmt.executeUpdate();
//			pstmt.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("RegisterNewUser");

		out.println("</body>");
		out.println("</html>");

		

	}

}
