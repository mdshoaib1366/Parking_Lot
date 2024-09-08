package com.task2.Prepared;

import java.sql.*;
import java.util.*;

public class Conn01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(sc;)
		{
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				PreparedStatement ps = con.prepareStatement("insert into employee01 values (?,?,?,?,?,?,?)");
				
				PreparedStatement ps1 = con.prepareStatement("Select * from employee01");
				
				PreparedStatement ps2 = con.prepareStatement("Select * from employee01 where eid=?");
				
				PreparedStatement ps3 = con.prepareStatement("Update employee01 set esal=?,hra=?,da=?,totsal=? where eid=?");
				
				PreparedStatement ps5 = con.prepareStatement("Delete from employee01 where eid=?");
				while(true)
				{
					
					System.out.println("\n*******choice*******\n");
					System.out.println("\t1.Add Employee"
							+"\n\t2.View All Employees"
							+"\n\t3.Update Employee by Id(esal)"
							+"\n\t4.Delete Employee by Id"
							+"\n\t5.Exit");
					System.out.print("Enter your choice: ");
//					int choice = );
				
					switch(Integer.parseInt(sc.next()))
					{
						case 1:System.out.println("--------Employee Details----------");
								System.out.print("Enter Emp-id: ");
								String eid = sc.next();
								System.out.print("Enter Emp-name: ");
								String ename = sc.next();
								System.out.print("Enter Emp-degn: ");
								String edegn= sc.next();
								System.out.print("Enter Emp-bsal: ");
								int bsal = sc.nextInt();
								float hra = 0.54F*bsal;
								float da = 0.63F*bsal;
								float totsal =  hra + da + bsal;
								
								// loading data to PreparedStatement object
								ps.setString(1, eid);
								ps.setString(2, ename);
								ps.setString(3, edegn);
								ps.setInt(4, bsal);
								ps.setFloat(5, hra);
								ps.setFloat(6, da);
								ps.setFloat(7, totsal);
								
								int k = ps.executeUpdate(); //execution process
								if(k>0)
								{
									System.out.println("Employee details added succesfully.");
								}
								else
								{
									System.out.println("Employee not added.");
								}
							break;
						case 2:
							ResultSet rs = ps1.executeQuery();
							while(rs.next())
							{
								
								System.out.println(rs.getString(1)+"\t"
										+"\t"+rs.getString(2)
										+"\t"+rs.getString(3)
										+"\t"+rs.getLong(4)
										+"\t"+rs.getFloat(5)
										+"\t"+rs.getFloat(6)
										+"\t"+rs.getFloat(7));
								
							}
							break;
							
						case 3:
							
							System.out.println("Enter id you want to update: ");
							String eid2 = sc.next();
							ps2.setString(1, eid2);
														
							ResultSet rs3 = ps2.executeQuery();
							if(rs3.next()) {
								System.out.println("your existing Salary: "+rs3.getLong(4));
								System.out.println("Enter salary you want to update: ");
								int bsal1 = sc.nextInt();
								
								float hra1 = 0.54F*bsal1;
								float da1 = 0.63F*bsal1;
								float totsal1 =  hra1 + da1 + bsal1;
								
								ps3.setInt(1, bsal1);
								ps3.setFloat(2, hra1);
								ps3.setFloat(3, da1);
								ps3.setFloat(4, totsal1);
								ps3.setString(5, eid2);
								
								int k1 = ps3.executeUpdate();
								if(k1>1)
								{
									System.out.println("Update successfully...");
								}
								
							}												
							break;
						case 4:
							
							System.out.println("Enter id u wnat to delete: ");
							String eid3= sc.next();
							ps2.setString(1, eid3);
							
							ResultSet rs4 = ps2.executeQuery();
							if(rs4.next())
							{
								ps5.setString(1, eid3);
								int k4 = ps5.executeUpdate();
								if(k4>0)
								{
									System.out.println("Delete employee details successfully...");
								}
							}
							
							break;
						case 5:
							System.out.println("Exit successfully...");
							System.exit(0);
						default:
							System.out.println("Invalid option...");
							
					}
				}
			}
			catch(SQLIntegrityConstraintViolationException se)
			{
				System.out.println("Employee already exist.");
			}
			catch(Exception e)
			{
				System.out.println(e);
//				e.getStackTrace();
			}
		}
	}
}
