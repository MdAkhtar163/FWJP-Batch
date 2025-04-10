package ex1;

import java.util.Scanner;

public class Divisible_Number
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int num = input.nextInt();
		if(num%5==0 && num%11==0)
			System.out.println("This number is Divisiable by 5 and 11 :-"+num);
		else 
			System.out.println("This Numbr is Not Divisible by 5 by 11 :-"+num);
	}

}