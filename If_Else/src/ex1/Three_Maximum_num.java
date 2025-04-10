package ex1;

import java.util.Scanner;

public class Three_Maximum_num {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number 1 :- ");
		int num1 = input.nextInt();
		System.out.println("Enter the Number 2 :- ");
		int num2 = input.nextInt();
		System.out.println("Enter the number 3 :- ");
		int num3 = input.nextInt();
		
		if (num1>num2)
			System.out.println("Maximum Number is "+num1);
		else if(num1<num2)
			System.out.println("Maximum Number is "+num2);
		else if(num3<num2)
			System.out.println("Maximum Number is "+num3);
		else
			System.out.println("both are equal" + num1);
		
	}

}
