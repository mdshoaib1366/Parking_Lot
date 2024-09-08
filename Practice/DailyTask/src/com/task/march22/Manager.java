package com.task.march22;

public class Manager {
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double hra;
	private double da;
	private double projectAllowance;

	public Manager(int managerId, String managerName, double basicSalary, double hra, double da,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary() 
	{
		return basicSalary +hra +da + projectAllowance;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + ", projectAllowance=" + projectAllowance + "]";
	}
}
