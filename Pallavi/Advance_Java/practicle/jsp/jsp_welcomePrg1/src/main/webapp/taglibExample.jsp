<%@page import="java.util.Arrays"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSTL Loop Example</title>
	</head>
	<body>
		<h1>List of Items</h1>
		<!-- Initialize the list using scriptlet -->
		<%
			java.util.List<String> itemList = Arrays.asList("item1", "item2", "item3", "item4");
			request.setAttribute("itemList", itemList);
		%>
		
		
    <!-- Iterate over the list and display items -->
    
    	<c:forEach var="item" items="${itemList }">
    		<p>${item}</p>
    	</c:forEach>
		
	</body>
</html>