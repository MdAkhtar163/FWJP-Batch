package atm;

public class Student {

	private String name;
	private int rollno;
	private int age;
	private float salary;
	
	public Student(String name, int rollno, int age, float salary)
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.salary = salary;
		System.out.println("Initializing all values :-");
	}
	public Student() {
		System.out.println("Calling default Constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
