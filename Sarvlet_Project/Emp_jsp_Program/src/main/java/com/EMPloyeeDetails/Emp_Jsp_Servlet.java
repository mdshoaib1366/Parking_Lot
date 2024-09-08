package com.EMPloyeeDetails;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Emp_Jsp_Servlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		RequestDispatcher rq = req.getRequestDispatcher("Serv.jsp");
		rq.forward(req, res);
	}
}
