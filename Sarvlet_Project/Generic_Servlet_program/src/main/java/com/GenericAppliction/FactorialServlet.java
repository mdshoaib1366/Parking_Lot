package com.GenericAppliction;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/factorial")
public class FactorialServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("num1"));
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int fact=1;
		for(int i=num; i>0; i--)
		{
			fact*=i;
			pw.println(" "+i);
		}
		pw.println("<br>"+"Factorial: "+fact);
		RequestDispatcher rd = req.getRequestDispatcher("Home.html");
		rd.include(req, res);
	}
}
