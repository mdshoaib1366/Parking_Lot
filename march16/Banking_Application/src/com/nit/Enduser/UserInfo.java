package com.nit.Enduser;

public class UserInfo {

	private String customer_Name;
	private String customer_adharNo;
	private String customer_MobileNo;
	private double balance;
	public UserInfo() {
		super();
	}
	public UserInfo(String customer_Name, String customer_adharNo, String customer_MobileNo, double balance) {
		super();
		this.customer_Name = customer_Name;
		this.customer_adharNo = customer_adharNo;
		this.customer_MobileNo = customer_MobileNo;
		this.balance = balance;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomer_adharNo() {
		return customer_adharNo;
	}
	public void setCustomer_adharNo(String customer_adharNo) {
		this.customer_adharNo = customer_adharNo;
	}
	public String getCustomer_MobileNo() {
		return customer_MobileNo;
	}
	public void setCustomer_MobileNo(String customer_MobileNo) {
		this.customer_MobileNo = customer_MobileNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "UserInfo [customer_Name=" + customer_Name + ", customer_adharNo=" + customer_adharNo
				+ ", customer_MobileNo=" + customer_MobileNo + ", balance=" + balance + "]";
	}
	
	

}

