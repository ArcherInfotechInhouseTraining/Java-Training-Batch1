import java.util.*;
class Student
{
	private int id;
	private double per;

	public void in(int a,double b)
	{
		id=a;
		per=b;
	}
	public void out()
	{
		System.out.println("Student id: "+id+" \t Percentage: "+per);
	}
}
class ArrayOfStudObject
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Student []s=new Student[3];

		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
			System.out.println("Enter student id");
			int sid=sc.nextInt();
			System.out.println("Enter percentage: ");
			double sper=sc.nextDouble();
			s[i].in(sid,sper);
		}

		System.out.println("\n Student Details: ");
		for(int i=0;i<3;i++)
		{
			s[i].out();
		}
	}
}