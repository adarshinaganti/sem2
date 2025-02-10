package src;
// Enhance the student class

class Student {
    class Subject {
        private String subjectName;
        private int marks;

        public Subject(String subjectName) {
            this.subjectName = subjectName;
            this.marks = 0;
        }

        public void assignMarks(int marks) {
            this.marks = marks;
        }

        public void displaySubject() {
            System.out.println("Subject: " + subjectName + ", Marks: " + marks);
        }

        public int getMarks() {
            return marks;
        }
    }

    private Subject[] subjects;
    private int subjectCount;

    public Student(int maxSubjects) {
        subjects = new Subject[maxSubjects];
        subjectCount = 0;
    }

    public void addSubject(String subjectName) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = new Subject(subjectName);
            subjectCount++;
        }
		else {
            System.out.println("Cannot add more subjects. Maximum limit reached.");
        }
    }

    public void assignMarks(String subjectName, int marks) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].subjectName.equals(subjectName)) {
                subjects[i].assignMarks(marks);
                return;
            }
        }
        System.out.println("Subject not found: " + subjectName);
    }

    public int calcTotal() {
        int total = 0;
        for (int i = 0; i < subjectCount; i++) {
            total += subjects[i].getMarks();
        }
        return total;
    }

    public float calcAvg() {
        if (subjectCount == 0) {
            return 0f;
        }
        return (float) calcTotal() / subjectCount;
    }

    public void displaySubjects() {
        for (int i = 0; i < subjectCount; i++) {
            subjects[i].displaySubject();
        }
    }
}

public class Program19 {
    public static void main(String[] args) {
    	Student student = new Student(3);

        student.addSubject("Maths");
        student.addSubject("Physics");
        student.addSubject("Chemistry");

        student.assignMarks("Maths", 90);
        student.assignMarks("Physics", 85);
        student.assignMarks("Chemistry", 78);

        student.displaySubjects();

        System.out.println("Total Marks: " + student.calcTotal());
        System.out.println("Average Marks: " + student.calcAvg());
    }
}