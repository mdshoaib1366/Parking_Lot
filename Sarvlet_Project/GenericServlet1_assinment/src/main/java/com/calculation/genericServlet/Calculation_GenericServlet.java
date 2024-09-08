package com.calculation.genericServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/main")
public class Calculation_GenericServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String s = req.getParameter("s1");
		if(s.equals("add"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("add");
			rd.forward(req, res);
		}
		else if(s.equals("sub"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
		else if(s.equals("mul"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("mul");
			rd.forward(req, res);
		}
		else if(s.equals("div"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("div");
			rd.forward(req, res);
		}
		else if(s.equals("modDiv"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("modDiv");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("avg");
			rd.forward(req, res);
		}
		
	}

}
