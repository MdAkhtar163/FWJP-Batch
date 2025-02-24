package lab_4_Core_Java_Array;
import java.util.Scanner;
public class Selection_Sort {
	
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

	        // Selection Sort
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap the found minimum element with the first element
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }

	        // Output: sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
}


