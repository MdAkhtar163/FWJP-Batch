package atm;

import java.util.Scanner;

public class AccessStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name :- ");
		s1.setName(sc.nextLine());
		
		System.out.println("Enter the Rollno :- ");
		s1.setRollno(sc.nextInt());
		
		System.out.println("Enter the Age :- ");
		s1.setAge(sc.nextInt());
		
		System.out.println("Enter the Salary :- ");
		s1.setSalary(sc.nextFloat());

		System.out.println("Student Record :- \n"+s1);
	}

}
