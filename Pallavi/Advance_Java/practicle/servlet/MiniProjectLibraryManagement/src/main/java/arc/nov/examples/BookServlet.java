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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookServlet")

public class BookServlet extends HttpServlet {

	private static String URL = "jdbc:mysql://localhost:3306/book_db";
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
			out.println("<tr> <th>Id</th> <th>Name</th> <th>Isbn</th> <th>Author</th> <th>Publication</th> <th>Quantity</th> <th>Aval_Quantity</th> </tr>");

			while (rs.next()) {
				out.println("<tr>");
//				out.println("<td>" + rs.getString("id") + "</td>");
//				out.println("<td>" + rs.getString("name") + "</td>");

				out.println("<td>" + rs.getString(1) + "</td>");
				out.println("<td>" + rs.getString(2) + "</td>");
				out.println("<td>" + rs.getString(3) + "</td>");
				out.println("<td>" + rs.getString(4) + "</td>");
				out.println("<td>" + rs.getString(5) + "</td>");
				out.println("<td>" + rs.getString(6) + "</td>");
				out.println("<td>" + rs.getInt(7) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		out.println("<h1>Enter Book Details</h1>");

		// enter book data
		out.println("<form action='BookServlet' method='post'>");
		out.println("Book Name: <input type='text' name='name' placeholder='Enter Book Name'><br><br>");
		out.println("Book ISBN: <input type='text' name='isbn' placeholder='Enter ISBN Number'><br><br>");
		out.println("Author Name: <input type='text' name='author' placeholder='Enter Book Count'><br><br>");
		out.println("Publication: <input type='text' name='publication' placeholder='Enter Book Name'><br><br>");
		out.println("Book Quantity: <input type='text' name='quantity' placeholder='Enter Total Quantity '><br><br>");
		out.println("Available Quantity: <input type='text' name='available_quantity' placeholder='Enter Total Quantity' ><br><br>");
		out.println("<input type='submit' value='Add Book'><br><br>");

		// for new user registration
		out.println("<a href=UserServlet>Add New User</a><br><br>");
		out.println("<a href=BookIssueServlet>Issue Book</a>");
		out.println("<form>");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String isbn = request.getParameter("isbn");
		String author = request.getParameter("author");
		String publication = request.getParameter("publication");
		String quantity = request.getParameter("quantity");
		int available_quantity = Integer.parseInt(request.getParameter("available_quantity"));

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

		// System.out.println("Data: " + name + ", " + count);

		String sqlquery = "INSERT INTO bookdata(bk_name, isbn, author, publication, quantity, available_quantity) VALUES(?,?,?,?,?,?)";

		try {
			// data insertion
			pstmt = conn.prepareStatement(sqlquery);
			pstmt.setString(1, name);
			pstmt.setString(2, isbn);
			pstmt.setString(3, author);
			pstmt.setString(4, publication);
			pstmt.setString(5, quantity);
			pstmt.setInt(6, available_quantity);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.println("</body>");
		out.println("</html>");

		response.sendRedirect("BookServlet");
	}

}
