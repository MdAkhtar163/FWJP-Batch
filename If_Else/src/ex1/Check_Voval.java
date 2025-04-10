package ex1;

import java.util.Scanner;

public class Check_Voval {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Character :- ");
			char ch = input.next().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch =='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("The charector is voval");
			}
			else {
				System.out.println("The charector is not voval");
			}

	}

}
