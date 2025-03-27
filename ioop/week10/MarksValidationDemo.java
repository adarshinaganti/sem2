class Student {
    public double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Number of subjects cannot be zero. Cannot calculate average.");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}

public class MarksValidationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        try {
            int totalMarks1 = 450;
            int numberOfSubjects1 = 5;
            double average1 = student.calculateAverage(totalMarks1, numberOfSubjects1);
            System.out.println("Average marks for student with total marks " + totalMarks1 + " and " + numberOfSubjects1 + " subjects: " + average1);
        }
        catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            int totalMarks2 = 300;
            int numberOfSubjects2 = 0;
            double average2 = student.calculateAverage(totalMarks2, numberOfSubjects2);
            System.out.println("Average marks for student with total marks " + totalMarks2 + " and " + numberOfSubjects2 + " subjects: " + average2);
        }
        catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            int totalMarks3 = 190;
            int numberOfSubjects3 = 2;
            double average3 = student.calculateAverage(totalMarks3, numberOfSubjects3);
            System.out.println("Average marks for student with total marks " + totalMarks3 + " and " + numberOfSubjects3 + " subjects: " + average3);
        }
        catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}