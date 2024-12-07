
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Include Directive Example</title>
	</head>
	<body>
		<h1>This is the main content</h1>
		<p>The header is included using the @include directive</p>
		<%@ include file="header.jsp" %>
	</body>
</html>