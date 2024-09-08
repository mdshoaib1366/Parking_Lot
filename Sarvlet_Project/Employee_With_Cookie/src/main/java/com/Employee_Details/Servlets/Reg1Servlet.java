package com.Employee_Details.Servlets;

import java.io.*;
import com.BeanClass.EmpBean;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg1")
public class Reg1Servlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		EmpBean ebean1 = new EmpBean();
		ebean1.setEmpId(req.getParameter("eid"));
		ebean1.setEmpName(req.getParameter("ename"));
		ebean1.setEmpFName(req.getParameter("efname"));
		
			ServletContext sct = req.getServletContext();
			sct.setAttribute("ebean1", ebean1);
//			System.out.println("in eb1"+ebean1);
			RequestDispatcher rd = req.getRequestDispatcher("reg2.html");
			rd.forward(req, res);
		

	}
}
