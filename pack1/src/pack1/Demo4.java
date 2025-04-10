package pack1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo4 {
	public static void main(String[] args) {
		int n=5;
		
		int sum= IntStream.iterate(1,i->i+1).limit(n).sum();
		
		System.out.println("Sum :- "+sum);
		
		int a[]= {33,45,55,68,55};
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Max :- "+max);
	}
}
