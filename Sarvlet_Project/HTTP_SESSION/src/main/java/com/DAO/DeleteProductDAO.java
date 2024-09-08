package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.ProductBean;
import com.DBConnect.DBInfo;

public class DeleteProductDAO 
{
	int k = 0;
	public int delete(ProductBean pb)
	{
		try
		{
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement("delete product63 where code=?");
			ps.setString(1, pb.getCode());
			
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return k;
	}
}
