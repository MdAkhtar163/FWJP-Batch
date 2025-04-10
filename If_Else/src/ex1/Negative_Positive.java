package ex1;

import java.util.Scanner;

public class Negative_Positive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = input.nextInt();
		if(num>0)
			System.out.println("Positive Number is "+num);
		else if(num<0)
			System.out.println("Negative Number is "+num);
		else
			System.out.println("The number is zero "+num);
	}

}
