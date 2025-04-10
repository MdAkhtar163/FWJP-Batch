package pack1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Demo3 
{
	public static boolean isPrime(int n) 
	{
		return n>1 && IntStream.range(2,(n/2)+1).noneMatch(i-> n%i==0);
		
	}
	public static void main(String[] args) {
		MathOperations addition =(a,b)-> a+b;
		
		MathOperations multiplication=(a,b)-> a*b;
		
		System.out.println("Sum the number : "+addition.operate(44, 55));
		System.out.println("Multiplaction the number : "+multiplication.operate(44, 55));
		
		//print first n prime number using lambda
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value:- ");
		int n = input.nextInt();
		IntStream.iterate(2,i -> i+1)
			.filter(Demo3::isPrime)
			.limit(n)
			.forEach(System.out::println);
		//1.14.27play video
	}
	
}
