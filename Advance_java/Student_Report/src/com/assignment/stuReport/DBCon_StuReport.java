package com.assignment.stuReport;

import java.sql.*;
import java.util.Scanner;

public class DBCon_StuReport 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				
				CallableStatement cs = con.prepareCall("{call StudentReport(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
				System.out.print("Enter Roll No: ");
				int rollNo = Integer.parseInt(sc.next());
				System.out.print("Enter Student Name: ");
				String name = sc.next();
				System.out.print("Enter Student Branch: ");
				String branch = sc.next();
				System.out.print("Enter Student City: ");
				String city = sc.next();
				System.out.print("Enter Student State: ");
				String state = sc.next();
				System.out.print("Enter Student Pincode: ");
				int pin = Integer.parseInt(sc.next());
				System.out.print("Enter Student Mail Id: ");
				String mid = sc.next();
				System.out.print("Enter Student Phone No: ");
				long phno = Long.parseLong(sc.next());
				System.out.print("Enter Student sub1 Marks: ");
				int sub1 = Integer.parseInt(sc.next());
				System.out.print("Enter Student sub2 Marks: ");
				int sub2 = Integer.parseInt(sc.next());
				System.out.print("Enter Student sub3 Marks: ");
				int sub3 = Integer.parseInt(sc.next());
				System.out.print("Enter Student sub4 Marks: ");
				int sub4 = Integer.parseInt(sc.next());
				System.out.print("Enter Student sub5 Marks: ");
				int sub5 = Integer.parseInt(sc.next());
				System.out.print("Enter Student sub6 Marks: ");
				int sub6 = Integer.parseInt(sc.next());
				
				int obMarks = sub1+sub2+sub3+sub4+sub5+sub6;
				float per = (obMarks/600f)*100F;
				String res = "Fail";
				
				cs.setInt(1, rollNo);
				cs.setString(2, name);
				cs.setString(3, branch);
				cs.setString(4, city);
				cs.setString(5, state);
				cs.setInt(6, pin);
				cs.setString(7, mid);
				cs.setLong(8, phno);
				
			if(0<=sub1 && sub1<=100)
			{
				cs.setInt(9, sub1);    				
			}
			
			if(0<=sub2 && sub2<=100) 
			{ 
				cs.setInt(10, sub2);	
			}
			
			if(0<=sub3 && sub3<=100) 
			{
				cs.setInt(11, sub3);	
			}
			
			if(0<=sub4 && sub4<=100) 
			{
				cs.setInt(12, sub4);	
			}
			
			if(0<=sub5 && sub5<=100) 
			{
				cs.setInt(13, sub5);	
			}
			
			if(0<=sub6 && sub6<=100)
			{
				cs.setInt(14, sub6); 	
			}
			
				cs.setInt(15, obMarks);
				cs.setFloat(16, per);
				if(sub1<34 || sub2<34 || sub3<34 || sub4<34 || sub5<34 || sub6<34)
				{
					cs.setString(17, res);
				}
				else
				{
					res = "Pass";
					cs.setString(17, res);
				}
				
				cs.execute();
				System.out.println("Procedure executed Successfully...");
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
//				e.printStackTrace();
			}
			
		}
		

	}

}
