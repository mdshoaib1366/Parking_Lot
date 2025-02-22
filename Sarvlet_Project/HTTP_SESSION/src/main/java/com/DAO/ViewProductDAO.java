package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Bean.ProductBean;
import com.DBConnect.DBInfo;

public class ViewProductDAO
{
	public ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve()
	{
		try 
		{
			Connection con = DBInfo.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product63");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ProductBean pb = new ProductBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(Float.parseFloat(rs.getString(3)));
				pb.setQunatity(Integer.parseInt(rs.getString(4)));
				al.add(pb);//adding object to Arraylist
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return al;
	}
}
