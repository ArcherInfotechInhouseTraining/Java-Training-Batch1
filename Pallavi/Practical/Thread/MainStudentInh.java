// single Inheritance:

import java.util.Scanner;

class Person
{
	private String nm="";
	private int age;

	//private void in()
	protected void in()
	//public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name: ");
		nm=sc.nextLine();

		System.out.println("Enter person age: ");
		age=sc.nextInt();
	}

	//private void out()
	protected void out()
	//public void out()
	{
		System.out.println("Person name: "+nm+" \t Age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		in();

		System.out.println("Enter student rno: ");
		rno=sc.nextInt();

		System.out.println("Enter Student per: ");
		per=sc.nextDouble();
	}

	public void output()
	{
		out();

		System.out.println("Student Rno: "+rno+" \t Per: "+per);
	}
}

class Sport extends Student
{
	private int points;

	public void set()
	{
		Scanner sc = new Scanner(System.in);

		input();
		System.out.println("Enter students sport points: ");
		points = sc.nextInt();
	}

	public void show()
	{
		output();
		System.out.println("Sport points: "+points);
	}
}
class  MainStudentInh
{
	public static void main(String[] args) 
	{
		Sport ob = new Sport();
		ob.set();
		ob.show();

		ob.input();
		ob.output();

		ob.in();
		ob.out();
	}
}
