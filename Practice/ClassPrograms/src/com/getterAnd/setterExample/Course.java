package com.getterAnd.setterExample;

public class Course {
	private String subjectName;
	private String facultyName;
	private int courseDuration;

	public Course(String subjectName, String facultyName, int courseDuration) {
		super();
		this.subjectName = subjectName;
		this.facultyName = facultyName;
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [subjectName=" + subjectName + ", facultyName=" + facultyName + ", courseDuration="
				+ courseDuration + "]";
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getSubjectName() {
		return subjectName;
	}

}
