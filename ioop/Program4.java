import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		
		System.out.println("Array elements: ");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = tmp;
		}
		
		System.out.println("Reversed array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}
}
