package com.task2.july13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
				Statement stm = con.createStatement();
				
				System.out.println("eneter id: ");
				String id = sc.nextLine();
				System.out.println("eneter name: ");
				String name = sc.nextLine();
				System.out.println("eneter address: ");
				String address = sc.nextLine();
				System.out.println("eneter salary: ");
				float sal = sc.nextFloat();
				System.out.println("eneter phone: ");
				long phone = sc.nextLong();
				
				stm.addBatch("Insert into empp_info values('"+id+"','"+name+"','"+address+"',"+sal+","+phone+")");
				
				int[] k = stm.executeBatch();
				
				for(int i:k)
				{
					System.out.println(i+"Success");
				}
				
				
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
