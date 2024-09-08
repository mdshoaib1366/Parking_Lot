package com.csvToDataBase;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CSV_Into_DB {
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
			
			PreparedStatement ps = con.prepareStatement("insert into emp_csv values(?,?,?,?,?)");
			
			FileInputStream fin = new FileInputStream("C:\\Users\\moham\\Pictures\\myCsv.csv");
			Scanner sc = new Scanner(fin);
			sc.nextLine();
			while(sc.hasNext())
			{
				String[] split = sc.nextLine().split(",");
				for(int i=1; i<=split.length; i++)
				{
					ps.setString(i, split[i-1]);
					
				}
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
