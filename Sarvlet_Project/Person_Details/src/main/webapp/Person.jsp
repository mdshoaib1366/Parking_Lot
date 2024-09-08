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
		String gen="";
		String hob="";
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String gender = request.getParameter("gender").toLowerCase();
		if(gender.equals("male"))
		{
			gen+="Male";
		}
		else
		{
			gen+="Female";
		}
		String []hobbies = request.getParameterValues("hobby");
		for(String h : hobbies)
		{
			hob+=" "+h;
		}
		
		out.println("<table border=1>");
		out.println("<th><tr>");
		out.println("<td>Name</td>"+"<td>Age</td>"+"<td>Mobile</td>"+"<td>Gender</td>"+"<td>Hobbies</td>");
		out.println("</tr></th>");
		out.println("<tr>");
		out.println("<td>"+name+"</td>"+"<td>"+age+"</td>"+"<td>"+mobile+"</td>"+"<td>"+gen+"</td>"+"<td>"+hob+"</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		
	%>
	
</body>
</html>