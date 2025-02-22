package com.Servlet;
import java.io.*;
import java.util.ArrayList;

import com.Bean.ProductBean;
import com.DAO.AddProductDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet  extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session has expired");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);;
		}
		else
		{
			hs.removeAttribute("abean");
			hs.removeAttribute("alist");
			hs.invalidate();
			
			req.setAttribute("logout", "Successfully logout...<br>");			
			req.getRequestDispatcher("logout.jsp").forward(req, res);
			
		}
	}
}