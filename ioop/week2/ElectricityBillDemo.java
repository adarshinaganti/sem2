package week2;

import java.util.Scanner;

public class ElectricityBillDemo {
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
