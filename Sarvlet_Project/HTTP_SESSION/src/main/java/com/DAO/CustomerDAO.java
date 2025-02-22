package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.CustomerBean;
import com.DBConnect.DBInfo;

public class CustomerDAO 
{
	public CustomerBean cb = null;
	public CustomerBean login(String uN, String pW)
	{
		try
		{
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from customer63 where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				cb = new CustomerBean();
				cb.setUname(rs.getString(1));
				cb.setPword(rs.getString(2));
				cb.setFname(rs.getString(3));
				cb.setLname(rs.getString(4));
				cb.setAddr(rs.getString(5));
				cb.setMid(rs.getString(6));
				cb.setPhno(Long.parseLong(rs.getString(7)));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cb;
	}
}
