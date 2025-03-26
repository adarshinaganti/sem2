package edu.manipal.mit;

public class Student {
	private String name;
	private int rollNo;
	protected String department;
	public double gpa;

	public Student(String name, int rollNo, String department, double gpa) {
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
		this.gpa = gpa;
	}

	public String get_name() {
		return name;
	}

	public int get_rollNo() {
		return rollNo;
	}

	public String get_department() {
		return department;
	}

	public double get_gpa() {
		return gpa;
	}
}