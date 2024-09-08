package com.polymorphism.april10;

class Customer
{
	int custId; //111
	
	Customer(int id)
	{
		custId= id;
	}
}

public class Test3
{
  public static void main(String[] args) 
  {
	 Customer c1 = new Customer(111);
	 changeId(c1);
	 System.out.println(c1.custId);
  }
  
  public static void changeId(Customer c)
  {
	  c.custId = 222;
  }
  
}