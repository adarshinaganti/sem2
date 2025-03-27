package week1;

import java.util.Scanner;

public class OddEvenDemo {
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
