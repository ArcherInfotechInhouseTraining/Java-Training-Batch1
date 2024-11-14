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

@WebServlet("/BookIssueServlet")

public class BookIssueServlet extends HttpServlet {

	private static String URL = "jdbc:mysql://localhost:3306/library_db";
	private static String NAME = "root";
	private static String PASSWORD = "root";

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("BookIssue Driver loaded successfully.");
		} catch (ClassNotFoundException e) {
			throw new ServletException("Unable To Load Drivers");
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

//		PreparedStatement pstmt = null;
//		Connection conn = null;

//		try {
//			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		try (Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD)) {

			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bookissue_data");

			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head> <title>Book Issue Details</title> </head>");

			out.println("<body>");
			
			//=============
			
			out.println("<h1>All Book Issue Details</h1>");
			

				out.println("<table border='1'>");
				out.println("<tr> <th>Id</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Book Name</th>  <th>ISBN No </th> <th>Issue Date</th> <th>Return Date</th> </tr>");


				System.out.println("=========");
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("<td>" + rs.getString(4) + "</td>");
					out.println("<td>" + rs.getString(5) + "</td>");
					out.println("<td>" + rs.getString(6) + "</td>");
					System.out.println("date: "+rs.getString(7));
					out.println("<td>" + rs.getString(7) + "</td>");
					out.println("<td>" + rs.getString(8) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
		
			//========
			// display user detail
			out.println("<h1>User Details</h1>");

			out.println("<form action='BookIssueServlet' method='post'>");
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("id is: " + id);

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id=?");
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();

			while (rst.next()) {
				out.println("<input type='hidden' name='id' value='" + id + "'>");
				out.println("Name: <input type='text' name='name' value='" + rst.getString("name") + "'><br><br>");
				out.println("Email: <input type='email' name='email' value='" + rst.getString("email") + "'><br><br>");
				out.println("Contact: <input type='text' name='contact' value='" + rst.getString("contact") + "'><br><br>");
				
			}
			out.println("Book Name: <input type='text' name='bookname' placeholder='Enter Book Name'><br><br>");
			out.println("ISBN: <input type='text' name='isbn' placeholder='Enter ISBN Number'><br><br>");
			out.println("Issue Date: <input type='text' name='issuedate' placeholder='Enter Issue Date'><br><br>");
			out.println("Return Date: <input type='text' name='returndate' placeholder='Enter Return Date'><br><br>");
			out.println("<input type='submit' value='IssueBook'>");
			out.println("<input type='hidden' name='issuebook' value='"+id+"'>");
			out.println("</form>");

			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String isbn = request.getParameter("isbn");
		String bookname = request.getParameter("bookname");
		String issuedate = request.getParameter("issuedate");
		String returndate = request.getParameter("returndate");
		
		try(Connection conn = DriverManager.getConnection(URL,NAME,PASSWORD) ){
			java.sql.Statement stmt = conn.createStatement();
			
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head> <title>Book Issue Details</title> </head>");

			out.println("<body>");
			PreparedStatement pstmt = null;
			
			System.out.println("Data: "+id+", " + name + ", " + email+", "+contact+", "+isbn+", "+bookname+", "+issuedate+", "+returndate);

			String sqlquery = "INSERT INTO bookissue_data(id, name,email,contact,bookname,isbn,issue_date, return_date) VALUES(?,?,?,?,?,?,?,?)";

			try {
				// data insertion
				pstmt = conn.prepareStatement(sqlquery);
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				pstmt.setString(4, contact);
				pstmt.setString(5, bookname);
				pstmt.setString(6, isbn);
				pstmt.setString(7, issuedate);
				pstmt.setString(8, returndate);
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//to display data
			out.println("<h1>All Book Issue Details</h1>");
			try {

//				java.sql.Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM bookissue_data");

				out.println("<table border='1'>");
				out.println("<tr> <th>Id</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Book Name</th>  <th>ISBN No </th> <th>Issue Date</th> <th>Return Date</th> </tr>");


				System.out.println("=========");
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("<td>" + rs.getString(4) + "</td>");
					out.println("<td>" + rs.getString(5) + "</td>");
					out.println("<td>" + rs.getString(6) + "</td>");
					System.out.println("date: "+rs.getString(7));
					out.println("<td>" + rs.getString(7) + "</td>");
					out.println("<td>" + rs.getString(8) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("<br><br><a href='MainServlet'>Go To Home Page</a>");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
					
	}

}


