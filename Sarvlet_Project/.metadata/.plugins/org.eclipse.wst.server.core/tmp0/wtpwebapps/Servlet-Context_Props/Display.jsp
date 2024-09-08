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
	     int k = Integer.parseInt(application.getInitParameter("a"));
	     out.println("Welcome user: "+uName+"<br>");
	     out.println("=====Servlet Context=====<br>");
	     out.println("SevletInfo: "+application.getServerInfo()+"<br>");
	     out.println("ContextValue: "+k);
	%>
</body>
</html>