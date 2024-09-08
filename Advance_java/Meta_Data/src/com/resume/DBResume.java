package com.resume;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Scanner;

public class DBResume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try 
			{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
		
			PreparedStatement ps = con.prepareStatement("Select * from empp_info where empPhone = ?");
			System.out.println("enter the phno: ");
			Long phone = Long.parseLong(sc.nextLine());
			
			ps.setLong(1, phone);
			
			ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					String str = ""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getLong(5);
					byte b[] = str.getBytes();
					System.out.println("Enter pathName & FileName: ");
					File f = new File(sc.nextLine());
					FileOutputStream fout = new FileOutputStream(f);
					fout.write(b);
					
					
					
					System.out.println();
					System.out.println("Successful");
					fout.close();					
				}		
				
			}
			
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
	}
}
