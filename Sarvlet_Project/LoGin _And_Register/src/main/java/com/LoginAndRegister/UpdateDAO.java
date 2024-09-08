package com.LoginAndRegister;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateDAO 
{
	public int update(UserBean ub)
	{
		int k=0;
		try {
			Connection con = DBConnection.getCon();
			
			PreparedStatement ps = con.prepareStatement("update userreg69 set mail=?, phno=? where uname=? and pword=?");
			
			
			ps.setString(1,ub.getmId());
			ps.setLong(2,ub.getPhNo());
			ps.setString(3, ub.getuName());
			ps.setString(4, ub.getpWord());
		
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return k;
	}
}
