<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.LoginAndRegister.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="logout">
	<%
		UserBean ub	=(UserBean)application.getAttribute("ubean");
		out.println("Welcome user: "+ub.getfName()+"<br>");
	%>
	<a href="ViewProfile.jsp">View-Profile</a>
	<a href="logout">Logout</a>
	</form>
</body>
</html>