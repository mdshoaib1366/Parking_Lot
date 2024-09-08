package com.inheritance.april4;

public class Tester { 

	public static void main(String[] args) {
		Student s1=new Student(1, "John Smith", 25000.0);
		s1.displayDetails();
		System.out.println("===========================================");
		
		DayScholar d = new DayScholar(2,"Brian", 25000.0, 5000);
		System.out.println(d);
		d.payFee(18000);
		System.out.println("===========================================");
		
		Hosteller h = new Hosteller(3, "Virat Kohli", 25000.0, 8000);
		System.out.println(h);
		h.payFee(33100);

	}

}
