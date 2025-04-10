package pack1;

public class Demo3s {

	public static void main(String[] args) 
	{
		String s="Delhi is the capital of India!!";
		
		System.out.println("char at 5 : "+s.charAt(2));

		char ch=s.charAt(6);
		System.out.println("ch : "+ch);
		
		String s1="Java";
		String s2="Java";
		
		System.out.println("compare to : "+s1.compareTo(s2));
		
		
		String s4= s.concat(s1);
		System.out.println("s4 : "+s4);
		
		boolean ans = s.contains("capital");
		System.out.println("contains : "+ans);
		
		System.out.println("content equals : "+s1.contentEquals(s));
		
		char s5[]= {'h','e','l','l','o','w','o','r','l','d'};
		
		String dd = String.copyValueOf(s5);
		
		System.out.println("dd : "+dd);
		
		String dd1= String.copyValueOf(s5, 5, 5);
		
		System.out.println("dd1 : "+dd1);
		
		String name="Mr. Abc Sharma";
		
		System.out.println("check name prefix : "+name.startsWith("Mrs."));
		
		System.out.println("check name suffix : "+name.endsWith("Sharma"));
		
		String filename = "abc.js";
		
		System.out.println("Check extension : "+filename.endsWith(".html"));
		
		
		byte[] valuesinbytes = s.getBytes();
		
		char ch1[] =new char[s.length()+1];
		s.getChars(0, s.length(), ch1, 0);
		
		for(char c:ch1) System.out.println(c);
		
		int index1 = s.indexOf('i');
		
		System.out.println("index of i first occurrence : "+index1);
		
		int index2 = s.indexOf('i', s.indexOf('i')+1);
		
		System.out.println("index of i second occurrence : "+index2);
		
		int index3 = s.lastIndexOf('i');
		System.out.println("last index of i : "+index3);
		
		String a1 = new String("Java");
		String a2 = "Java";
		String a3 = a1.intern();
		
		System.out.println("a1 == a2 : "+(a1==a2));
		System.out.println("a2 == a3 : "+(a2==a3));
		
		
		String a4 ="   ";
		
		System.out.println("isblank : "+a4.isBlank());
		System.out.println("isempty : "+a4.isEmpty());
		
		String aa[]=s.split(" ");
		
		for(String x:aa) System.out.println(x);
		
		String a5= String.join("-", aa);
		System.out.println("a5 : "+a5);
		String a6= s.substring(2, 9);
		System.out.println("a6 : "+a6);
		
		char cc[]= s.toCharArray();
		
		for(char x: cc) System.out.println(x);
		
		String a7 = String.valueOf(44.5666);
		System.out.println("a7 : "+a7);
	}

}