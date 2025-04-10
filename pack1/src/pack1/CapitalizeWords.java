package pack1;

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split("\\s+");

        // Capitalize the first letter of each word
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0))) // Capitalize first letter
                           .append(word.substring(1)) // Append the rest of the word
                           .append(" "); // Add a space
            }
        }

        // Output the capitalized string
        System.out.println("Capitalized string: " + capitalized.toString().trim());

        // Close the scanner
        scanner.close();
    }
}