package pack1;
	
interface dd
{
	public void abc();
}
interface ss{
	public String xyz(String s);
}
interface mm {
	public double areaRectangle(double length, double breath);
}
public class Demo2 {
		
	
	public static void main(String[] args) {
		String name = "Md Akhtar";
		
		//without parameter
		dd ob1 = () -> {System.out.println("Hello "+name);System.out.println("! You are Fine");};
		
		ob1.abc();
		
		// with parameter
		ss ob2 = (mm)->{return "welcome "+mm;};
		
		System.out.println(ob2.xyz(name));
		
		mm ob3 = (l,b) ->{return l*b;};
		
		System.out.println("Area of Rectangle : "+ob3.areaRectangle(7.5,5.5));
	}

}
