package com.task03july;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Empp_info {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s;) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
				CallableStatement cs = con.prepareCall("{call ?:=Empp_info63 (?) }");
				
				System.out.println("Enter the EmpId: ");
//				long id = Long.valueOf(s.next());
				long id = Long.parseLong(s.next());
				
				cs.registerOutParameter(1, Types.VARCHAR);
				cs.setLong(2, id);
				
				cs.execute();
				System.out.println("Empid: "+id);
				System.out.println("Emp address: "+cs.getString(1));
				
				con.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}
}
