package com.may03.task;

public class BankingSystem {
	public static void main(String[] args) {
		Customer john = new Customer("John", 10000);
		
		Bank sbi  =  new SBI();
		john.deposit(sbi, 12000);
		john.withdraw(sbi, 10000);
		System.out.println("Your Bank_Balance: "+john.checkBalance(sbi));
		
		
		
		
	}
	
	
	
}
