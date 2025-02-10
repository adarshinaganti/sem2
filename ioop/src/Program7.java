package src;
// A Taxi service offers a new service based on travel distance. Write a Java program to calculate the total fare by considering the following charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR 5/km.
// Assuming fare for distances above 45km is 5/km

import java.util.Scanner;

public class Program7 {
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
