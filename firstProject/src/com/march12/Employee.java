package com.march12;

public class Employee {
	int employeeId;
	String employeeName;
	
	public void setDetails()
	{
		employeeId = 101;
		employeeName = "Atul";
	}
	public void getDetails()
	{
		System.out.println("Employee ID is : "+employeeId);
		System.out.println("Employee name is : "+employeeName);
	}
}
