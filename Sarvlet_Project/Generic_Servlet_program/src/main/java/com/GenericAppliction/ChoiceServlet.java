package com.GenericAppliction;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String s = req.getParameter("s1");
		
		if(s.equals("prime"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("prime");
			rd.forward(req, res);
		}
		else if(s.equals("factor"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("factor");
			rd.forward(req, res);
		}
		else if(s.equals("factorial"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("factorial");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("square");
			rd.forward(req, res);
		}
		
	}
	
}
