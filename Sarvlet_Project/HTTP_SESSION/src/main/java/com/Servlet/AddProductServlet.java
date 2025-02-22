package com.Servlet;

import java.io.*;

import com.Bean.ProductBean;
import com.DAO.AddProductDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet  extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else	
		{
			ProductBean product = new ProductBean();
			product.setCode(req.getParameter("code"));
			product.setName(req.getParameter("name"));
			product.setPrice(Float.parseFloat(req.getParameter("price")));
			product.setQunatity(Integer.parseInt(req.getParameter("qty")));
			
			int k = new AddProductDAO().insert(product);
			if(k>0)
			{
				req.setAttribute("msg", "Product add Successfully...<br>");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);;
			}
			
		}
	}
}
