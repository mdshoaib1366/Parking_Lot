package com.LoginAndRegister;

import jakarta.servlet.http.*;
import java.io.*;
import java.net.http.HttpResponse;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class LoginProfile extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}
		else
		{
			String fn = c[0].getValue();
			req.setAttribute("fname", fn);
			
			RequestDispatcher rd = req.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(req, res);
		}
	}
}
