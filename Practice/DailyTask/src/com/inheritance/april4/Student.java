package com.inheritance.april4;

public class Student {
	protected int StudentId;
	protected String studentName;
	protected double examFee;
	
	
	public Student(int studentId, String studentName, double examFee) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.examFee = examFee;
	}

	public double payFee()
	{
		return examFee;
	}

	public void displayDetails()
	{
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", examFee=" + examFee + "]";
	}
	
	
}
