package edu.manipal.mit;

public class Student1 {
    String name;
    int rollNumber;

	public Student1(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
