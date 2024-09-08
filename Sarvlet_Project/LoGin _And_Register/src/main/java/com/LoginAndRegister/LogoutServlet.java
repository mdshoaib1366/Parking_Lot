package com.LoginAndRegister;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		
		Cookie c[] = req.getCookies();
		if(c==null)
		{
			req.setAttribute("log","Session expired....<br>");
		}
		else
		{
			ServletContext sct = req.getServletContext();
			sct.removeAttribute("ubean");
			
			c[0].setMaxAge(0);
			res.addCookie(c[0]);
			req.setAttribute("msg","Logout Successful...");
			
		}
		req.getRequestDispatcher("Logout.jsp").forward(req, res);
	}
}
