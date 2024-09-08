package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.ProductBean;
import com.DBConnect.DBInfo;

public class UpdateProductDAO 
{
	int k=0;
	public int update(ProductBean pb)
	{
		try {
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement("update product63 set price=?,qty=? where code=?");
			ps.setFloat(1, pb.getPrice());
			ps.setInt(2, pb.getQunatity());
			ps.setString(3, pb.getCode());
			
			k = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return k;
	}
}
