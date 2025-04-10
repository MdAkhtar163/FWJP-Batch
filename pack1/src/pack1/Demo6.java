package pack1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Demo6 
{
	public static Employee createEmployee()
	{
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		
		System.out.println("Enter Employee Id : ");
		e.setId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter Employee Name :  ");
		e.setName(sc.nextLine());
		
		System.out.println("Enter age : ");
		e.setAge(sc.nextInt());
		
		return e;
	}
	
	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
				createEmployee(),
				createEmployee(),
				createEmployee(),
				createEmployee());
		
		System.out.println("Employee Data : ");
		employees.forEach(e -> System.out.println(e));
		employees.sort(Comparator.comparingInt(e -> e.getAge()));
		
		System.out.println("After sorting :- ");
		employees.forEach(e -> System.out.println(e));
	}
}