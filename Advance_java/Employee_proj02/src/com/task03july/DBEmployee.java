package com.task03july;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) 
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
				
				PreparedStatement ps1 = con.prepareStatement("insert into emp_info values(?,?,?,?,?)");
				System.out.println("Enter empId: ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter empName: ");
				String name = sc.nextLine();
				System.out.println("Enter empSalary: ");
				float sal = Float.parseFloat(sc.nextLine());
				System.out.println("Enter DOB: ");
				String dob = sc.nextLine();
				
				
				ps1.setInt(1, id);
				ps1.setString(2, name);
				ps1.setFloat(3, sal);
				ps1.setString(5, dob);
				
				System.out.println("Enter fpath & fname: ");
				String path = sc.nextLine();
				File f = new File(path);
				if(f.exists())
				{
					FileInputStream fin = new FileInputStream(f);
					ps1.setBinaryStream(4, fin,f.length());
					int k =ps1.executeUpdate();
					if(k>0)
					{
						System.out.println("Successfull...");
					}
					con.close();
					
				}
				else
				{
					System.out.println("File not found");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
