package edu.manipal.mit;

public class Course {
	private String courseName;
	protected String instructor;
	public int credits;

	public Course(String courseName, String instructor, int credits) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.credits = credits;
	}

	public String get_courseName() {
		return courseName;
	}

	public String get_instructor() {
		return instructor;
	}

	public int get_credits() {
		return credits;
	}
}