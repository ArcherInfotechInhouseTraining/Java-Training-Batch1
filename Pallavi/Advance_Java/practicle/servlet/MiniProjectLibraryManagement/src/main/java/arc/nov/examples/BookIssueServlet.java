package arc.nov.examples;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookIssueServlet
 */
@WebServlet("/BookIssueServlet")
public class BookIssueServlet extends HttpServlet {
	
	private static String URL = "jdbc:mysql://localhost:3306/book_db";
	private static String USER = "root";
	private static String PASSWORD = "root";
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		// load drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("BookIssue Drivers Loaded Successfully");
		} catch (Exception e) {
			throw new ServletException("Unable To Load Drivers");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		System.out.println("In doGet");
		
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
		//out.println("<h1>All Users Details</h1>");
		try {
			
			java.sql.Statement stmt = conn.createStatement();
			ResultSet rst = stmt.executeQuery("SELECT * FROM users");
			
			//for user table
			out.println("<h1>User Details</h1>");
			out.println("<table border='1'>");
			out.println("<tr> <th>Id</th> <th>Name</th> <th>Email</th> <th>Contact</th></tr>");
			
			while (rst.next()) {
				out.println("<tr>");
//				out.println("<td><span id='userid'>" + rst.getString("id") + "</span></td>");

//				out.println("<td><a href='javascript:void(0)' onclick='userIdFun("+rst.getInt("id")+")' > " + rst.getInt("id") + "</a></td>");
				out.println("<td><a href='javascript:void(0)' onclick='userIdFun( "+rst.getInt("id")+", \""+rst.getString("name")+"\")' > " + rst.getInt("id") + "</a></td>");
				
				out.println("<td>" + rst.getString("name") + "</td>");
				out.println("<td>" + rst.getString("email") + "</td>");
				out.println("<td>" + rst.getString("contact") + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table><br><br>");
			
			//for book table

			ResultSet rs = stmt.executeQuery("SELECT * FROM bookdata");
			
			out.println("<h1>Book Details</h1>");
			out.println("<table border='1'>");
			out.println("<tr><th>Book Id</th> <th>Book Name</th> <th>Isbn</th> <th>Author</th> <th>Publication</th> <th>Quantity</th> <th>Aval_Quantity</th></tr>");
			
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td><a href='javascript:void(0)' onclick='bookIdFun(" + rs.getInt(1) + ", \"" + rs.getString(2) + "\", \"" + rs.getInt(7) + "\")'> " + rs.getInt(1) + "</a></td>");

//				out.println("<td><a href='javascript:void(0)' onclick='bookIdFun("+rs.getInt(1)+ ", \"" +rs.getString(2) + "\", \"" +rs.getInt(7)+ "\")' > " + rs.getInt(1) + "</a></td>");
				out.println("<td>" + rs.getString(2) + "</td>");
				out.println("<td>" + rs.getString(3) + "</td>");
				out.println("<td>" + rs.getString(4) + "</td>");
				out.println("<td>" + rs.getString(5) + "</td>");
				out.println("<td>" + rs.getString(6) + "</td>");
				out.println("<td>" + rs.getInt(7) + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			//for book issue data
			out.println("<h1>Book Issue Data</h1>");
			out.print("<br><form action='BookIssueServlet' method='post'>");
			out.println("<br><br>User Id: <input type='text' name='userid' id='uid' >");
			out.println("<br><br>User Name: <input type='text' name='username' id='uname' >");
			out.println("<br><br>Book Id: <input type='text' name='bookid' id='bkid' >");
			out.println("<br><br>Book Name: <input type='text' name='bookname' id='bkname' >");
			out.print("<h3 id='result1' style='color:green'></h3>");
			out.print("<h3 id='result2' style='color:red'></h3>");
			out.println("<input type='submit' value='issue' >");
			out.println("</form>");
			
			
			// for userid function
			out.println("<script type='text/javascript'>");
			out.println("function userIdFun(id, name){");
			System.out.println("in function");
//			out.println("alert('Update Started...!!!');");
			out.println("document.getElementById('uid').value=id");
			out.println("document.getElementById('uname').value=name");
			out.println("}");
			out.println("</script>");
			
			//book id function
			out.println("<script type='text/javascript'>");
			out.println("function bookIdFun(id, name, avlcount){");
			System.out.println("in function");
//			out.println("alert('Update Started...!!!');");
			out.println("document.getElementById('bkid').value=id");
			out.println("document.getElementById('bkname').value=name");
//			out.println("document.getElementById('bkname').value=name");
			out.println("if(avlcount>0){");
			out.println("document.getElementById('result1').innerText='Available';");
			out.println("}");
			out.println("else{");
			out.println("document.getElementById('result2').innerText='NA';");
			out.println("}");
			out.println("}");
			out.println("</script>");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("In post");
		
		
		String uName = request.getParameter("username");
		String bkName = request.getParameter("bookname");
		int bkId = Integer.parseInt(request.getParameter("bookid"));
		int uId = Integer.parseInt(request.getParameter("userid"));
		LocalDate issueDate = LocalDate.now();
		LocalDate returnDate = issueDate.plusDays(8);
		
		System.out.println("data: "+uName+", "+bkName+", "+bkId+", "+uId);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)){
			
			java.sql.Statement stmt = conn.createStatement();
			
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head> <title>Book Issue Details</title> </head>");
			out.println("<body>");
			
			PreparedStatement pstmt = null;
			
			String query = "INSERT INTO issuedata(uid ,bkid ,issue_date ,return_date) VALUES(?,?,?,?)";
			//data insertion
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, uId);
				pstmt.setInt(2, bkId);
				pstmt.setDate(3, Date.valueOf(issueDate));
				pstmt.setDate(4, Date.valueOf(returnDate));
				pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			//display all data
			
			out.println("<h1>Book Issue Data</h1>");
			out.println("<table border='1'>");
			out.println("<tr><th>Id</th> <th>User Id</th> <th>Book Id</th> <th>Issue Date</th> <th>Return Date</th></tr>");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM issuedata");
			
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString(1) + "</td>");
				out.println("<td>" + rs.getString(2) + "</td>");
				out.println("<td>" + rs.getString(3) + "</td>");
				out.println("<td>" + rs.getString(4) + "</td>");
				out.println("<td>" + rs.getString(5) + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			
			out.println("</body>");
			out.println("</html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
