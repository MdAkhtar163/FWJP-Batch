package ex1;

import java.util.Scanner;

public class Unit_Charges {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Electricity Unit : ");
		int unit =input.nextInt();
		float amt,surcharge,bill_amt;
		if(unit<=50)
		{
			amt = unit*9.0f;
		}
		else if(unit<=150)
		{
			amt = unit*10.0f;
		}
		else if(unit<=250)
		{
			amt = unit*11.0f;
		}
		else
		{
			amt = unit*12.0f;
		}
		
		//surcharge = amt*0.2f;
		//bill_amt = amt+surcharge;
		System.out.println("Total Electricity bill : "+amt);

	}

}
