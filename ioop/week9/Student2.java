package edu.manipal.mit;

public class Student2 {
    private String name;
    private int rollNumber;

    // Public setter methods to set values for name and rollNumber
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
