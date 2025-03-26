package edu.manipal.kmc;

import edu.manipal.mit.Student1;

public class TestAccess {
    public static void main(String[] args) {
        Student1 student = new Student1(); // Compilation error will occur here
        student.name = "Jane Doe";         // Compilation error
        student.rollNumber = 67890;        // Compilation error
        student.displayDetails();          // Compilation error
    }
}
