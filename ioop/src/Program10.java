package src;
// Write a Java program to compute the electricity bill for an industry using a switch-case statement. The program should take the daily consumption in units for 7 days as input. Based on the total consumption, the program should calculate and display the total electricity bill according to the following pricing table:

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float cons = 0, bill = 0;
		System.out.println("Daily consumption:");
		for (int i = 0; i < 7; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			cons += sc.nextFloat();
		}
		
		switch((int) cons / 100) {
		case 0:
			bill = cons * 7;
			break;
		case 1:
			bill = cons * 8;
			break;
		default:
			bill = cons * 10;
			break;
		}
		
		System.out.println("Total consumption: " + cons + " units");
		System.out.println("Total electricity bill: " + bill + " rupees");
		
		sc.close();
	}
}
