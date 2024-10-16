import java.util.*;
class Person
{
	private String nm="";
	private int age=0;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of person: ");
		nm=sc.nextLine();
		System.out.println("Enter the age of person:");
		age=sc.nextInt();
	}
	public void out()
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
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no: ");
		rollno=sc.nextInt();
		System.out.println("Enter the percentage: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("Roll No: "+rollno+"\t Percentage: "+per+" %");
	}
}
class MainStudent
{
	public static void main(String []args)
	{
		Student s =new Student();

		s.input();
		s.output();
	}
}