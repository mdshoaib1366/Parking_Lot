package com.emp02;

import java.util.Scanner;
import java.sql.*;

public class EmployeeMain {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				
				PreparedStatement ps1 = con.prepareStatement("insert into Employee69 values (?,?,?,?,?,?)");
				PreparedStatement ps21=con.prepareStatement("Select * from employee69 where empid=?");
				PreparedStatement ps2 = con.prepareStatement("Update Employee69 set empsal=?,empMailId=?,empphno=? where empid=?");
				PreparedStatement ps3 = con.prepareStatement("Select * from Employee69 where empName like ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				PreparedStatement ps51 = con.prepareStatement("Select max(empsal) from  employee69",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				PreparedStatement ps5 = con.prepareStatement("delete from employee69 where empsal=?");
				PreparedStatement ps6 = con.prepareStatement("Select * from Employee69");
				while(true)
				{
					System.out.println("******choice******");
					System.out.println("\n\t1.Insert data into Employee Table."
					+"\n\t2.Update employee salary, Mail and phno."
					+"\n\t3.Find those employee whose name starts with 'A'."
					+"\n\t4.Count how many employee record present in table."
					+"\n\t5.delete employee who is getting maximum salary."
					+"\n\t6.Show all employee."
					+"\n\t7.Exit");
					
					System.out.print("Enter your choice: ");
					switch(Integer.parseInt(sc.next()))
					{
						case 1: 
							System.out.print("Enter the empid: ");
							String empid1 = sc.next();
							System.out.print("Enter the empName: ");
							String empName1 = sc.next();
							System.out.print("Enter the empSal: ");
							float empSal1 = Float.parseFloat(sc.next());
							System.out.print("Enter the empAddr: ");
							String empAddr1 = sc.next();
							System.out.print("Enter the empMailId: ");
							String empMailId1 = sc.next();
							System.out.print("Enter the empPhno: ");
							Long empPhno1 = Long.parseLong(sc.next());
							ps1.setString(1, empid1);
							ps1.setString(2, empName1);
							ps1.setFloat(3, empSal1);
							ps1.setString(4, empAddr1);
							ps1.setString(5, empMailId1);
							ps1.setLong(6, empPhno1);
							
							int k1 = ps1.executeUpdate();
							if(k1>0)
							{
								System.out.println("Insered  Employee details Successfully...");
							}
							break;
						case 2: 
							System.out.print("Enter ur empid u wnat to update: ");
							String empid2 = sc.next();
							ps21.setString(1, empid2);
							
							ResultSet rs2 = ps21.executeQuery(); 
							if(rs2.next())
							{
								System.out.println("ur existing salary: "+rs2.getFloat(3)
										+" ,Mail-id: "+rs2.getString(5)+" ,Phone no: "+rs2.getLong(6));
								
								System.out.print("Enter ur new Salary: ");
								float empsal2 = Float.parseFloat(sc.next());
								System.out.print("Enter ur new Mail Id: ");
								String empMailId2 = sc.next();
								System.out.print("Enter ur new Phone no: ");
								Long empPhno2 = Long.parseLong(sc.next());
								ps2.setFloat(1, empsal2);
								ps2.setString(2, empMailId2);
								ps2.setLong(3, empPhno2);
								ps2.setString(4, empid2);
								int k2 = ps2.executeUpdate();
								if(k2>0){
									System.out.println("Update successfully...");
								}
								
							}
							break;
						case 3: 
							System.out.println("Enter ur Latter: ");
							String n = sc.next();
							ps3.setString(1, n+'%');
							ResultSet rs3 = ps3.executeQuery();
							if(rs3.next()) {
								rs3.relative(-1);
								while(rs3.next())
								{
									System.out.println(rs3.getString(2));
								}
							}
							else
							{
								System.out.println("Not found...");
							}
							break;
						case 4: 
							ResultSet rs4 = ps6.executeQuery();
							int count=0;
							while(rs4.next())
							{
								count++;
							}
							System.out.println(count+"<-record(s) are present in the Employee table.");
							break;
						case 5: 
							ResultSet rs5 = ps51.executeQuery();
							if(rs5.next()) {
								float f = rs5.getFloat(1);
								ps5.setFloat(1, f);
								rs5.relative(-1);
							}
//								System.out.println(rs5.getFloat(1));
							
							int k5 = ps5.executeUpdate();
							if(k5>0)
							{
								System.out.println("Delete Successfully...");
							}
							break;
						case 6: 
							ResultSet rs6 = ps6.executeQuery();
							System.out.println("-----------------------------------------------------------------------------------");
							while(rs6.next())
							{
								System.out.println(rs6.getString(1)
										+"\t"+rs6.getString(2)
										+"\t"+rs6.getFloat(3)
										+"\t"+rs6.getString(4)
										+"\t"+rs6.getString(5)
										+"\t"+rs6.getLong(6)
										);
							}
							System.out.println("-----------------------------------------------------------------------------------");
							break;
						case 7: 
							System.out.println("Successful Exit.");
							System.exit(0);
					default: 
							System.out.println("Invalid input...");
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
