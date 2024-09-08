package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.AdminBean;
import com.DBConnect.DBInfo;

public class AdminDAO
{
	public static AdminBean abean = null;
	public AdminBean login(String uN, String pd)
	{
		try
		{
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement("select * from admin63 where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, pd);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				abean = new AdminBean();
				abean.setUname(rs.getString(1));
				abean.setPword(rs.getString(2));
				abean.setFname(rs.getString(3));
				abean.setLname(rs.getString(4));
				abean.setAddr(rs.getString(5));
				abean.setMid(rs.getString(6));
				abean.setPhno(rs.getLong(7));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return abean;
	}
}
