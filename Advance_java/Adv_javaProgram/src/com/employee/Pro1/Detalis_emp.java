package com.employee.Pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Detalis_emp {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
			Statement stm = con.createStatement();
			
			ResultSet res = stm.executeQuery("Select * from Employee");
			System.out.println("ID\tNAME\tDESIGNATION\tBSALARY");
			System.out.println("---------------------------------------");
			
			while(res.next())
			{
				System.out.println(res.getLong(1)+"\t"
						+res.getString(2)+"\t"+res.getString(3)
						+"\t"+res.getLong(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
