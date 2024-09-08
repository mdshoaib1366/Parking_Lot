package com.LoginPage;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/log")
public class Login_Demo implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String password = req.getParameter("pwd");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
//		if(uname.equals("admin"))
//		{
//			if(password.equals("123"))
//			{
//				pw.println("login Successful"+"<br>");
//			}
//			else{
//				pw.println("password is incorrect");
//			}
//		}
//		else{
//			pw.println("username is incorrect");
//		}
		
		if(uname.equals("admin") && password.equals("123"))
		{
			pw.println("login Successful"+"<br>");
			pw.println("User_name: "+uname+"<br>");
			pw.println("Password: "+password);
		}
		else
		{
			pw.println("username or password incorrect");
		}
	}

}
