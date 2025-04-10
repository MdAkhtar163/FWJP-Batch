package ex1;

import java.util.Scanner;

public class Access_s_Info {

	public static void main(String[] args) {
		StudentInfo s2 = new StudentInfo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name :- ");
		s2.setName(sc.nextLine());
		System.out.println("Enter the Rollnu :- ");
		s2.setRollno(sc.nextInt());
		
		System.out.println("Enter the Address :-");
		s2.setAddress(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter the Email id :- ");
		s2.setEmail(sc.nextLine());
		
		System.out.println("Enter the Department :- ");
		s2.setDepartment(sc.nextLine());
		
		System.out.println("Enter the Course :- ");
		s2.setCourse(sc.nextLine());
		
		System.out.println("Enter the Mobile Number :- ");
		s2.setMobileNu(sc.nextInt());
		
		System.out.println("Enter the Year :- ");
		s2.setYear(sc.nextInt());
		
		System.out.println("Enter the Date :- ");
		s2.setDate(sc.nextInt());
		
		System.out.println("Student Record :- \n"+s2);
	}
		
}
