package pack1;

import java.util.Scanner;

interface Demo1
{
	public void countCharacters(String str);
}
public class lambdaDemo 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		Demo1 ob = new Demo1()
				{
					@Override
					public void countCharacters(String str) {
						System.out.println("Length : "+str.length());	
					}
				
				};
				ob.countCharacters(str);
				
				//Using lambda expression
				
				final int i[]= {0};
				str.chars().forEach(c-> i[0]++);
				System.out.println("Length : "+i[0]);
	}

}
