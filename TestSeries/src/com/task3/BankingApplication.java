package com.task3;

public class BankingApplication {

	public static void main(String[] args) {
		BankingService bs = new BankingService();
		bs.createCurrentAccount();
		
		BankAccount b1 = null;
		b1 = new SavingAccount();
		b1.deposit(500);
		System.out.println(b1.accountType());
		
		b1 = new CurrentAccount();
		b1.deposit(1000);
		
		b1.deposit(200);
		

	}

}
