package ex1;

import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number 1 :- ");
		int num1 = input.nextInt();
		System.out.println("Enter the number 12 :- ");
		int num2 = input.nextInt();
		if (num1>num2)
			System.out.println("Maximum number is " +num1);
		else if(num1<num2)
			System.out.println("Maximum number is " +num2);
		else
			System.out.println("Both number are equal " +num1);
		
	}

}
