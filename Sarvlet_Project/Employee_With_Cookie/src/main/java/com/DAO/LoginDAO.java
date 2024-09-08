package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.BeanClass.EmpBean;

import DBConnection.DBConnect;

public class LoginDAO 
{
	public EmpBean eb = null;
	public EmpBean login(String eN, String eI)
	{
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement ps = con.prepareStatement("Select * from emp_info26 where ename=? and eid=?");
			ps.setString(1, eN);
			ps.setString(2, eI);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				eb = new EmpBean();
				eb.setEmpName(rs.getString(1));
				eb.setEmpId(rs.getString(2));
				eb.setEmpFName(rs.getString(3));
				eb.setEmpLName(rs.getString(4));
				eb.setEmpMail(rs.getString(5));
				eb.setEmpPhone(rs.getLong(6));
				eb.setEmpState(rs.getString(7));
				eb.setEmpCountry(rs.getString(8));
				System.out.println("LoginDAO.login()");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return eb;
	}
}
