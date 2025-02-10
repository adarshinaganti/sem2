package src;
// Write a java program to add two numbers using the bitwise operator and check if the output is an even or odd number. [Hint: use left shift and right shift bitwise operators].

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isLeap = false;
		System.out.print("Year: ");
		int year = sc.nextInt();
		
		if (year % 4 == 0) {
			isLeap = true;
			
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}
		}
		
		else isLeap = false;
		
		if (isLeap) System.out.println(year + " is a leap year");
		else System.out.println(year + " is not a leap year");
		sc.close();
	}
}
