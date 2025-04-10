package ex1;

import java.util.Scanner;

public class Alph_Digi_spl {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value:- ");
		char ch=input.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("The value is Alphabat");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("The value is Number");
		}
		else {
			System.out.println("The value is Special Character");
		}
		
	}

}
