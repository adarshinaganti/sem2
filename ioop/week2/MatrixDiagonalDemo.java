package week2;

import java.util.Scanner;

public class MatrixDiagonalDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter order of square matrix: ");
		int n = sc.nextInt();
		
		System.out.println("Matrix elements: ");
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		System.out.println("Secondary diagonal elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1) {
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		sc.close();
	}
}
