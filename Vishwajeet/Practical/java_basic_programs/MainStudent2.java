import java.util.*;
class Person
{
	private String nm="";
	private int age=0;

	protected void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of person: ");
		nm=sc.nextLine();
		System.out.println("Enter the age of person:");
		age=sc.nextInt();
	}
	protected void out()
	{
		System.out.println("Name: "+nm+"\t Age: "+age);
	}

}
class Student extends Person
{
	private int rollno;
	private double per;

	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no: ");
		rollno=sc.nextInt();
		System.out.println("Enter the percentage: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("Roll No: "+rollno+"\t Percentage: "+per+" %");
	}
}
class MainStudent2
{
	public static void main(String []args)
	{
		Student s =new Student();

		s.in();
		s.input();
		s.out();
		s.output();
	}
}
