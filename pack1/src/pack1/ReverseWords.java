package pack1;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split("\\s+");

        // Reverse each word and append to the result
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        // Output the final reversed string
        System.out.println("Reversed words string: " + reversedString.toString().trim());

        // Close the scanner
        scanner.close();
    }
}