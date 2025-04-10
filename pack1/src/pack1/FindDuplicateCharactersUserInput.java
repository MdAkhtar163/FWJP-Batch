package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharactersUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter a string:");
        String input = scanner.nextLine(); // Read the user's input string

        findDuplicates(input);
    }

    public static void findDuplicates(String input) {
        // Use a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
            }
        }
    }
}
