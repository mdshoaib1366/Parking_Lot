package com.Servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.Bean.ProductBean;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs == null)
		{
			req.setAttribute("msg", "Session has expired....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);;
		}
		else
		{
			String pCode = req.getParameter("code");
			System.out.println("else "+pCode);
			
			@SuppressWarnings("unchecked")
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> itr = al.iterator();
//			System.out.println(al);
			while(itr.hasNext())
			{
				ProductBean pb = itr.next();
				if(pCode.equals(pb.getCode()))
				{
					req.setAttribute("pbean", pb);
					req.getRequestDispatcher("editProduct.jsp").forward(req, res);
					break;
				}
			}
		}
	}
}
