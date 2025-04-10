package pack1;

import java.util.Scanner;

public class ToggleCaseUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter a string:");
        String input = scanner.nextLine(); // Read the entire input string

        System.out.println("Input in String : " + input);
        System.out.println("Output in toggle words : " + toggleWords(input));
    }

    public static String toggleWords(String input) {
        String[] words = input.split(" "); // Split the input into words
        StringBuilder toggledString = new StringBuilder();

        for (String word : words) {
            StringBuilder toggledWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggledWord.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    toggledWord.append(Character.toUpperCase(c));
                } else {
                    toggledWord.append(c); // Keep non-alphabetic characters as is
                }
            }
            toggledString.append(toggledWord).append(" ");
        }

        return toggledString.toString().trim(); // Return the final toggled string
    }
}