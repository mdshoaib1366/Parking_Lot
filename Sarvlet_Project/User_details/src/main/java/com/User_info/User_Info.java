package com.User_info;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/user")
public class User_Info implements Servlet{

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
		String uid=req.getParameter("uid");
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String mail = req.getParameter("mail");
		String phno = req.getParameter("phno");
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		pw.println("User ID: "+uid+"<br>");
		pw.println("User First-Name: "+fName+"<br>");
		pw.println("User Last-Name: "+lName+"<br>");
		pw.println("User Mail: "+mail+"<br>");
		pw.println("User Phone: "+phno+"<br>");
		
		
	}

}
