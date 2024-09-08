package com.Employee_Details;

import java.io.*;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/fo")
public class Employee_Demo implements Servlet {

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
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		double sal = Double.parseDouble(req.getParameter("salary"));
		String gender = req.getParameter("gender");
		String profile = req.getParameter("profile");
		String[] hobbies = req.getParameterValues("hobby");
		String state = req.getParameter("st");
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
//		pw.println("Employee Information: "+"<br>");
//		pw.println("Employee Id: "+id+"<br>");
//		pw.println("Employee Name: "+name+"<br>");
//		pw.println("Employee Address: "+addr+"<br>");
//		pw.println("Employee State: "+state+"<br>");
//		pw.println("Employee Salary: "+sal+"<br>");
		
//		pw.print("Employee Gender: ");
		String g = "";
		String pro ="";
		String hob = "";
		if(gender.equals("Male"))
		{
			g="Male";
		}
		else 
		{
			g="Female";
		}
//		pw.println(g+"<br>");
//		pw.print("Employee Profile: ");
		if(profile.equals("Developer"))
		{
			pro="Developer";
		}
		else if(profile.equals("Tester"))
		{
			pro="Tester";
		}
		else if(profile.equals("QA"))
		{
			pro="QA";
		}
//		pw.println(pro+"<br>");
//		pw.print("Employee Hobbies: ");
		
		for(String hobby:hobbies) {
			hob +=hobby+" ";
		}
		
		EmpBean eb = new EmpBean();
		eb.setId(id);
		eb.setName(name);
		eb.setAddress(addr);
		eb.setState(pro);
		eb.setSalary(sal);
		eb.setGender(g);
		eb.setHobby(hob);
		eb.setState(state);
		int register = new EmpDBCon().register(eb);
		
		if(register>0)
		{
			pw.println("<br>Employee Registered into DB Successfully");
		}
		pw.println("<br>=======================================================<br>");
		
		List<EmpBean> listemp = new EmpDBCon().retrieve();
		if(listemp!=null)
		{
			for(EmpBean empBean: listemp)
			{
				pw.println(empBean+"<br>");
			}
		}
		else
		{
			pw.println("Invalid Process.....");
		}
	}

}
