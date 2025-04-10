package ex1;

public class StudentInfo {

	private String Name;
	private int Rollno;
	private String Address;
	private String Email;
	private String Department;
	private String Course;
	private int MobileNu;
	private int Year;
	private int Date;
	public StudentInfo(String name, int rollno, String address, String email, String department, String course,
			int mobileNu, int year, int date) {
		this.Name = name;
		this.Rollno = rollno;
		this.Address = address;
		this.Email = email;
		this.Department = department;
		this.Course = course;
		this.MobileNu = mobileNu;
		this.Year = year;
		this.Date = date;
		
		System.out.println("Initializing all values :-");
	}
	public StudentInfo() 
	{
		System.out.println("Calling default Constructor");
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getMobileNu() {
		return MobileNu;
	}
	public void setMobileNu(int mobileNu) {
		MobileNu = mobileNu;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getDate() {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	@Override
	public String toString() 
	{
		return "StudentInfo [Name=" + Name + ", Rollno=" + Rollno + ", Address=" + Address + ", Email=" + Email
				+ ", Department=" + Department + ", Course=" + Course + ", MobileNu=" + MobileNu + ", Year=" + Year
				+ ", Date=" + Date + "]";

	}
	

}
