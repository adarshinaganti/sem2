package week6;

import java.util.Scanner;

public class StringDemo {
    public static boolean isPalindrome(String str) {
        String text = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(text).reverse().toString();
        return text.equals(rev);
    }

    public static String alphabetizeString(String text) {
        char[] chars = text.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Check if palindrome");
            System.out.println("2. Alphabetize string");
            System.out.println("3. Reverse string");
            System.out.println("4. Concatenate original and reversed string");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (isPalindrome(str)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    String alphabetized = alphabetizeString(str);
                    System.out.println("Alphabetized string: " + alphabetized);
                    break;
                case 3:
                    String reversedString = reverseString(str);
                    System.out.println("Reversed string: " + reversedString);
                    break;
                case 4:
                    String reversedStringConcat = reverseString(str);
                    String concatenatedString = concatenate(str, reversedStringConcat);
                    System.out.println("Concatenated string: " + concatenatedString);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
