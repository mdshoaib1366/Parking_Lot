package com.LoginAndRegister;

import java.sql.*;

public class LoginDAO 
{
	public boolean isLogin(UserBean ub)
	{
		String user="";
		String pwd="";
		boolean status=false;
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("Select * from userreg69 where uname=? and pword=?");
			
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getpWord());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 user=rs.getString(1);
				 pwd= rs.getString(2);
				 ub.setuName(rs.getString(1));
				 ub.setpWord(rs.getString(2));
				 ub.setfName(rs.getString(3));
				 ub.setlName(rs.getString(4));
				 ub.setmId(rs.getString(5));
				 ub.setPhNo(rs.getLong(6));
				 
			}
			if(ub.getuName().equals(user) && ub.getpWord().equals(pwd))
			{
				return true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
