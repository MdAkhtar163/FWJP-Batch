package ex1;

import java.util.Scanner;

public class Upper_Lower_Char {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the character :-");
		char ch=input.next().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			System.out.println("This character is Lower");
		}
		else {
			System.out.println("This character is Upper");
		}
	}

}
