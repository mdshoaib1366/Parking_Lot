package com.may31.task;


public class Manager extends Employee {
	private ManagerType type;

	public Manager(int employeeId, String employeeName, double salary, ManagerType type) {
		super(employeeId, employeeName, salary);
		this.type = type;
	}

	public Manager() {
		super();
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + "]";
	}

	@Override
	public void setSalary(double salary) {
		salary = super.getSalary();
		if(type.equals(type.HR))
		{
			salary+=10000;
		}
		else if(type.equals(type.Sales))
		{
			salary+=5000;
		}
		System.out.println("Manager Salary: "+salary);
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}
	

}
