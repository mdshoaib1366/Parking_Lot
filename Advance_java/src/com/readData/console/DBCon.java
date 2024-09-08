package com.readData.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class DBCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.print("Enter the mobile number: ");
			long phno = Long.parseLong(sc.nextLine());
			System.out.print("Enter the cust-Name: ");
			String cName = sc.nextLine();
			System.out.print("Enter the cust-city: ");
			String cCity = sc.nextLine();
			System.out.print("Enter the cust-MailId: ");
			String cMail = sc.nextLine();
			
			//Loading class 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establishing connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe","BATCH30","ORACLE");
			
			//creating statement
			Statement smt = con.createStatement();
			
			//updating table
			int k = smt.executeUpdate("insert into customer values("+phno+",'"+cName+"','"+cCity+"','"+cMail+"')");
			System.out.println("The value of k: "+k);
			if(k>0)
			{
				System.out.println("Customer details inserted successfully......... ");
			}
			con.close();
			
		}
		catch(SQLIntegrityConstraintViolationException se)
		{
			System.out.println("Customer details already available.");
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
