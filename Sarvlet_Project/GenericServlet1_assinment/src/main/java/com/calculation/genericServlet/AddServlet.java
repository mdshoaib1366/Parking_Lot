package com.calculation.genericServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/add")
public class AddServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Addition of 2 number: "+(num1+num2)+"<br>");
		
		RequestDispatcher rd = req.getRequestDispatcher("Input.html");
		rd.include(req, res);
		
	}
}
