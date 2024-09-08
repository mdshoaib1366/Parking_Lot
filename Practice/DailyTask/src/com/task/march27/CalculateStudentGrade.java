package com.task.march27;

public class CalculateStudentGrade {
		public static StudentGrade calculateGrade(Student student)
		{
			int m = Integer.parseInt(student.getStudentMarks());
			
			if(m>90)
			{
				return new StudentGrade(student, 'A');
			}
			else if(m>=75)
			{
				return new StudentGrade(student, 'B');
			}
			else if(m>=60)
			{
				return new StudentGrade(student, 'C');
			}
			else 
			{
				return new StudentGrade(student, 'D');
			}
		}
}
