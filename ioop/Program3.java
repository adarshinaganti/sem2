import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		sc.close();
	}
}
