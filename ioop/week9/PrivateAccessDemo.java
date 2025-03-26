package edu.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student2 student = new Student2();

       
        student.setName("John Doe");
        student.setRollNumber(12345);

       
        student.displayDetails();


        student.name = "Jane Doe";  // Compilation error
        student.rollNumber = 67890; // Compilation error
    }
}
