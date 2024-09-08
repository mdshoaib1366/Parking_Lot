package com.task.INSERTION;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB_Image_Retreive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
					
				PreparedStatement ps = con.prepareStatement("select * from streamtab63 where id=?");
				
				System.out.println("Enter the id: ");
				int id = Integer.parseInt(sc.next());
				ps.setInt(1, id);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					Blob b = rs.getBlob(2);
					byte[] by = b.getBytes(1, (int)b.length());
					System.out.println("Enter the fpath & fname: ");
					File f = new File(sc.next());
					FileOutputStream fout = new FileOutputStream(f);
					fout.write(by);
					System.out.println("retreive image successfully....");
					fout.close();
				}
				else
				{
					System.out.println("invalid id...");
				}
				con.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
