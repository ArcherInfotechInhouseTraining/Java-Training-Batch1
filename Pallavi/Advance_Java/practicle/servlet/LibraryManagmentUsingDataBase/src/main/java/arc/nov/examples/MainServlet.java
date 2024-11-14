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

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

	private static String URL = "jdbc:mysql://localhost:3306/library_db";
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

		PreparedStatement pstmt = null;
		Connection conn = null;
		

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}


		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head> <title>Book Data</title> </head>");
		out.println("<body>");

		// to display data
		out.println("<h1>All Book Details</h1>");
		try {

			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bookdata");

			out.println("<table border='1'>");
			out.println("<tr> <th>Id</th> <th>Name</th> <th>Count</th> </tr>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString("id") + "</td>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td>" + rs.getString("count") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		out.println("<h1>Enter Book Details</h1>");

		// enter book data
		out.println("<form action='MainServlet' method='post'>");
		out.println("Book Name: <input type='text' name='name' placeholder='Enter Book Name'><br><br>");
		out.println("Book Count: <input type='text' name='count' placeholder='Enter Book Count'><br><br>");
		out.println("<input type='submit' value='Add Book'><br><br>");
		//for new user registration
		out.println("<a href=RegisterNewUser>Add new User</a>");
		out.println("<form>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		int count = Integer.parseInt(request.getParameter("count"));

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head> <title>Book Data</title> </head>");
		out.println("<body>");

		PreparedStatement pstmt = null;
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Data: " + name + ", " + count);

		String sqlquery = "INSERT INTO bookdata(name, count) VALUES(?,?)";

		try {
			// data insertion
			pstmt = conn.prepareStatement(sqlquery);
			pstmt.setString(1, name);
			pstmt.setInt(2, count);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.println("</body>");
		out.println("</html>");

		response.sendRedirect("MainServlet");

	}

}
