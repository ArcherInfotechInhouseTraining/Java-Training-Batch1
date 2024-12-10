import java.util.*;
class Student
{
	private int id;
	private double per;
	
	public void in(int id, double per)
	{
		this.id=id;
		this.per=per;
	}
	public void out()
	{
		System.out.println("Student Id: "+id+" \t Percentage: "+per);
	}
	public double getPer()
	{
		return per;
	}
}
class ArrayOfStudentObject 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int cnt= sc.nextInt();

		Student []s=new Student[cnt];

		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			System.out.println("Enter the student id: ");
			int sid=sc.nextInt();
			System.out.println("Enter the student percentage: ");
			double sper = sc.nextDouble();
			s[i].in(sid,sper);
		}
		System.out.println("\n Student list: \n");
		for(int i=0;i<s.length;i++)
		{
			s[i].out();
		}

		double tper=0.0;
		int tpos=-1;

		for(int i=0;i<s.length;i++)
		{
			if(s[i].getPer()>tper)
			{
				tper=s[i].getPer();
				tpos=i;
			}
		}
		System.out.println("\n Topper Details: ");
		s[tpos].out();

	}
}
