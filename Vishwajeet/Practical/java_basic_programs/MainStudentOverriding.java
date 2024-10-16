import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	Scanner sc= new Scanner(System.in);
	public void in()
	{
		System.out.println("Enter the name of person:");
		name = sc.nextLine();
		System.out.println("Enter the age of person: ");
		age = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name: "+name+" \t Age: "+age);
	}
}
class Student extends Person
{
	private int id;
	private double per;
	Scanner sc= new Scanner(System.in);
	public void input()
	{
		in();
		System.out.println("Enter the id of student: ");
		id=sc.nextInt();
		System.out.println("Enter the percentage: ");
		per=sc.nextDouble();
	}
	public void out()
	{
		super.out();
		System.out.println("Id: "+id+" \t Percentage: "+per);
	}

}
class MainStudentOverriding 
{
	public static void main(String[] args) 
	{
		Student ob =new Student();
		ob.input();
		ob.out();
	}
}
