package week10;

public class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent() throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Course " + courseName + " is already full. Capacity: " + capacity + ", Enrolled: " + enrolledStudents);
        }
        enrolledStudents++;
        System.out.println("Student enrolled in " + courseName + ". Enrolled students: " + enrolledStudents);
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }
}

public class CourseCapacityDemo {
    public static void main(String[] args) {
        Course javaProgramming = new Course("Java Programming", 3);

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Attempting to enroll student " + i + "...");
                javaProgramming.enrollStudent();
            } catch (CourseFullException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}