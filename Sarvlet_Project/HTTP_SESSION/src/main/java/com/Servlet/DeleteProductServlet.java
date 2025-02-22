package com.Servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.Bean.ProductBean;
import com.DAO.DeleteProductDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException
	{
		HttpSession hs = req.getSession(false);
		
		if(hs == null)
		{
			req.setAttribute("msg", "Session has expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			String pCode = req.getParameter("code");
			
			@SuppressWarnings("unchecked")
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> itr = al.iterator();
			while(itr.hasNext())
			{
				ProductBean pb =(ProductBean)itr.next();
				if(pCode.equals(pb.getCode()))
				{
					int k = new DeleteProductDAO().delete(pb);
					if(k>0)
					{
						req.setAttribute("msg","Successfully deleted....<br>");
						req.getRequestDispatcher("deleteProduct.jsp").forward(req, res);
					}
				}
			}
		}
	}
}
