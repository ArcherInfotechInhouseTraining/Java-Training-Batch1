package arc.nov.examples;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

	

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


	    int sid = Integer.parseInt(request.getParameter("sid")); // Student ID
	    System.out.println("sid is: "+sid);
	    
	    
	    
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Payment Page</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div class='container mt-5 d-flex justify-content-center'>"); // Center the form
        out.println("<div class='card p-4' style='max-width: 500px; width: 100%;'>"); // Limit width with max-width
        
        out.println("<h2 class='text-center'>Payment Page</h2>");
        //--------------form-----------------
        out.println("<form action='PaymentServlet' method='post' class='needs-validation' novalidate>");
        out.println("<div class='mb-3'>");
        out.println("<h2 class='text-center'>For User Id: "+sid+"</h2>");
        out.println("<label for='name' class='form-label'>Name on Card</label>");
        out.println("<input type='text' class='form-control' id='name' name='name' required>");
        out.println("<div class='invalid-feedback'>Please enter your name.</div>");
        out.println("</div>");
        out.println("<div class='mb-3'>");
        out.println("<label for='cardNumber' class='form-label'>Card Number</label>");
        out.println("<input type='text' class='form-control' id='cardNumber' name='cardNumber' pattern='\\d{16}' required>");
        out.println("<div class='invalid-feedback'>Please enter a valid 16-digit card number.</div>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='col-md-6 mb-3'>");
        out.println("<label for='expiryDate' class='form-label'>Expiry Date</label>");
        out.println("<input type='month' class='form-control' id='expiryDate' name='expiryDate' required>");
        out.println("<div class='invalid-feedback'>Please enter the expiry date.</div>");
        out.println("</div>");
        out.println("<div class='col-md-6 mb-3'>");
        out.println("<label for='cvv' class='form-label'>CVV</label>");
        out.println("<input type='text' class='form-control' id='cvv' name='cvv' pattern='\\d{3}' required>");
        out.println("<div class='invalid-feedback'>Please enter a valid 3-digit CVV.</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='mb-3'>");
        out.println("<label for='amount' class='form-label'>Amount</label>");
        out.println("<input type='number' class='form-control' id='amount' name='amount' required>");
        out.println("<div class='invalid-feedback'>Please enter the amount to be paid.</div>");
        out.println("</div>");
        out.println("<input type='hidden' name='sid' value='" + sid + "'>"); 
        out.println("<button type='submit' class='btn btn-primary w-100'>Make Payment</button>");
        out.println("</form>");
        
        out.println("</div>");
        out.println("</div>");
        
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js'></script>");
        out.println("<script>");
        out.println("(() => {");
        out.println("  'use strict';");
        out.println("  const forms = document.querySelectorAll('.needs-validation');");
        out.println("  Array.from(forms).forEach(form => {");
        out.println("    form.addEventListener('submit', event => {");
        out.println("      if (!form.checkValidity()) {");
        out.println("        event.preventDefault();");
        out.println("        event.stopPropagation();");
        out.println("      }");
        out.println("      form.classList.add('was-validated');");
        out.println("    }, false);");
        out.println("  });");
        out.println("})();");
        out.println("</script>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    // Initialize variables
    	    String name = request.getParameter("name"); // Assuming 'name' is passed in the request
    	    String cardNumber = request.getParameter("cardNumber"); // Assuming 'cardNumber' is passed in the request
    	    int amount = Integer.parseInt(request.getParameter("amount")); // Payment amount
//    	    int sid = request.getAttribute("sid");
//    	    
//    	    int sid = (int) request.getAttribute("sid");
    	    int sid = Integer.parseInt(request.getParameter("sid"));

    	    System.out.println("sid: "+sid);
    	    int remaining = 0;

    	    // Query to fetch remaining fee
    	    String selectSql = "SELECT fee_remainin FROM degree_data WHERE sid = ?";
    	    String updateSql = "UPDATE degree_data SET fee_remainin = ? WHERE sid = ?";

    	    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
    	        // Fetch the current remaining fee
    	        try (PreparedStatement selectStmt = connection.prepareStatement(selectSql)) {
    	            selectStmt.setInt(1, sid);
    	            ResultSet rs = selectStmt.executeQuery();
    	            if (rs.next()) {
    	                remaining = rs.getInt("fee_remainin");
    	            }
    	        }

    	        // Calculate the new remaining fee
    	        remaining -= amount;

    	        // Update the fee_remainin in the database
    	        try (PreparedStatement updateStmt = connection.prepareStatement(updateSql)) {
    	            updateStmt.setInt(1, remaining);
    	            updateStmt.setInt(2, sid);
    	            updateStmt.executeUpdate();
    	        }

    	        // Prepare the response
    	        response.setContentType("text/html");
    	        PrintWriter out = response.getWriter();

    	        out.println("<!DOCTYPE html>");
    	        out.println("<html lang='en'>");
    	        out.println("<head>");
    	        out.println("<meta charset='UTF-8'>");
    	        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
    	        out.println("<title>Payment Confirmation</title>");
    	        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css' rel='stylesheet'>");
    	        out.println("<link rel='stylesheet' href='css/style.css'>");
    	        out.println("</head>");
    	        out.println("<body>");
    	        out.println("<div class='container mt-5'>");
    	        out.println("<h2 class='text-center'>Payment Confirmation</h2>");
    	        out.println("<div class='alert alert-success'>");
    	        out.println("<p>Thank you, <b>" + name + "</b>, for your payment!</p>");
    	        out.println("<p>Card ending in <b>" + cardNumber.substring(cardNumber.length() - 4) + "</b></p>");
    	        out.println("<p>Amount Paid: <b>&#8377;" + amount + "</b></p>");
    	        out.println("<p>Remaining Fee: <b>&#8377;" + remaining + "</b></p>");
    	        out.println("</div>");
    	        out.println("<a href='paymentPage.html' class='btn btn-primary'>Go Back</a>");
    	        out.println("</div>");
    	        out.println("</body>");
    	        out.println("</html>");
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	        response.getWriter().println("<h3 class='text-danger'>Error processing payment. Please try again later.</h3>");
    	    }
    	}

}
