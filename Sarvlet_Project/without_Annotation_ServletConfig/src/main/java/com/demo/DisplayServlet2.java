package com.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DisplayServlet2 extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		ServletConfig scf = super.getServletConfig();
		String servName = scf.getServletName();
		
		int v = Integer.parseInt(scf.getInitParameter("value"));
		
		req.setAttribute("servName", servName);
		req.setAttribute("val", new Integer(v));
		
		req.getRequestDispatcher("display.jsp").forward(req, res);
	}
}
