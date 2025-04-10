package pack1;

import java.util.Scanner;

public class SwapString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

	        System.out.println("Enter the first string:");
	        String str1 = scanner.nextLine(); // Read the first string

	        System.out.println("Enter the second string:");
	        String str2 = scanner.nextLine(); // Read the second string

	        System.out.println("Before swapping:");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);

	        // Swap the strings without using a third variable
	        str1 = str1 + str2; // Concatenate str1 and str2
	        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the original str1
	        str1 = str1.substring(str2.length()); // Extract the original str2

	        System.out.println("After swapping:");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);
	    }
}