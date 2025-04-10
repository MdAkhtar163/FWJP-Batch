package ex1;

import java.util.Scanner;

public class Check_Alphabet {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Character :- ");
		char ch = input.next().charAt(0);
		System.out.println("Enter the number");
		int num = input.nextInt();
		if(num>0 && num<=99) {
			System.out.println("This is a number "+num);
		}
		else {
			System.out.println("This is not number "+num);
		}
		if(ch>'a'&& ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is Alphabat "+ch);
		}
		else {
			System.out.println("This is a not Alphabat "+ch);
		}
	}

}
