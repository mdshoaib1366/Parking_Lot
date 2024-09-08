package com.customer.june03;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable{
	private Integer customerId;
	private String customerName;
	private Double customerBill;

	public Customer(Integer customerId, String customerName, Double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

	public static Customer getCustomerObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the customer id: ");
		Integer customerId = sc.nextInt();
		System.out.print("Enter the customer name: ");
		String customerName = sc.nextLine();
		System.out.print("Enter the customer id: ");
		Double customerBill = sc.nextDouble();
		
		return new Customer(customerId, customerName, customerBill);
	}
}
