package com.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo
{
	private static Connection con;
	private DBInfo() {}
	static 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBConnect.DBUrl,DBConnect.DBUser,DBConnect.DBPword);
			
		}
		catch(Exception e)
		{
//			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
