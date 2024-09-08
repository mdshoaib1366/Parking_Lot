package com.employee.Pro1;

import java.sql.*;

public class Employee01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
			Statement stm = con.createStatement();
			int id = 114;
			String name = "SONIA";
			String desg = "Manager";
			
			int bSal =15000;
			
			int k = stm.executeUpdate("insert into employee values "
					+ "("+id+",'"+name+"','"+desg+"',"+bSal+")");
			System.out.println(k);
			if(k>0)
			{
				System.out.println("Success...");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
