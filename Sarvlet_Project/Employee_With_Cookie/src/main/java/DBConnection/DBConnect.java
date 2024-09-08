package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{
	private static Connection con;
	private DBConnect() {}
	static 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBInfo.DBUrl,DBInfo.DBUsername,DBInfo.DBPassword);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
