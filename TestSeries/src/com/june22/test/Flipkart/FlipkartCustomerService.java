package com.june22.test.Flipkart;

import java.util.ArrayList;

public class FlipkartCustomerService {
	private ArrayList<FlipkartCustomer> al;
	private FlipkartCustomer fk;
	
	
	
	public FlipkartCustomerService(FlipkartCustomer fk) {
		super();
		this.fk = fk;
	}

	public void addFlipkartCustomer(FlipkartCustomer customer)
	{
		al =new ArrayList<FlipkartCustomer>();
		
		for(int i=0; i<3; i++) {
		al.add(new FlipkartCustomer(fk.getCustId(),fk.getCutomerName(),fk.getEmail(),fk.getAddress(),fk.getOrdersCount(),fk.getPhone()));
//		al.add(new FlipkartCustomer(12,"john","john@gmail.com","mum",2,"9543393922"));
//		al.add(new FlipkartCustomer(13,"joy","joy@gmail.com","del",5,"954300000"));
		}
	}
	
	public boolean isFirstCustomer(FlipkartCustomer customer)
	{
		if(customer.getPhone().equals(al.get(1).getPhone()))
		{
			return false;
		}
		return true;
	}
	
	public double calculateBill(FlipkartCustomer customer)
	{
		if(isFirstCustomer(customer)) {
			return 0;
		}
		else if(customer.getOrdersCount()<4)
		{
			return 180;
		}
		else
		{
			return 180+6*customer.getOrdersCount();
		}
		
	}
	
	String printBill(FlipkartCustomer customer)
	{
		return customer.getCutomerName()+" Please pay your bill of Rs."+this.calculateBill(customer);
	}
	
}
