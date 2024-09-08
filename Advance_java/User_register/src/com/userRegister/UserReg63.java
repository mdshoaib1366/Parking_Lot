package com.userRegister;

import java.util.Scanner;
import java.sql.*;

public class UserReg63 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				
				PreparedStatement ps1 = con.prepareStatement("insert into userreg63 values (?,?,?,?,?,?,?)");
				
//				PreparedStatement ps2 = con.prepareStatement("Select * from userreg63");
				PreparedStatement ps2 = con.prepareStatement("Select * from userreg63 where uname=? and pword=?");
								
				PreparedStatement ps3 = con.prepareStatement("Update userreg63 set addr=?,mid=?,phno=? where uname=? and pword=?");
				
				PreparedStatement ps4 = con.prepareStatement("Delete from userreg63 where uname=? and pword=?");
				System.out.println("\t*****user registration*****\n");
				while(true)
				{
					System.out.println();
					System.out.print("\t1.AddUser(Register)"
							+"\n\t2.ViewUserDetails(user & password req)"
							+"\n\t3.UpdateUserDetail"
							+"\n\t4.DeteteUserDetail"
							+"\n\t5.Exit");
					System.out.print("\nChoice anyone option: ");
					switch(Integer.parseInt(s.next()))
					{
						case 1:
							System.out.println("Enter username: ");
							String uname = s.next();
							System.out.println("Enter password: ");
							String pword = s.next();
							System.out.println("Enter first-name: ");
							String fname = s.next();
							System.out.println("Enter last-name: ");
							String lname = s.next();
							System.out.println("Enter address: ");
							String addr = s.next();
							System.out.println("Enter mail-Id: ");
							String mid = s.next();
							System.out.println("Enter Phone number: ");
							Long phno = s.nextLong();
							
							ps1.setString(1, uname);
							ps1.setString(2, pword);
							ps1.setString(3, fname);
							ps1.setString(4, lname);
							ps1.setString(5, addr);
							ps1.setString(6, mid);
							ps1.setLong(7, phno);
							
							int k = ps1.executeUpdate();
							if(k>0)
							{
								System.out.println("Details added successfully...");
							}
							else
							{
								System.out.println("Details not added...");
							}
							break;
						case 2:
							
							System.out.println("Enter the username: ");
							String uname1 = s.next();
							System.out.println("Enter the password");
							String pword1 = s.next();
							ps2.setString(1, uname1);
							ps2.setString(2, pword1);
							ResultSet rs1 = ps2.executeQuery();
							System.out.println("-------------------------------------------------------------------");
							while(rs1.next())
							{
								System.out.println(rs1.getString(1)
										+"\t"+rs1.getString(2)
										+"\t"+rs1.getString(3)
										+"\t"+rs1.getString(4)
										+"\t"+rs1.getString(5)
										+"\t"+rs1.getString(6)
										+"\t"+rs1.getLong(7));

							}
							System.out.println("-------------------------------------------------------------------");
							break;
						case 3:
							System.out.println("Enter the username: ");
							String uname3 = s.next();
							System.out.println("Enter the password");
							String pword3 = s.next();
							ps2.setString(1, uname3);
							ps2.setString(2, pword3);
							ResultSet rs3 = ps2.executeQuery();
							if(rs3.next())
							{
								System.out.println("your existing addr: "+rs3.getString(5)
								+" ,mail id: "+rs3.getString(6)+" ,phone no: "+rs3.getLong(7));
								System.out.println("Enter the address: ");								
								String addr3 = s.next();
								System.out.println("Enter the Mail Id: ");
								String mid3 = s.next();
								System.out.println("Enter the phone no: ");
								long phno3 = s.nextLong();
								
								ps3.setString(1, addr3);
								ps3.setString(2, mid3);
								ps3.setLong(3, phno3);
								ps3.setString(4, uname3);
								ps3.setString(5, pword3);
								int k3 = ps3.executeUpdate();
								if(k3>0)
								{
									System.out.println("Update success.");
								}
								else
								{
									System.out.println("Not updated");
								}
							}
							
							break;
						case 4:
							System.out.println("Deleting user detail...");
							System.out.println("Enter the uname: ");
							String uname4 = s.next();
							System.out.println("Enter the password: ");
							String pword4 = s.next();
							ps2.setString(1, uname4);
							ps2.setString(2, pword4);
							
							ResultSet rs4 = ps2.executeQuery();
							if(rs4.next())
							{
								ps4.setString(1, uname4);
								ps4.setString(2, pword4);
								int k4 = ps4.executeUpdate();
								if(k4>0)
								{
									System.out.println("Delete successfully...");
								}
							}
							break;
						
						case 5:
							System.out.println("Exit successfully...");
							System.exit(0);
						default:
							System.out.println("invalid input!!!");
					
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
