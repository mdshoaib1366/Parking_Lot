package com.LoginAndRegister;

import java.sql.*;

public class DBConnection 
{
	private static Connection con=null;
	private DBConnection() {}
	static 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(DBInfo.DBurl,DBInfo.DBuname,DBInfo.DBpword);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
