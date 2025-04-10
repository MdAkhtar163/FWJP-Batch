package pack1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();

        // Reverse the string using the StringBuilder reverse() method
        String reversed = new StringBuilder(input).reverse().toString();

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }
}