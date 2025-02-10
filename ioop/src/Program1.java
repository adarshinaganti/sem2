// Write a Java program to accept the number of hours worked, hourly rate and calculates the salary for an employee according to the following criteria: The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40 hours.

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of hours worked: ");
		int hrs = sc.nextInt();
		
		System.out.print("Enter hourly rate: ");
		float rate = sc.nextFloat();
		float salary;
		
		if (hrs <= 40) {
			salary = hrs * rate;
		}
		
		else {
			salary = (40 * rate) + ((hrs - 40) * rate * 1.5f);
		}
		
		System.out.println("Salary for employee: " + salary);
		sc.close();
	}
}
