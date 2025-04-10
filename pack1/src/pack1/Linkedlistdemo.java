package pack1;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlistdemo 
{
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		
		list1.add(45);
		list1.add(56);
		list1.add(55);
		list1.add(1, 90);
		list1.addFirst(4);
		list1.addLast(899);
		System.out.println("Values in List : "+list1);
		
		
		list1.remove();
		System.out.println("Values in List : "+list1);
		
		System.out.println("Values in List : "+list1);
		list2.add(56);
		list2.add(55);
		list2.add(4);
		
		System.out.println("List 2 : "+list2);
		
//		list1.removeAll(list2);
		
		list1.removeIf(x -> (x%2 == 0));
		
		System.out.println("Values in List : "+list1);
		
//		search in linked list -> contains()
		
		list1.addAll(list2);
		
		System.out.println("contains 55 :  "+list1.contains(55));
		System.out.println("list 1 contains list2 : "+list1.containsAll(list2));
		
//		 to retrieve first element from the listm -> element()
		System.out.println("List 1 : "+list1);
		System.out.println("element : "+list1.element());
		System.out.println("List 1 : "+list1);
		
		System.out.println("value at index 3 : "+list1.get(3));
		System.out.println("List 1 : "+list1);
		
//		getFirst(), getLast()
		
//		to get the index of an element : indexOf()
		System.out.println("Index of 899 : "+list1.indexOf(899));
		
//		convert a linked list into an array -> toArray()
		
//		Object x[]= list1.toArray();
//		for(Object i:x) System.out.println(i);
		
//		Integer[] x[]= list1.toArray(new Integer[0]);
		
		int x[] = Arrays.stream(list1.toArray(new Integer[0])).
				mapToInt(Integer::intValue).toArray();
		for(int i:x) System.out.println(i);
		
	}
}