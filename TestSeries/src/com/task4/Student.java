package com.task4;

public class Student {
	private int studentId;
	private String sttudentName;
	private int marks;
	private char grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String sttudentName, int marks) {
		super();
		this.studentId = studentId;
		this.sttudentName = sttudentName;
		this.marks = marks;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSttudentName() {
		return sttudentName;
	}

	public void setSttudentName(String sttudentName) {
		this.sttudentName = sttudentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sttudentName=" + sttudentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	public void calculateGrade()
	{
		if(marks>90)
		{
			grade = 'A';
			System.out.println("Garde: "+grade);
			
		}
		else if(marks>81 && marks<90)
		{
			grade = 'B';
				System.out.println("Garde: "+grade);
				
		
		}
		else if(marks>71 && marks<80)
		{
			grade = 'C';
			System.out.println("Garde: "+grade);
			
		}
		else if(marks>61 && marks<70)
		{
			grade = 'D';
			System.out.println("Garde: "+grade);
			
		}
		else {
			grade = 'E';
			System.out.println("Grade: "+grade);
		}
		
	}
}
