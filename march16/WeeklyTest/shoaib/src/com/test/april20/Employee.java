package com.test.april20;

public class Employee {
	protected String name;
	protected String role;

	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public void displayInfo()
	{
		 System.out.println("name: "+name+"role: "+role);
	}
	
	public double calculateSalary()
	{
		return 0.0;
	}
}
