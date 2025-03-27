package week6;

import java.util.Scanner;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String extractInitials() {
        String[] parts = name.split(" ");
        String initials = "";
        for (String part : parts) {
            if (!part.isEmpty()) {
                initials += part.charAt(0);
            }
        }
        return initials;
    }

    public String removeWhitespace() {
        return name.replaceAll("\\s+", "");
    }

    public boolean containsSubstring(String substring) {
        return name.contains(substring);
    }

    public static int compareNames(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
    
    public String toString() {
        return name;
    }
}

public class StudentDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        System.out.println("Enter student names (type 'done' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            students[count++] = new Student(input);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nInitials of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName() + ": " + students[i].extractInitials());
        }

        System.out.println("\nNames without Whitespace:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName() + ": " + students[i].removeWhitespace());
        }
        
        System.out.print("\nEnter a substring to search: ");
        String substring = sc.nextLine();
        System.out.println("\nStudents containing substring \"" + substring + "\":");
        for (int i = 0; i < count; i++) {
            if (students[i].containsSubstring(substring)) {
                System.out.println(students[i]);
            }
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (Student.compareNames(students[i], students[j]) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("\nStudents sorted alphabetically:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }

        sc.close();
	}
}