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

@WebServlet("/UpdateServlet")

public class UpdateServlet extends HttpServlet {
	
	private static String URL = "jdbc:mysql://localhost:3306/crud_db";
	private static String NAME = "root";
	private static String PASSWORD = "root";
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Update Servlet Drivers Loaded Successfully");
		}
		catch(Exception e) {
			throw new ServletException("Unable To Load Servlet");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try(Connection conn = DriverManager.getConnection(URL,NAME,PASSWORD) ){
			java.sql.Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head> <title>CRUD Application</title> </head>");
			
			out.println("<body>");
			//display data
			out.println("<table border='1'>");
			out.println("<tr> <th>ID</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> <tr>");
			
			while(rs.next()) {
				out.println("</tr>");
				out.println("<td>"+rs.getInt("id")+"</td>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("email")+"</td>");
				out.println("<td>"+rs.getString("contact")+"</td>");
				
				out.println("<td>");
				out.println("<a href='CRUDServlet?action=delete&value="+rs.getInt("id")+"'>Delete</a>");
				out.println("<a href='UpdateServlet?action=edit&value="+rs.getInt("id")+"'>Edit</a>");

				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			//Data Input
			
			out.println("<h1>Update The Details</h1>");
			out.println("<form action='UpdateServlet' method='post'>");
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("Update id: "+id);
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id=?");
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			
			while(rst.next()) {
				out.println("<input type='hidden' name='id' value='"+id+"'>");
				out.println("Name: <input type='text' name='name' value='"+rst.getString("name")+"'><br><br>");
				out.println("Email: <input type='email' name='email' value='"+rst.getString("email")+"'><br><br>");
				out.println("Contact: <input type='text' name='contact' value='"+rst.getString("contact")+"'><br><br>");
				out.println("<input type='submit' value='Confirm'>");
			}
			out.println("</form>");
			
			out.println("</body>");
			out.println("</html>");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In Update doPost");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		System.out.println("Update: "+name+", "+email+", "+contact);
		
		try(Connection conn = DriverManager.getConnection(URL,NAME,PASSWORD)){
			PreparedStatement pstmt = conn.prepareStatement("UPDATE users SET name=?, email=?, contact=? WHERE id=?");
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, contact);
			pstmt.setInt(4, id);
			
//			pstmt.executeQuery();
			pstmt.executeUpdate();
			System.out.println("Data Updated");
			
			response.sendRedirect("CRUDServlet");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
