package com.Employee_Details;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDBCon {
	public int register(EmpBean eb)
	{
		int k = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");

			PreparedStatement ps = con.prepareStatement("insert into empBean values(?,?,?,?,?,?,?)");
			ps.setString(1, eb.getId());
			ps.setString(2, eb.getName());
			ps.setString(3, eb.getAddress());
			ps.setString(4, eb.getState());
			ps.setDouble(5, eb.getSalary());
			ps.setString(6, eb.getGender());
			ps.setString(7, eb.getHobby());
			
			
			k = ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
//			e.printStackTrace();
		}
		return k;
	}
	
	public List<EmpBean> retrieve()
	{
		List<EmpBean> list = new ArrayList<EmpBean>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");

			PreparedStatement ps = con.prepareStatement("select * from empbean");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				EmpBean eb = new EmpBean();
				eb.setId(rs.getString("eid"));
				eb.setName(rs.getString("ename"));
				eb.setAddress(rs.getString("eaddress"));
				eb.setState(rs.getString("state"));
				eb.setSalary(rs.getDouble("salary"));
				eb.setGender(rs.getString("Gender"));
				eb.setHobby(rs.getString("hobbay"));
				list.add(eb);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	
}
