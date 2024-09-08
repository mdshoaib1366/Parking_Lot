package com.inheritance.hierarchical;

public class Developer extends Employee{
		public Developer(double salary)
		{
			super(salary);
		}
		
		public double getSalary()
		{
			return this.salary;
		}
}
