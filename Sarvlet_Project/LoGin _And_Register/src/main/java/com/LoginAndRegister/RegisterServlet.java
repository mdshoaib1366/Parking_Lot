package com.LoginAndRegister;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub = new UserBean();
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		ub.setmId(req.getParameter("mail"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		
		RegisterDAO ob = new RegisterDAO();
		int k=ob.insert(ub);
		if(k>0)
		{
			req.setAttribute("msg","User successfully...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
	}
}
