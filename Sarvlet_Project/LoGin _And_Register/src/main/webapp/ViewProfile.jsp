<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.LoginAndRegister.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		
		UserBean ub = (UserBean)application.getAttribute("ubean");
		out.println("Page Belong to: "+ub.getfName()+"<br>");
		out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"
		+ub.getmId()+"&nbsp&nbsp"+ub.getPhNo()+"&nbsp&nbsp"+"<a href= 'editcheck' >Edit</a>"+"<br>");
	%>
	<a href="logout">Logout</a>
</body>
</html>