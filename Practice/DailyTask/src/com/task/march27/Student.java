package com.task.march27;

public class Student {
	private String studentName;
	private String studentMarks;

	public Student(String studentName, String studentMarks) {
		super();
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}

	
}
