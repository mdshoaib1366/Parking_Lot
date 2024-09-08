package com.task.march22;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double da;

	public Employee(int employeeId, String employeeName, double basicSalary, double hra, double da) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
	}

	
	public double calculateGrossSalary()
	{
		return this.basicSalary + this.hra + this.da;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + "]";
	}
	
	
}
