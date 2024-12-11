import java.util.*;
class Student
{
	private int id;
	private double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of student: ");
		id=sc.nextInt();
		System.out.println("Enter the percentage: ");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("Id: "+id+"\t Percentage: "+per);
	}
	public double getPer()
	{
		return per;
	}
}
class ArrayOfStudentTopper
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int cnt=sc.nextInt();
		Student []s=new Student[cnt];

		System.out.println("Enter the"+cnt+" Student Information");
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].in();
		}
		System.out.println("Student Information: ");
		for(int i=0;i<s.length;i++)
		{
			s[i].out();
		}

		double tper=0;
		int pos=-1;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getPer()>tper)
			{
				tper=s[i].getPer();
				pos=i;
			}
		}
		System.out.println("\n Topper details: ");
		s[pos].out();
	}
}
