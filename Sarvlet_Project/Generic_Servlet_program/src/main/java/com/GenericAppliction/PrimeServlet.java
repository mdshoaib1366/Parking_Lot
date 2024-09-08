package com.GenericAppliction;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/prime")

public class PrimeServlet extends GenericServlet{
	@Override 
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException
	{
		int num = Integer.parseInt(req.getParameter("num1"));
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int c=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			pw.println(num+" is a Prime Number");
		}
		else
		{
			pw.println(num+" is not a Prime Number");
		}
		RequestDispatcher rd = req.getRequestDispatcher("Home.html");
		rd.include(req, res);
	}
}
