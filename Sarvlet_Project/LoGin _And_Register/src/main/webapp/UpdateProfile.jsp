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
			
			if(ub !=null)
			{
		%>
		<form action="edit" >
		Mail Id: <input type="text" name="mid" value=<%=ub.getmId() %>>
		Phone : <input type="text" name="phone" value=<%=ub.getPhNo() %>>
		<input type="submit" value="update" name="edit">
		</form>
		
	<% 
		}
		else
		{
			out.println("User Details not available");
		}
		
	%>	
</body>
</html>