// Student class

class Student {
	String name;
    int rollNo;
    int[] marks;
    double totalMarks;
    double averageMarks;
    
    public Student() {
    	this.rollNo = 0;
    	this.name = "";
    	this.marks = null;
    	this.totalMarks = 0;
    	this.averageMarks = 0;
    }
    
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.totalMarks = 0;
        this.averageMarks = 0;
    }
    
    public void compute() {
        if (marks != null) {
        	for (int mark : marks) {
        		this.totalMarks += mark;
        	}
        	this.averageMarks = (marks.length == 0) ? 0 : totalMarks / marks.length;
        }
        else {
        	System.out.println("Marks array is not initialized for student " + name);
        }
        
    }
    
    public void displayMarks() {
    	if (marks != null) {
            System.out.println("Marks:");
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Marks in subject " + (i + 1) + ": " + marks[i]);
            }
        }
    	else {
            System.out.println("Marks are not available to display for Student: " + name);
    	}
    }
    
    public void display() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        displayMarks();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

class ScienceStudent extends Student {
	int practicalMarks;
	
	public ScienceStudent(int rollNo, String name, int[] marks, int practicalMarks) {
        super(rollNo, name, marks);
        this.practicalMarks = practicalMarks;
    }
	
	@Override
    public void compute() {
        super.compute();
        if (marks != null) {
            totalMarks += practicalMarks;
            averageMarks = totalMarks / (marks.length + 1.0);
        }
        else {
            System.out.println("Base marks are not available for ScienceStudent: " + name + " practical marks are not included in average.");
        }
    }
	
	public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
	
	@Override
    public void display() {
        super.display();
        displayPracticalMarks();
    }
}

class ArtsStudent extends Student {
    String electiveSubject;
    
    public ArtsStudent(int rollNo, String name, int[] marks, String electiveSubject) {
        super(rollNo, name, marks);
        this.electiveSubject = electiveSubject;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }

    @Override
    public void display() {
        super.display();
        displayElectiveSubject();
    }
}

public class Program26 {
	public static void main(String[] args) {
		int[] gs_marks = new int[3];
		gs_marks[0] = 90;
		gs_marks[1] = 80;
		gs_marks[2] = 70;

		int[] ss_marks = new int[3];
		ss_marks[0] = 80;
		ss_marks[1] = 70;
		ss_marks[2] = 60;

		int[] as_marks = new int[3];
		as_marks[0] = 70;
		as_marks[1] = 60;
		as_marks[2] = 50;

		Student gs = new Student(1, "abc", gs_marks);
		ScienceStudent ss = new ScienceStudent(2, "def", ss_marks, 50);
		ArtsStudent as = new ArtsStudent(3, "ghi", as_marks, "History");

		gs.compute();
		ss.compute();
		as.compute();

		// Polymorphism
		Student[] students = new Student[3];
		students[0] = gs;
		students[1] = ss;
		students[2] = as;

		for (Student student : students) {
			student.display();
			System.out.println();
		}
	}
}