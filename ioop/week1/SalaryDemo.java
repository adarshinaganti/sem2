package week1;

import java.util.Scanner;

public class SalaryDemo {
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
