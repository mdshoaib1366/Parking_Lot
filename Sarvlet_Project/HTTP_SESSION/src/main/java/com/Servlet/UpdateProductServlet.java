package com.Servlet;

import java.io.*;

import java.util.*;
import com.Bean.ProductBean;
import com.DAO.UpdateProductDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
	protected void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
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
			float pPrice = Float.parseFloat(req.getParameter("price"));
			int pQty = Integer.parseInt(req.getParameter("qty"));	
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
			System.out.println(pPrice);
			
			Iterator<ProductBean> itr = al.iterator();
			while(itr.hasNext())
			{
				ProductBean pb = itr.next();
				if(pCode.equals(pb.getCode()))
				{
					pb.setPrice(pPrice);
					pb.setQunatity(pQty);
					System.out.println("Inside if: "+pb.getPrice());
					int k = new UpdateProductDAO().update(pb);
					
					if(k>0)
					{
						req.setAttribute("msg", "Successfully product updated...<br>");
						req.getRequestDispatcher("updateProduct.jsp").forward(req, res);
					}
					break;
				}
			}
		}
	}
}
