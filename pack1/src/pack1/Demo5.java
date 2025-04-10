package pack1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 
{
	public static void main(String[] args) throws IOException 
	{
		List<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
			list1.add(i*100);
		
		System.out.println("list 1:"+ list1);
		
		List<Integer> list2 = list1.stream().filter(n -> n%3==0).collect(Collectors.toList());
		
		System.out.println("List 2: ");
		list2.forEach(n-> System.out.println(n));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter file name with path : ");
//		set path of file
		Path filepath = Path.of(sc.nextLine());
		
		try (Stream<String> data = Files.lines(filepath))
		{
			data.forEach(System.out :: println);
		}
		
		
//		 using lambda to read Map data
		Map<String,Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Kavita", 67);
		scores.put("Deepak", 78);
		scores.put("Amit", 87);
		scores.put("Manish", 85);
		scores.put("Isha", 69);
		
		Map<String, Integer> highestscores= 
				scores.entrySet()
		      .stream()
		      .filter(kv -> kv.getValue()>=75)
		      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry :: getValue));
		
		highestscores.forEach((name, score) 
				-> System.out.println("Name : "+name+"\tScore : "+score));
		
		
	}
}