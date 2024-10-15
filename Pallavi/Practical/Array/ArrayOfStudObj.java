// Array of objects
/*
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
		System.out.println("Id : "+id+"\t Per: "+per);
	}

}

class ArrayOfStudObj 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Student []s = new Student[3];

		for(int i=0;i<3;i++)
		{
			s[i]=new Student();

			System.out.println("Enter the student id : ");
			int sid = sc.nextInt();
			
			System.out.println("Enter the student per : ");
			double sper = sc.nextDouble();

			s[i].in(sid,sper);
		}
		System.out.println("Student list : " );
		for(int i=0;i<3;i++)
		{
			s[i].out();
		}
	}
}
*/


// Enter the id, percentage of N students and display the student list with topper details

import java.util.Scanner; 
class Student
{
	private int id;
	private double per;

	public void getData(int id,double per)
	{
		this.id=id;
		this.per=per;
	}
	public void showData()
	{
		System.out.println("Id: "+id+" \t Per: "+per);
	}
	public double getPer()
	{
		return per;
	}
}

class ArrayOfStudObj
{
	public static void main(String []args)
	{
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student cnt: ");
		int cnt = sc.nextInt();

		Student s[] = new Student[cnt];

		for(i=0;i<s.length;i++)
		{
			s[i]=new Student();

			System.out.println("Enter id: ");
			int sid = sc.nextInt();

			System.out.println("Enter per: ");
			double sper = sc.nextDouble();

			s[i].getData(sid,sper);
		}

		for(i=0;i<s.length;i++)
		{
			s[i].showData();
		}

		double tper=0.0;
		int tpos=0;

		for(i=0;i<s.length;i++)
		{
			if(s[i].getPer()>tper)
			{
				tper=s[i].getPer();
				tpos=i;
			}
			
		}

		System.out.println("Toper Details: ");
		s[tpos].showData();
	}
}
