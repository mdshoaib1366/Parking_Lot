package com.may09.task2;

import java.util.function.Supplier;

public class StudentIdDistributer {
	public static void main(String[] args) {
		Student stu = new Student("John", "Nit001",'B');
		Supplier<String> s1 = () -> {
			//int r1 = 
			String roll =  "Nit"+((int)(Math.random()*1000));
			
			 return roll; 
		};
		
		System.out.println("Sudent Id: "+s1.get());
		
	}
}
