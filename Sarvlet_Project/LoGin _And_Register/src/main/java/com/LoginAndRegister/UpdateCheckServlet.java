package com.LoginAndRegister;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/editcheck")
public class UpdateCheckServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		UpdateDAO upd = new UpdateDAO();
		Cookie ck[] = req.getCookies();
		if(ck == null)
		{
			req.setAttribute("log", "Session expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req,res);
		}
		else
		{
			req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
		}
	}
}
