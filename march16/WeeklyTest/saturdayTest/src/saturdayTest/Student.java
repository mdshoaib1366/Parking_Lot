package saturdayTest;

public class Student {
	private int enrollmentNumber;
	private String studentName;
	private int grade1;
	private int grade2;
	private int grade3;
	private Course course;

	public Student(int enrollmentNumber, String studentName, int grade1, int grade2, int grade3, Course course) {
		super();
		this.enrollmentNumber = enrollmentNumber;
		this.studentName = studentName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.course = course;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

	public int getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public Course getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [enrollmentNumber=" + enrollmentNumber + ", studentName=" + studentName + ", grade1=" + grade1
				+ ", grade2=" + grade2 + ", grade3=" + grade3 + ", course=" + course + "]";
	}

	
	
}
