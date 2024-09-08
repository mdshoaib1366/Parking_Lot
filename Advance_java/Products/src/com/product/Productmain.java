package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Productmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
				
				PreparedStatement ps = con.prepareStatement("insert into product01 values (?,?,?,?)");
				PreparedStatement ps2 = con.prepareStatement("Select * from Product01 ",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				PreparedStatement ps3 = con.prepareStatement("Select * from Product01 ",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				System.out.println("\t*****choose Option*****\n");
				while(true)
				{
					System.out.println();
					System.out.print("\t1.Insert productdetails into product table."
							+"\n\t2.Retrieve productdetails in forward direction."
							+"\n\t3.Retrieve productdetails in reverse direction."
							+"\n\t4.Retrieve 3rd record from top"
							+"\n\t5.Retrieve 3rd record from bottom"
							+"\n\t6.Exit");
					System.out.print("\nChoice anyone option: ");
					switch(Integer.parseInt(sc.next()))
					{
						case 1:
							System.out.println("Enter Product Id: ");
							int pid = Integer.parseInt(sc.next());
							System.out.println("Enter Product name: ");
							String pname = sc.next();
							System.out.println("Enter Product Price: ");
							float pPrice = Float.parseFloat(sc.next()); 
							System.out.println("Enter Product Quantity: ");
							int pQty = Integer.parseInt(sc.next());
							
							ps.setInt(1, pid);
							ps.setString(2, pname);
							ps.setFloat(3, pPrice);
							ps.setInt(4, pQty);
							
							int k = ps.executeUpdate();
							if(k>0)
							{
								System.out.println("Inserted record successfully");
							}
							break;
						case 2:
							ResultSet rs2 = ps2.executeQuery();
							while(rs2.next())
							{
								System.out.println(rs2.getInt(1)
										+"\t"+rs2.getString(2)
										+"\t"+rs2.getFloat(3)
										+"\t"+rs2.getInt(4));
							}
							break;
						case 3:
							ResultSet rs3 = ps3.executeQuery();
							rs3.afterLast();
							while(rs3.previous())
							{
								
								System.out.println(rs3.getInt(1)
										+"\t"+rs3.getString(2)
										+"\t"+rs3.getFloat(3)
										+"\t"+rs3.getInt(4));
							}
							break;
						case 4:
							ResultSet rs4 = ps3.executeQuery();
							rs4.absolute(3);
							
								
								System.out.println(rs4.getInt(1)
										+"\t"+rs4.getString(2)
										+"\t"+rs4.getFloat(3)
										+"\t"+rs4.getInt(4));
							
							break;
						case 5:
							ResultSet rs5 = ps3.executeQuery();
							rs5.afterLast();
							rs5.absolute(-3);
								
								System.out.println(rs5.getInt(1)
										+"\t"+rs5.getString(2)
										+"\t"+rs5.getFloat(3)
										+"\t"+rs5.getInt(4));
							break;
						case 6:
							System.out.println("Exit successfully...");
							System.exit(0);
						default :
						    System.out.println("Invalid option...");
							
					}
					con.close();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
