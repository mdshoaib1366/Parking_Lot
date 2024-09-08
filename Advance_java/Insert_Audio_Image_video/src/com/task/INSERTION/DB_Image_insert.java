package com.task.INSERTION;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DB_Image_insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
					
				PreparedStatement ps = con.prepareStatement("insert into streamTab63 values (?,?)");
				
				System.out.println("Enter the id: ");
				int id = Integer.parseInt(sc.next());
				ps.setInt(1, id);
				System.out.println("Enter fpath & fname: ");
				File f = new File(sc.next());
				if(f.exists())
				{
					FileInputStream fin = new FileInputStream(f);
					ps.setBinaryStream(2, fin, f.length());
					int k = ps.executeUpdate();
					if(k>0)
					{
						System.out.println("Row inserted successfully...");
					}
					fin.close();
				}
				else
				{
					System.out.println("invalid fpath or fname...");
				}
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
}
