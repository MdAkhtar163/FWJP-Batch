package ex1;

import java.util.Scanner;

public class Check_Triangle1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the triangle side:- ");
		int side1=input.nextInt();
		int side2=input.nextInt();
		int side3=input.nextInt();
		
		if(side1==side2 &&side2 ==side3)
			System.out.println("Equilateral Triangle.");
		else if (side1==side2 || side2==side3||side3==side1)
			System.out.println("Isosceles Triangle.");
		else
			System.out.println("Scalene Triangle");
	}

}
