package ex1;

import java.util.Scanner;

public class Week_Day {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the week number 1 to 7 :-");
		int num=input.nextInt();
		if(num==1)
		{
			System.out.println("Monday");
		}
		else if(num==2)
		{
			System.out.println("Tuseday");
		}
		else if(num==3)
		{
			System.out.println("Wednesday");
		}
		else if(num==4)
		{
			System.out.println("Thesday");
		}
		else if(num==5)
		{
			System.out.println("Friday");
		}
		else if(num==6)
		{
			System.out.println("Saterday");
		}
		else if(num==7)
		{
			System.out.println("Sunday");
		}

	}

}
