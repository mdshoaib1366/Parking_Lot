package com.overriding.april19;

public class BankManagementSystem {
	public static void main(String[] args) {
		Account sav = new SavingAccount("1234", 100000, 12);
		sav.generateStatement();
		
//		Account chek = new CheckingAccount("2355", 2000.56, 2000.5);
//		chek.generateStatement();
		
		Account chek = sav;
		chek.generateStatement();
	}
}
