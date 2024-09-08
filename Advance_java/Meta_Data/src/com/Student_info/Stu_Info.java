package com.Student_info;

import java.sql.*;
import java.util.*;

public class Stu_Info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try 
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				
				Statement smt = con.createStatement();
				
				System.out.println("Enter Non-select Query: ");
				String s = sc.nextLine();
				int k = smt.executeUpdate(s);
				
				System.out.println("value of k: "+k);
				if(k>0)
				{
					System.out.println("Query execute Successfully...");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
