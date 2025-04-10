package ex1;

import java.util.Scanner;

public class Profit_loss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cost price :-");
		int cp = input.nextInt();
		System.out.println("Enter the selling price :-");
		int sp = input.nextInt();
		int p,l;
		if(sp>cp)
		{
			p=sp-cp;
			System.out.println("Profit : "+p);
		}
		else if(sp<cp)
		{
			l = cp-sp;
			System.out.println("Loss : "+l);
		}
		else {
			System.out.println("No Profit No Loss");
		}
	}

}
