package com.task.march25;

public class Employee {
	private String empName;
	private int age;
	private double salary;
	private String department;

	public Employee(String empName, int age, double salary, String department) {
		super();
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public Employee(Employee e)
	{
		this.empName = e.empName;
		this.age = e.age;
		this.salary = e.salary;
		this.department = e.department;
	}
	
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public void raiseSalary(double percentage)
	{
		this.salary = salary+(salary+percentage);
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", salary=" + salary + ", department=" + department
				+ "]";
	}

}
