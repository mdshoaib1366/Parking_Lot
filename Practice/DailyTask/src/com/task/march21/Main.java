package com.task.march21;

public class Main {

	public static void main(String[] args) {
		Address addr = new Address("Ameerpet","Hyd","Telangana");
		
		Employee  emp = new Employee(123,"NareshIT",addr);
		
		System.out.println(emp);
	}
	
}
