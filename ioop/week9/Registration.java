package edu.manipal.mit;

import edu.manipal.mit.Course;
import edu.manipal.mit.Student;

public class Registration {
	private Student student;
	private Course course;

	public Registration(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	public void registerStudent() {
		System.out.println("Student Details:");
		System.out.println("Name: " + student.get_name());
		System.out.println("Roll Number: " + student.get_rollNo());
		System.out.println("Department: " + student.get_department());
		System.out.println("GPA: " + student.get_gpa());

		System.out.println("Course Details:");
		System.out.println("Name: " + course.get_courseName());
		System.out.println("Instructor: " + course.get_instructor());
		System.out.println("Credits: " + course.get_credits());
	}
}