package com.test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServlet implements Servlet
{
	@Override
	public void init(ServletConfig scf) throws ServletException
	{
		//noCode
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uName = req.getParameter("uname");
		String mId = req.getParameter("mid");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("User_Name: "+uName+"<br>");
		pw.println("Mail id: "+mId+"<br>");
		
	}
	
	
	
}
