package week2;

import java.util.Scanner;

public class RecursiveFactorialDemo {
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		else {
			return n * fact(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(n + "! = " + fact(n));
		sc.close();
	}
}
