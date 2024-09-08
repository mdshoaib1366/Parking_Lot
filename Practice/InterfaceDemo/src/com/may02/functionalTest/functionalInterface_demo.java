package com.may02.functionalTest;

public class functionalInterface_demo {

	public static void main(String[] args) {
		Student arts = new Student()
				{
					@Override
					public void writeExam()
					{
						System.out.println("Arts student writing the exam.");
					}
				};
		Student science = new Student()
				{
					@Override
					public void writeExam()
					{
						System.out.println("Science student writing the exam.");
					}
				};
		arts.writeExam(); 
		science.writeExam();

	}

}
