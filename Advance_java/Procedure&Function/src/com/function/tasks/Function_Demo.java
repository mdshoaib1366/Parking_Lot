package com.function.tasks;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Function_Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s;) {
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
				
				CallableStatement cs = con.prepareCall("{ call ?:= empp_fun(?)}");
				System.out.println("Enter the emp id to fetch the phone no: ");
				int id = s.nextInt();
				
				cs.registerOutParameter(1, Types.BIGINT);
				cs.setInt(2, id);
				
				cs.execute();
				
				System.out.println("=====Details=====");
				System.out.println("id: "+id);
				System.out.println("Name: "+cs.getString(2));
				System.out.println("address: "+cs.getString(3));
				System.out.println("salary: "+cs.getFloat(4));
				System.out.println("phone: "+cs.getLong(5));
				
				cs.close();
				con.close();
			}
			catch(Exception e)
			{
				
			}
		}
	}

}

/*create or replace function empp_fun
  2  (id number) return number as pno number;
  3  begin
  4  select empphone into pno from empp_info where empid=id;
  5  return pno;
  6  end;
  7  /

 */

