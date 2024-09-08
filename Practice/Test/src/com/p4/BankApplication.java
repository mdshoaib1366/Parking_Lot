package com.p4;

public class BankApplication {
	public static void main(String[] args) {
		 BankAccount b = new BankAccount(10000);
		 try{
			 b.deposit(-1);
			 b.withdraw(10000);
			 System.out.println(b.getBalance());
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	}
}
