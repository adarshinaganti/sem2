import java.util.Scanner;

class Student {
	String sname;
	int[] marks_array;
	int total = 0;
	float avg = 0;

	public void assign(Scanner sc) {
		System.out.print("Enter student name: ");
		sname = sc.next();

		System.out.print("Enter number of subjects: ");
		int n = sc.nextInt();
		
		marks_array = new int[n];
		System.out.println("Enter marks:");

		for (int i = 0; i < n; i++) {
			marks_array[i] = sc.nextInt();
		}
	}

	public void display() {
		System.out.println("Name: " + sname);
		System.out.println("Marks:");
		for (int i = 0; i < marks_array.length; i++) {
			System.out.println(marks_array[i] + " ");
		}
	}

	public void compute() {
		for (int i = 0; i < marks_array.length; i++) {
			total += marks_array[i];
		}

		avg = (float) total / marks_array.length;

		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
	}
}

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.assign(sc);
		s.display();
		s.compute();
	}
}