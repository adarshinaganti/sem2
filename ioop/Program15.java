class Student {
	private String name;
	private int rno;
	private float marks;

	public Student() {
		this.name = "Unknown";
		this.rno = 0;
		this.marks = 0f;
	}

	public Student(String name, int rno, float marks) {
		this.name = name;
		this.rno = rno;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rno);
		System.out.println("Marks: " + marks);
		System.out.println();
	}
}

public class Program15 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("abc", 50, 12.5f);
		Student s3 = new Student("def", 100, 25f);

		System.out.println("Details of students:");
		s1.display();
		s2.display();
		s3.display();
	}
}