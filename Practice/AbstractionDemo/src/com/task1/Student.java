package com.task1;

public abstract class Student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	public abstract int getPercentage();

	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}


	public Student() {
		super();

	}

	public Student(String studentName, String studentClass,int n) {
		this();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents = n;
	}

}
