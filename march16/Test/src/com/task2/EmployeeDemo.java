package com.task2;

import java.util.function.Supplier;

class Employee{
	String id;

	public Employee(String id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Supplier<String> id = () -> {
			double r= Math.random()*10;
			String str = "User-"+r;
			return str;
		};
//		System.out.println(id.get());
		Employee emp = new Employee(id.get());
		System.out.println(emp);
		
		Employee emp1 = new Employee(id.get());
		System.out.println(emp1);
		Employee emp2 = new Employee(id.get());
		System.out.println(emp2);
	}

}
