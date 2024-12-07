<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="error.jsp"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Error Page Directive Example</title>
	</head>
	<body>
		<p>This Page Uses The @Page Directive To Set an error page </p>
		
		<%
			int a = 10/0;
		%>
	</body>
</html>