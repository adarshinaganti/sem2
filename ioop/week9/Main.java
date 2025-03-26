package edu.manipal.mit;

import edu.manipal.mit.*;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("abc", 123, "CSE", 9.5);
		Course course = new Course("Java", "Dr. XYZ", 4);

		Registration registration = new Registration(student, course);
		registration.registerStudent();
	}
}
