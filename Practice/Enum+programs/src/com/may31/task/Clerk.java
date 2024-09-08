package com.may31.task;

public class Clerk extends Employee {
	private int speed;
	private int accuracy;
	
	
	public Clerk() {
		super();
	}

	public Clerk(int employeeId, String employeeName, double salary, int speed, int accuracy) {
		super(employeeId, employeeName, salary);
		this.speed = speed;
		this.accuracy = accuracy;
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	@Override
	public void setSalary(double salary)
	{
		salary = super.getSalary();
		if((speed>=70 && accuracy>=80) )
		{
			salary+=1000;
			System.out.println(salary);
		}
		else if((speed>=70 && accuracy>=80) && super.getSalary()==2000 )
		{
			System.out.println(salary);
		}
		else
		{
			System.out.println(salary);
		}
		
	}
	
}
