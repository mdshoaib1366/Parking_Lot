package com.hasa.march20;

public class Student {
	private int roll;
	private String name;
	private College clg;

	public Student(int roll, String name, College clg) {
		super();
		this.roll = roll;
		this.name = name;
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", \nclg=" + clg + "]";
	}

}
