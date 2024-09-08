package com.assignment.stuReport;

import java.sql.*;
import java.util.*;

public class DBcon_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s;) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
				CallableStatement cs = con.prepareCall("{call CreateAccount63(?,?,?,?,?,?,?,?,?)}");

				System.out.print("Enter the AccNo:");
				long accNo = Long.parseLong(s.nextLine());
				System.out.print("Enter the Name:");
				String cName = s.nextLine();
				System.out.print("Enter the Balance:");
				float bal = Float.parseFloat(s.nextLine());
				System.out.print("Enter the AccType:");
				String accType = s.nextLine();
				System.out.print("Enter the City:");
				String city = s.nextLine();
				System.out.print("Enter the State:");
				String state = s.nextLine();
				System.out.print("Enter the PinCode:");
				int pinCode = Integer.parseInt(s.nextLine());
				System.out.print("Enter the MailId:");
				String mId = s.nextLine();
				System.out.print("Enter the PhoneNo:");
				long phNo = s.nextLong();
				cs.setLong(1, accNo);
				cs.setString(2, cName);
				cs.setFloat(3, bal);
				cs.setString(4, accType);
				cs.setString(5, city);
				cs.setString(6, state);
				cs.setInt(7, pinCode);
				cs.setString(8, mId);
				cs.setLong(9, phNo);
				cs.execute();
				System.out.println("Procedure executed Successfully...");
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		} // end of try with resource
	}
}
