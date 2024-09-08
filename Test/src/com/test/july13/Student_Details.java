package com.test.july13;

import java.util.Scanner;
import java.sql.*;

public class Student_Details {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BATCH30","ORACLE");
			
				CallableStatement cs = con.prepareCall("{call ?:= stu_fun}");
				
				cs.registerOutParameter(1, Types.VARCHAR);
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.VARCHAR);
				cs.registerOutParameter(4, Types.VARCHAR);
				cs.registerOutParameter(5, Types.BIGINT);
				
				 cs.executeQuery();
				 System.out.println("Successful...");
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
