package com.Student_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class Stu_info2 {
	public static void main(String[] args) {
		
			try 
			{	
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
				PreparedStatement ps = con.prepareStatement("Select * from stu_info");
				
				ResultSetMetaData rsm = ps.getMetaData();
				System.out.println(" Total Column: "+rsm.getColumnCount());
				for(int i=1; i<=rsm.getColumnCount(); i++)
				{
				System.out.println("Column name: "+rsm.getColumnName(i));
				System.out.println("Columns date : "+rsm.getColumnTypeName(i));
				}
//				System.out.println(rsm.getColumnLabel(1));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
