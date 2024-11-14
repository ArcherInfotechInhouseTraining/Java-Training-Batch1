package arc.nov.examples;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CRUDServlet")
public class CRUDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String URL = "jdbc:mysql://localhost:3306/crud_db";
	private static String USER = "root";
	private static String PASSWORD = "root";

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers loaded successfully");
		} catch (Exception e) {
			throw new ServletException("Unable to load drivers");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		
		if("delete".equals(action)) {
			System.out.println("in delete");
			doDelete(request,response);
		}

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head> <title>Registration</title> </head>");
		out.println("<body>");

		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// to read the data
		try {
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");

			out.println("<table border='1'>");
			out.println("<tr> <th>ID</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getInt("id") + "</td>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td>" + rs.getString("email") + "</td>");
				out.println("<td>" + rs.getString("contact") + "</td>");
				
				//for delete
				out.println("<td> <a href='CRUDServlet?action=delete&id="+rs.getInt("id")+"'>Delete |");
				out.println("</a>");
				
				//for update
				out.println(" <a href='UpdateServlet?action=edit&id="+rs.getInt("id")+"'>Edit</a></td>");

				
				out.println("</tr>");
			}
			out.println("</table><br><br>");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// to insert data
		out.println("<form action='CRUDServlet' method='post'>");
		out.println("Name: <input type='text' name='name' placeholder='Enter Your Name'><br><br>");
		out.println("Email: <input type='email' name='email' placeholder='Enter Your Email'><br><br>");
		out.println("Contact: <input type='text' name='contact' placeholder='Enter Your Contact'><br><br>");
		out.println("<input type='submit' value='Register'>");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD)){
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM users WHERE id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException("Data Deletion Error");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("In CRUD do");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		PreparedStatement preparedstatement = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(name + "," + email + "," + contact);
		String sqlquery = "insert into users(name,email,contact)values(?,?,?)";
		try {
			// for data insertion
			preparedstatement = con.prepareStatement(sqlquery);
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, email);
			preparedstatement.setString(3, contact);
			preparedstatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("CRUDServlet");

	}

}
