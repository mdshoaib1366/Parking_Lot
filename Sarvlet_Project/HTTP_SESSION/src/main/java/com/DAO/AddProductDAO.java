package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Bean.ProductBean;
import com.DBConnect.DBInfo;

public class AddProductDAO 
{
	public int insert(ProductBean pb)
	{
		int k=0;
		try
		{
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement("insert into product63 values (?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setFloat(3, pb.getPrice());
			ps.setInt(4, pb.getQunatity());
			
			k = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
