package com.task.july04;

import java.sql.*;
import java.util.Scanner;

public class Employee_info {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s;) {
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
			
				Statement smt = con.createStatement();
				
				System.out.println("*****Employee details*****");
				while(true)
				{
					System.out.println("\n\t1.Insert data into Employee Table."
							+"\n\t2.Increase 10% of salary of those employee who is getting salary less than 10000"
							+"\n\t3.Update empAddress with the help of empId."
							+"\n\t4.delete employee who is getting salary greater than 50000."
							+ "\n\t5. Exit");
					
					System.out.println("Enter your choice: ");
					switch(Integer.parseInt(s.next()))
					{
					case 1:
						System.out.println("Enter Id: ");
						int id = Integer.parseInt(s.next());
						System.out.println("Enetr name: ");
						String name = s.next();
						System.out.println("Enter Salary: ");
						float sal = Float.parseFloat(s.next());
						System.out.println("Enter Address: ");
						String addr = s.next();
						System.out.println("Enter Mail Id: ");
						String mail = s.next();
						System.out.println("Enter Phone No: ");
						long phno = s.nextLong();
								
						smt.addBatch("Insert into Employee_info values("+id+",'"+name+"',"
								+sal+",'"+addr+"','"+mail+"',"+phno+")");
						
						int k[] = smt.executeBatch();
						for(int i: k)
						{
							System.out.println("Success: "+i);
						}
						break;
					case 2:
						smt.addBatch("update employee_info set empsalary=empsalary+(empsalary*0.01) where empsalary<10000 ");
						int k2[] = smt.executeBatch();
						for(int i2: k2)
						{
							System.out.println("Success2 : "+i2);
						}
						break;
					case 3:
						System.out.println("Enter Emp Id: ");
						int id2 = Integer.parseInt(s.next());
						System.out.println("Enter new Address: ");
						String addr2 = s.next();
						smt.addBatch("update employee_info set empaddress='"+addr2+"' where empid="+id2+" ");
						int k3[] = smt.executeBatch();
						for(int i3: k3)
						{
							System.out.println("Update Address Succesffully: "+i3);
						}
						break;
					case 4:
						smt.addBatch("delete employee_info where empsalary>50000");
						int k4[] = smt.executeBatch();
						for(int i4: k4)
						{
							System.out.println("delete Emp_info Succesffully: "+i4);
						}
						break;
					case 5:
						System.out.println("Successfully exit...");
						System.exit(0);
					default:
						System.out.println("Invalid choice!!!");
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
