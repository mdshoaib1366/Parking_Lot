package com.LoginAndRegister;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
	
	public int insert(UserBean ub) 
	{
		int k=0;
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into UserReg69 values(?,?,?,?,?,?)");
			
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getpWord());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getlName());
			ps.setString(5, ub.getmId());
			ps.setLong(6, ub.getPhNo());
			
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
//			System.out.println(e);
			e.printStackTrace();
		}
		return k;
	}
}
