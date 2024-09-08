package com.LoginAndRegister;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		UserBean ub = new UserBean();
		 ub.setuName(req.getParameter("uname"));
		 ub.setpWord(req.getParameter("pword"));
		LoginDAO log = new LoginDAO();
		
		if(log.isLogin(ub))
		{
			ServletContext sct = req.getServletContext(); 
			sct.setAttribute("ubean", ub);
			
			Cookie ck = new Cookie("fname", ub.getfName());
			res.addCookie(ck);
			
			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			
			req.setAttribute("log","username or password incorrect...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}
	}
}
