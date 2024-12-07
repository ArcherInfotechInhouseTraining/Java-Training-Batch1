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
	<title>Update Data</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<form method="post">
			<h1>Update Data</h1>
			<label>Enter Id</label>
			<input type="text" name="id" placeholder="Enter Id"><br><br>
			<label>Enter Name</label>
			<input type="text" name="name" placeholder="Enter Name"><br><br>
			<label>Enter Email</label>
			<input type="email" name="email" placeholder="Enter Email"><br><br>
			<label>Enter Registration Date</label>
			<input type="date" name="date" placeholder="Enter Date"><br><br>
			<input type="submit" value="Update">
		</form>
		
		<% 
			if(request.getMethod().equalsIgnoreCase("post")){
				
				// Database connection parameters
				String url = "jdbc:mysql://localhost:3306/jspreg_db";
				String name = "root";
				String password = "root";
               
               Connection connection = null;
               PreparedStatement pstmt = null;
               ResultSet resultSet = null;
               
               try{
               	// load jdbc drivers
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   
                   // establish connection
                   connection = DriverManager.getConnection(url, name, password);
                   
                   int id = Integer.parseInt(request.getParameter("id"));
                   String userName = request.getParameter("name");
                   String email = request.getParameter("email");
                   String date = request.getParameter("date");
                   
                   
                   // create and execute query
                   String query = "UPDATE users SET name=?, email=?, registration_date=? WHERE id=?";
                   pstmt = connection.prepareStatement(query);
                   pstmt.setString(1, userName);
                   pstmt.setString(2, email);
                   pstmt.setString(3, date);
                   pstmt.setInt(4, id);
                   
                   pstmt.executeUpdate();
                   System.out.println("Updated Successfully");
			}
            catch (Exception e)
             {
            	e.printStackTrace();
             }
		}
		%>
		
		<a href="home.jsp" class="button home">Home</a>
<a href="create.jsp" class="button create">Create</a>
<a href="read.jsp" class="button read">Read</a>
<a href="delete.jsp" class="button delete">Delete</a>

	</body>
</html>