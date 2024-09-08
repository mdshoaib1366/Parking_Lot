package com.Employee_Details.Servlets;


import java.io.*;
import com.BeanClass.EmpBean;
import com.DAO.EmpDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg3")
public class Reg3Servlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		ServletContext sct = req.getServletContext();
		EmpBean ebean3 = (EmpBean)sct.getAttribute("ebean2");
		ebean3.setEmpState(req.getParameter("estate"));
		ebean3.setEmpCountry(req.getParameter("ecountry"));
		int k = new EmpDAO().insert(ebean3);
		
		if(k>0)
		{
			req.setAttribute("msg", "Registration Success...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		
		
		
	}
}
