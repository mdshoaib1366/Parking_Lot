<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String uName = request.getParameter("uname");
		String servName = (String)request.getAttribute("servName");
		Integer val = (Integer)request.getAttribute("val");
		
		out.println("Welcome user: "+uName+"<br>");
		out.println("========Servlet program config data========"+"<br>");
		out.println("Servlet name  :"+servName+"<br>");
		out.println("Config value: "+val+"<br>");
		
		out.println("=====jsp config data====="+"<br>");
		out.println("Servlet Name :"+config.getServletName());
	%>
</body>
</html>