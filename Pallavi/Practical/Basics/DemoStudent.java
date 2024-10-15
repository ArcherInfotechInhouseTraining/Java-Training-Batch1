
	// WAP to input and display the data of two students

/*
import java.util.Scanner;
class Student
{
	private int sId;
	private double per;

	public void in()
	{
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the student Id : ");
		sId = sc.nextInt();

		System.out.println("Enter the student per : ");
		per = sc.nextDouble();

	}
	public void out()
	{
		System.out.println("Id : "+sId+" \t Per : "+per);
	}
}

class DemoStudent 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.in();
		s.out();

		Student s1 = new Student();
		s1.in();
		s1.out();

	}
}

//--------------------------------------------------------------------------

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in(int t1,double t2)
	{
		id=t1;
		per=t2;
	}
	public void out()
	{
		System.out.println("Id : "+id+" \t Per : "+per);
	}
}

class DemoStudent 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the student Id : ");
		int sId = sc.nextInt();

		System.out.println("Enter the student per : ");
		double sPer = sc.nextDouble();


		Student s = new Student();
		s.in(sId,sPer);
		s.out();
//---------------------------------------------------------4/10/2024
		System.out.println("Enter the student Id : ");
		sId = sc.nextInt();

		System.out.println("Enter the student per : ");
		sPer = sc.nextDouble();

		Student s1 = new Student();
		s1.in(sId,sPer);
		s1.out();

	}
}

//-----------------------------------------------------------------------------------

// Write a program to display the details of elder student (refer above program)

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in()
	{
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the student Id : ");
		id = sc.nextInt();

		System.out.println("Enter the student per : ");
		per = sc.nextDouble();

	}

	public void out()
	{
		System.out.println("Id : "+id+" \t Per : "+per);
	}

	public double getPer()
	{
		return per;
	}
}

class DemoStudent 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.in();
		s1.out();

		Student s2 = new Student();
		s2.in();
		s2.out();

		if(s1.getPer() > s2.getPer())
			s1.out();
		else
			s2.out();
	}
}
*/
//------------------------------------------------------------------------------------

// Defining setter and getter methods

import java.util.Scanner;
class Student
{
	private int id;
	private int age;
	private double per;

   //-------------- getters----------------------
	public int getId()
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}
	public double getPer()
	{
		return per;
	}

   //-------------- setters----------------------

   public void setId(int id)
	{
	   this.id=id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPer(double per)
	{
		this.per=per;
	}


	public void out()
	{
		System.out.println("Id : "+id+" \t Per : "+per);
	}
}

class DemoStudent 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setId(1);
		s1.setAge(23);
		s1.setPer(88.90);

		Student s2 = new Student();
		s2.setId(2);
		s2.setAge(24);
		s2.setPer(90.88);

		System.out.println("Id: "+s1.getId()+" \t Age: "+s1.getAge()+" \t Per: "+s1.getPer());

		System.out.println("Id: "+s2.getId()+" \t Age: "+s2.getAge()+" \t Per: "+s2.getPer());
	

		if(s1.getAge()>s2.getAge())
			s1.out();
		else
			s2.out();
	}
}
