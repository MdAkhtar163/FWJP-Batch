package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	
public class FindDuplicateWord {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

	        System.out.println("Enter a string:");
	        String input = scanner.nextLine(); // Read the user's input string

	        findDuplicateWords(input);
	    }

	    public static void findDuplicateWords(String input) {
	        // Normalize the string: convert to lowercase and split by whitespace
	        String[] words = input.toLowerCase().split("\\s+");

	        // Use a HashMap to store word counts
	        Map<String, Integer> wordCountMap = new HashMap<>();

	        for (String word : words) {
	            word = word.replaceAll("[^a-z]", ""); // Remove punctuation or non-alphabetic characters
	            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	        }

	        System.out.println("Duplicate words:");
	        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
	            }
	        }
	    }
	}

