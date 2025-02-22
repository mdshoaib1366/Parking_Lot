package com.Trans.Acc1_to_Acc2;

import java.sql.*;
import java.util.Scanner;

public class DBCon01 {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   try(sc;){
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BATCH30", "ORACLE");
		
			PreparedStatement ps1 = con.prepareStatement("select * from bank where accno = ?");
			PreparedStatement ps2 = con.prepareStatement("Update bank set bal=bal+? where accno=?");
			
			System.out.println("Commit-Status: "+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("Commit-Status: "+con.getAutoCommit());
			Savepoint sp = con.setSavepoint();
			
			System.out.println("Enter Home_AccNo: ");
			long hAccno = sc.nextLong();
			ps1.setLong(1, hAccno);
			ResultSet rs1 = ps1.executeQuery();
			if(rs1.next())
			{
				float bal = rs1.getFloat(3);
				System.out.println("Enter Beneficiery_AccNo: ");
				long bAccno = sc.nextLong();
				ps1.setLong(1, bAccno);
				ResultSet rs2 = ps1.executeQuery();
				if(rs2.next())
				{
					System.out.println("Enetr the amount to transfer: ");
					float amt = sc.nextFloat();
					if(amt<=bal) 
					{
						ps2.setFloat(1, -amt);
						ps2.setLong(2, hAccno);
						int p = ps2.executeUpdate();
						
						ps2.setFloat(1, +amt);
						ps2.setLong(2, bAccno);
						int q = ps2.executeUpdate();
						
						if(p==1 && q==1)
						{
							con.commit();
							System.out.println("Transaction Successfull...");
						}
						else
						{
							con.rollback(sp);
							System.out.println("Transaction Failed...");
						}
						
					}
					else
					{
						System.out.println("Insufficient Fund...");
					}
				}
				else
				{
					System.out.println("Invalid bAccNo...");
				}
			}
			else
			{
				System.out.println("Invalid HAccNo...");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	   }
	}
}
