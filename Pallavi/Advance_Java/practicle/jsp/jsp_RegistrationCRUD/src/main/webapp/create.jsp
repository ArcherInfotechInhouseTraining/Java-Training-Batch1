
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
		<title>Registration</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		
	</head>
	<body>
	<h1>Register Here</h1>
		<form method="post">
			<label>Name: </label>
			<input type="text" name="name" id="name" placeholder="Enter Name"><br><br>
			<label>Email: </label>
			<input type="email" name="email" id="email" placeholder="Enter Email"><br><br>
			<label>Date: </label>
        	<input type="date" id="date" name="date" placeholder="Enter Date">
			<input type="submit" value="Insert">
		</form>
		
		<%
			if(request.getMethod().equalsIgnoreCase("post")){
				
				String url = "jdbc:mysql://localhost:3306/jspreg_db";
				String name = "root";
				String password = "root";
				
				Connection connection=null;
				PreparedStatement pstmt = null;
				ResultSet rs=null;
				try
				{
					// load drivers
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// establish connection
					connection = DriverManager.getConnection(url,name,password);
					
					String userName = request.getParameter("name");
					String email = request.getParameter("email");
					String date = request.getParameter("date");
					Date currentDate = new Date();
					
					System.out.println("Name: "+userName+" Email: "+email+" Date: "+date);
					
					String sql = "INSERT INTO users(name,email,registration_date) VALUES (?,?,?)";
					
					pstmt = connection.prepareStatement(sql);
					pstmt.setString(1, userName);
					pstmt.setString(2, email);
					pstmt.setString(3, date);
					//rs = pstmt.executeQuery();
					pstmt.executeUpdate();
					
					System.out.println("Data inserted Successfully.");
					
				}
				
				catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
		
		<a href="home.jsp" class="button home">Home</a>
<a href="read.jsp" class="button read">Read</a>
<a href="update.jsp" class="button update">Update</a>
<a href="delete.jsp" class="button delete">Delete</a>
		
	</body>
</html>