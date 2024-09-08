package com.calculation.genericServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/sub")
public class SubServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		
		pw.println("Subtraction of 2 number: "+(num1-num2)+"<br>");
		RequestDispatcher rd = req.getRequestDispatcher("Input.html");
		rd.include(req, res);
		
	}
}
