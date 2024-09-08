package com.Employee_Details.Servlets;

import java.io.*;
import com.BeanClass.EmpBean;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg2")
public class Reg2Servlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		ServletContext sct = req.getServletContext();
		EmpBean ebean2 = (EmpBean)sct.getAttribute("ebean1");
		ebean2.setEmpLName(req.getParameter("elname"));
		ebean2.setEmpMail(req.getParameter("email"));
		ebean2.setEmpPhone(Long.parseLong(req.getParameter("ephno")));
	
			sct.setAttribute("ebean2", ebean2);
			RequestDispatcher rd = req.getRequestDispatcher("reg3.html");
			rd.forward(req, res);
		
		
	}

}
