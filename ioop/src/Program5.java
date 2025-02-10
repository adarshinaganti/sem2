package src;
// Write a java program to add two numbers using the bitwise operator and check if the output is an even or odd number.

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		
		System.out.println("Sum: " + x);
		
		if (x % 2 == 0) {
			System.out.println("The sum is an even number.");
		}
		else {
			System.out.println("The sum is an odd number.");
		}
		
		sc.close();
	}
}
