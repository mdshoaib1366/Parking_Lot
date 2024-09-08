package com.employee.Pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Based_ON_Id_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
			Statement stm = con.createStatement();
			
			System.out.print("Eneter the Id: ");
			int id = sc.nextInt();
			ResultSet res = stm.executeQuery("Select * from Employee where eid = "+id+"");
//			System.out.println("ID\tNAME\tDESIGNATION\tBSALARY");
//			System.out.println("---------------------------------------");
			
			if(res.next())
			{
				double hra=0,da=0,totsal=0;
				hra = 0.54*res.getLong(4);
				da =  0.26*res.getLong(4);
				totsal = res.getLong(4)+hra+da;
				
				System.out.println("Employee Id: "+res.getLong(1));
				System.out.println("Employee Name: "+res.getString(2));
				System.out.println("Employee Designation: "+res.getString(3));
				System.out.println("Employee Salary: "+res.getLong(4));
				System.out.println("Employee Hra: "+hra);
				System.out.println("Employee da: "+da);
				System.out.println("Employee Total Salary: "+totsal);
			}
			else
			{
				System.out.println("your enterd invalid id!");
			}
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}
	}
}
