package com.Servlet;

import java.io.*;

import com.Bean.CustomerBean;
import com.DAO.CustomerDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/cust")
public class CustomerLoginServlet  extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String uName = req.getParameter("uname");
		String pWord = req.getParameter("pword");
		
		CustomerBean cb = new CustomerDAO().login(uName, pWord);
		if(cb == null)
		{
			req.setAttribute("fail","Invalid login...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("loginFail.jsp");
			rd.forward(req, res);
		}
		else
		{
			
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			hs.setAttribute("name", "customer");
			req.getRequestDispatcher("customerLogin.jsp").forward(req, res);;
		}
	}
}