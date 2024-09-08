<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.Bean.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		AdminBean ab = (AdminBean)session.getAttribute("abean");
		out.println("Welcome admin: "+ab.getFname()+"<br>");	
	%>
	<a href="product.html">Add Product</a>
	<a href="view">View All Products</a>
	<a href="logout">Logout</a>
</body>
</html>