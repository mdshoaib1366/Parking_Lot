package com.calculatorDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/calculas")
public class Calculator implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int add = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		float div = (float)num1/num2; 
		String oper=req.getParameter("submit");
		PrintWriter pw = res.getWriter();
		
		if(oper.equals("+")) {
		pw.println(""+num1+" + "+num2+" = "+add+"");
		}
		else if(oper.equals("-")) {
		pw.println(""+num1+" - "+num2+" = "+sub+"");
		}
		else if(oper.equals("*")) {
		pw.println(""+num1+" * "+num2+" = "+mul+"");
		}
		else if(oper.equals("/")) {
		pw.println(""+num1+" / "+num2+" = "+div+"");
		}
		
		
		
	}

}
