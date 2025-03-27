package week2;

import java.util.Scanner;

public class FareDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total distance: ");
		int dist = sc.nextInt();
		float fare;
		
		if (dist < 5) {
			fare = dist * 10;
		}
		else if (dist > 5 && dist < 20) {
			fare = 50 + ((dist - 5) * 8);
		}
		else {
			fare = 170 + ((dist - 20) * 5);
		}
		
		System.out.println("Fare for " + dist + "km is " + fare + " rupees");
		sc.close();
	}
}
