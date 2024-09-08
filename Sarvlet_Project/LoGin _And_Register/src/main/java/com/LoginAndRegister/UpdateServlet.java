package com.LoginAndRegister;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class UpdateServlet extends HttpServlet
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
			
			ServletContext sct = req.getServletContext();
			UserBean ub1= (UserBean)sct.getAttribute("ubean");
			String mid = req.getParameter("mid");
			String p = req.getParameter("phone");
			long phone = Long.parseLong(p);
			ub1.setPhNo(phone);
			ub1.setmId(mid);
			int k = upd.update(ub1);
			UserBean ub = (UserBean)sct.getAttribute("ubean");
			System.out.println("k ::"+k);
			
			if(k>0) 
			{
				String fn = ck[0].getValue();
				req.setAttribute("fname", fn);
				req.setAttribute("ubean", ub);
				RequestDispatcher rd= req.getRequestDispatcher("updatesuccess.jsp");
				rd.forward(req, res);
			}
		}
	}
}
