import java.util.*;
class Person
{
	private String name;
	private int age;

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=sc.nextLine();

		System.out.println("Enter the Age: ");
		age=sc.nextInt();
	}
	void output()
	{
		System.out.println("Name: "+name+" \t Age: "+age);
	}
}
class Student extends Person
{
	private int rollno;
	private double per;

	public void input()
	{
		super.input();
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the roll no");
		rollno=sc.nextInt();
		System.out.println("Enter the percentage");
		per=sc.nextDouble();
	}
	public void output()
	{
		super.output();
		System.out.println("Roll no: "+rollno+" \t Percentage: "+per);
	}
}
class MainStudent3
{
	public static void main(String []args)
	{
		Student s= new Student();
		
		s.input();	
		s.output();
	}
}