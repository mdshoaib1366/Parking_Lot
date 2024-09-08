package com.GenericAppliction;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/factor")
public class FactorServlet extends GenericServlet
{
	@Override 
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		int num = Integer.parseInt(req.getParameter("num1"));
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				pw.println(i);
			}
		}
		RequestDispatcher rd = req.getRequestDispatcher("Home.html");
		rd.include(req, res);
	}
}
