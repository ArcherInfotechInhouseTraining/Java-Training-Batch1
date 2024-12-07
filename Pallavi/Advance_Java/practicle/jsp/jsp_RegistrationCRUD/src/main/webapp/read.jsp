
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!-- import sql -->	
<%@ page import="java.sql.*" %>
	
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Read Data</title>
		
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body>
		<h1>List Of Registered Users</h1>
		<table border="1">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Registration Date</th>
				</tr>
			</thead>
			<tbody>
			
			<%
				// Database connection parameters
				 String url = "jdbc:mysql://localhost:3306/jspreg_db";
                String username = "root";
                String password = "root";
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
                
                try{
                	// load jdbc drivers
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    // establish connection
                    connection = DriverManager.getConnection(url, username, password);
                    
                    // create and execute query
                    String query = "SELECT id,name,email,registration_date FROM users";
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery(query);
                    
                 	// Iterate through result set and display users
                 	while(resultSet.next()){
                 		int id = resultSet.getInt("id");
                 		String name = resultSet.getString("name");
                 		String email = resultSet.getString("email");
                 		String registration_date = resultSet.getString("registration_date");
                 		
              %>
                 		<tr>
                 			<td><%=id %></td>
                 			<td><%=name %></td>
                 			<td><%=email %></td>
                 			<td><%=registration_date %></td>
                 		</tr>
             <%
                 	}
                 	
                }
                catch(Exception e){
                	e.printStackTrace();
                }
                finally {
                    // Close resources
                    try { if (resultSet != null) resultSet.close(); } catch (SQLException ignore) {}
                    try { if (statement != null) statement.close(); } catch (SQLException ignore) {}
                    try { if (connection != null) connection.close(); } catch (SQLException ignore) {}
                }
                
			%>
			</tbody>
		</table>
	
      <a href="home.jsp" class="button home">Home</a>
<a href="create.jsp" class="button create">Create</a>
<a href="update.jsp" class="button update">Update</a>
<a href="delete.jsp" class="button delete">Delete</a>

	</body>
</html>