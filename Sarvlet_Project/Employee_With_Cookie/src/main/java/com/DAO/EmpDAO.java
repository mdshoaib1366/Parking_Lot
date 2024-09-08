package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.BeanClass.EmpBean;
import DBConnection.DBConnect;

public class EmpDAO 
{
	public int insert(EmpBean eb)
	{
		int k = 0;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement ps = con.prepareStatement("insert into emp_info26 values(?,?,?,?,?,?,?,?)");
			ps.setString(1, eb.getEmpName());
			ps.setString(2, eb.getEmpId());
			ps.setString(3, eb.getEmpFName());
			ps.setString(4, eb.getEmpLName());
			ps.setString(5, eb.getEmpMail());
			ps.setLong(6, eb.getEmpPhone());
			ps.setString(7, eb.getEmpState());
			ps.setString(8, eb.getEmpCountry());
			
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return k;
	}
}
