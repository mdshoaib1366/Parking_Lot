package com.association.exam;

public class Student {
	private int regNumber;
	private String studentName;
	private double studentfee;
	private String studentAddress;

	public Student(int regNumber, String studentName, double studentfee, String studentAddress) {
		super();
		this.regNumber = regNumber;
		this.studentName = studentName;
		this.studentfee = studentfee;
		this.studentAddress = studentAddress;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentfee() {
		return studentfee;
	}

	public void setStudentfee(double studentfee) {
		this.studentfee = studentfee;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [regNumber=" + regNumber + ", studentName=" + studentName + ", studentfee=" + studentfee
				+ ", studentAddress=" + studentAddress + "]";
	}

	
}
