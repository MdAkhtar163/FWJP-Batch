package lab_4_Core_Java_Array;
import java.util.Scanner;

	public class SumAndAverage {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: array size
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        // Input: array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Calculate sum and average
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        double average = (double) sum / n;

	        // Output: sum and average
	        System.out.println("***************************************************");
	        System.out.println("Sum of the elements: " + sum);
	        System.out.println("***************************************************");
	        System.out.println("Average of the elements: " + average);
	    }
}


