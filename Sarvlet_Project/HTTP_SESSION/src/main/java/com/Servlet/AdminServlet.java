package com.Servlet;

import java.io.*;

import com.Bean.AdminBean;
import com.DAO.AdminDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String uName = req.getParameter("uname");
		String pword = req.getParameter("pword");
		AdminBean ab  = new AdminDAO().login(uName, pword);
		if(ab == null)
		{
			req.setAttribute("fail", "invalid login...<br>");
			RequestDispatcher rs = req.getRequestDispatcher("loginFail.jsp");
			rs.forward(req, res);
		}
		else
		{
			
			HttpSession hs = req.getSession();
			hs.setAttribute("name", "admin");

			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("adminLogin.jsp").forward(req, res);
		}
		
		
	}
}
