package com.task1;

public class HistoryStudent extends Student{

	private int civicsMarks;
	private int historyMarks;
	
	public HistoryStudent(String studentName, String studentClass,int n,int civicsMarks, int historyMarks) {
		super(studentName, studentClass, n);
		this.civicsMarks = civicsMarks;
		this.historyMarks = historyMarks;
	}


	@Override
	public int getPercentage()
	{
		int percentage = ((civicsMarks+historyMarks)/2);
		return percentage;
	}
	
}
