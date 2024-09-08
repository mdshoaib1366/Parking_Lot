package saturdayTest;

public class Course {
	private String courseCode;
	private String courseName;

	public Course(String courseCode, String courseName) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + "]";
	}

	
}
