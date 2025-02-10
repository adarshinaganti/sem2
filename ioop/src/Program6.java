package src;
// Write a Java program to rotate the elements of an array to the right/left by a given number of steps. The program should handle arrays of different sizes and should be able to rotate the array in both directions (left and right).

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Length of array: ");
		int n = sc.nextInt();
		
		System.out.println("Array elements:");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter direction (left/right): ");
		String dir = sc.next();
		
		System.out.println("Enter number of steps to rotate: ");
		int stp = sc.nextInt();
		
		stp = stp % n;
		
		if (dir.equalsIgnoreCase("right")) {
			for (int i = 0; i < stp; i++) {
				int last = arr[n - 1];
				for (int j = n - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = last;
			}
		}
		else if (dir.equalsIgnoreCase("left")) {
			for (int i = 0; i < stp; i++) {
				int first = arr[0];
				for (int j = 0; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[n - 1] = first;
			}
		}
		else {
			System.out.println("Invalid direction. Enter 'left' or 'right'.");
		}
		
		System.out.println("Rotated array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}
}
