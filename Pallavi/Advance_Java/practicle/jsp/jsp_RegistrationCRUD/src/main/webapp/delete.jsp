<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Date" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Delete Data</title>
		
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>Delete Records</h1>
		<form method="post">
			<label>Enter Id To Delete Record</label>
			<input type="text" name="id">
			<input type="submit" value="Delete">
		</form>
		
		<%
			if(request.getMethod().equalsIgnoreCase("post")){
				
				
				// Database connection parameters
				String url = "jdbc:mysql://localhost:3306/jspreg_db";
				String name = "root";
				String password = "root";
               
               Connection connection = null;
               PreparedStatement pstmt = null;
               ResultSet rs = null;
               
               try{
                  	// load jdbc drivers
                      Class.forName("com.mysql.cj.jdbc.Driver");
                      
                      // establish connection
                      connection = DriverManager.getConnection(url, name, password);
                      
                      int id = Integer.parseInt(request.getParameter("id"));
                      
                   // Check if the ID exists
                      String checkSql = "SELECT COUNT(*) FROM users WHERE id = ?";
                      pstmt = connection.prepareStatement(checkSql);
                      pstmt.setInt(1, id);
                      rs = pstmt.executeQuery();

                      if (rs.next() && rs.getInt(1) > 0) {
                          // ID exists, proceed to delete
                          String deleteSql = "DELETE FROM users WHERE id = ?";
                          pstmt = connection.prepareStatement(deleteSql);
                          pstmt.setInt(1, id);
                          int rowsDeleted = pstmt.executeUpdate();

                          if (rowsDeleted > 0) {
                        	  out.println("<p style='color: green; text-align: center;'>Record deleted successfully.</p>");

                          } else {
                              out.println("<p style='color: red; text-align: center;'>Failed to delete the record. Please try again.</p>");
                          }
                      } else {
                          // ID does not exist
                    	  out.println("<p style='color: red; text-align: center;'>Invalid ID. No record found to delete.</p>");

                      }
                      
               }
               catch(Exception e){
            	   e.printStackTrace();
               }
               finally {
            	    // Close resources
            	    if (rs != null) rs.close();
            	    if (pstmt != null) pstmt.close();
            	    if (connection != null) connection.close();
            	}
               
               
			}
		%>
		<a href="home.jsp" class="button home">Home</a>
<a href="create.jsp" class="button create">Create</a>
<a href="read.jsp" class="button read">Read</a>
<a href="update.jsp" class="button update">Update</a>
		
	</body>
</html>