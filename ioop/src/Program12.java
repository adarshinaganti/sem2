package src;
// Define an employee class

import java.util.Scanner;

class Employee {
	String Ename;
	int EID;
	float Basic, DA, Gross_Sal, Net_Sal;

	void read(Scanner sc) {
		System.out.print("Enter employee ID: ");
		EID = sc.nextInt();

		System.out.print("Enter employee name: ");
		Ename = sc.next();
		
		System.out.print("Enter basic salary: ");
		Basic = sc.nextFloat();

		DA = 0.52f * Basic;
		Gross_Sal = Basic * DA;
	}

	void compute_net_sal() {
		float IT = 0.3f * Gross_Sal;
		Net_Sal = Gross_Sal - IT;
	}

	void display() {
		System.out.println("Employee Details:");
		System.out.println("ID: " + EID);
		System.out.println("Name: " + Ename);
		System.out.println("Basic Salary: " + Basic);
		System.out.println("DA: " + DA);
		System.out.println("Gross Salary: " + Gross_Sal);
		System.out.println("Net Salary: " + Net_Sal);
	}
}

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();

		Employee[] e = new Employee[n];

		for (int i = 0; i < n; i++) {
			e[i] = new Employee();
			System.out.println("Enter details of employee " + (i + 1) + ":");
			e[i].read(sc);
			e[i].compute_net_sal();
		}

		for (int i = 0; i < n; i++) {
			e[i].display();
		}

		sc.close();
	}
}