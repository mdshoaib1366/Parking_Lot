package com.DBMeta;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DB_Metadata {
	public static void main(String[] args) {
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
		
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println("Product Name: "+dmd.getDatabaseProductName());
			System.out.println("Product Version: "+dmd.getDatabaseProductVersion());
			System.out.println("Driver Name: "+dmd.getDriverName());
			System.out.println("Driver Version: "+dmd.getDriverVersion());
			System.out.println("Maximum Columns in table: "+dmd.getMaxColumnsInSelect());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
