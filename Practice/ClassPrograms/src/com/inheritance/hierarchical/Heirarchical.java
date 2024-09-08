package com.inheritance.hierarchical;

public class Heirarchical {
	public static void main(String[] args) {
		Developer d = new Developer(12000);
		System.out.println("Developer salary : "+d.getSalary());
		
		Designer d1 = new Designer(10000);
		System.out.println("Designer salary: "+d1.getSalary());
	}
}
