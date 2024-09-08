package com.GenericAppliction;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/square")
public class SquareServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("num1"));
		
		int res1 = num*num;
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("Square is :"+res1);
		RequestDispatcher rd = req.getRequestDispatcher("Home.html");
		rd.include(req, res);
	}
}
