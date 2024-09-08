package com.task.march18;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bank Name: ");
		String bankName = sc.nextLine();
		//bankName = sc.nextLine();
		
		System.out.print("Enter bank Customer Name: ");
		String bankCustomerName = sc.nextLine();
		//bankCustomerName = sc.nextLine();
		
		System.out.print("Enter bank Address: ");
		String bankAddress = sc.nextLine();
		//bankAddress = sc.nextLine();
		
		System.out.print("Enter bank IFSC Code: ");
		String bankIFSCCode = sc.nextLine();
		//bankIFSCCode = sc.nextLine();
		
		System.out.print("Enter Customer Account Number: ");
		int customerAccountNumber = sc.nextInt();
		
		System.out.print("Enter Current Balance: ");
		int currentBalance = sc.nextInt();
		
		Bank sbi = new Bank();
		sbi.setdetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
//		sbi.setdetails("State Bank Of India", "Mohammad Shoaib", "Ameerpet, Hyderabad", "sbi091234", 123456789, 1000);
		sbi.currentBalance();
		sbi.deposit(2000);
		sbi.withdraw(1000);
		System.out.println(sbi.displayDetails()); 
		
		sc.close();
		
	}

}
