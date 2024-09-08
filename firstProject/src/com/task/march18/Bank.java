package com.task.march18;

public class Bank {
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;
	
	public void setdetails(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance)
	{
		this.bankName = bankName;
		this.bankCustomerName = bankCustomerName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.customerAccountNumber = customerAccountNumber;
		this.currentBalance = currentBalance;
		
	}
	
	public void withdraw(double amount)
	{
		
		if(amount<1000)
		{
			System.out.println("\n--InsufficientBalance--");
		}
		else if(amount>=currentBalance)
		{
			System.out.println("\nMaintain MinimumBalance more than 1000");
		}
		else 
		{
			currentBalance -= amount;
			System.out.println("\nTransaction Successful.\n"
					+ "Available Balance : Rs."+currentBalance);
		}
	}
	
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("\nyou can't be deposited");
		}
		else
		{
			currentBalance += amount;
			System.out.println("\nDeposited Successfully .\r\n"
					+ " Available Balance : Rs."+currentBalance);
		}
	}
	
	public void currentBalance()
	{
		System.out.println("\nCurrent Balance: "+currentBalance);
	}

	
	public String displayDetails() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress
				+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
	
//	public String displayDetails()
//	{
//		return "\n\nBANK NAME: "+ bankName+ "\nBANK CUSTOMER NAME: "+ bankCustomerName+ "\nBANK ADDRESS: "+ bankAddress + "\nBANK IFSC CODE: "+ bankIFSCCode + "\nCUSTOMER ACCOUNT NUMBER: "+ customerAccountNumber + "\nCURRENT BALANCE: "+currentBalance;
//	}
	
	
}
