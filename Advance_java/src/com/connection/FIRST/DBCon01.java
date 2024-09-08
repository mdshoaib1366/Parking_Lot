package com.connection.FIRST;

import java.sql.*;

public class DBCon01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery("SELECT * FROM CUSTOMER");
			
			System.out.println("============================================");
			
			while(rs.next())
			{
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"
						+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
