package com.Login;

import java.io.*;
import com.BeanClass.EmpBean;
import com.DAO.LoginDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		LoginDAO ob = new LoginDAO();
		EmpBean ebean = ob.login(req.getParameter("ename"),req.getParameter("eid") );
		System.out.println(ebean);
		if(ebean==null)
		{
			req.setAttribute("fail","Invalid login Proccess...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}
		else
		{
			req.setAttribute("success"," Login success"+"<br>Welcome to homePage"+"...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}
		
	}
	
}