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
class Sport extends Student
{
	private int points;

	public void setPt()
	{
		input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the points: ");
		points=sc.nextInt();
	}
	public void show()
	{
		output();
		System.out.println("Points In Sports : "+points);
	}

}
class MainStudentMultiLevel
{
	public static void main(String []args)
	{
		Sport s =new Sport();

		s.setPt();
		s.show();
	}
}

