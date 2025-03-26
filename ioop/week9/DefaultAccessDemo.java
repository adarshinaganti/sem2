package edu.manipal.mit;

import edu.manipal.mit.Student1;

public class DefaultAccessDemo {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.name = "John Doe";
        student.rollNumber = 12345;
        
        student.displayDetails();
    }
}
