import java.util.Scanner;
class Student1 
{
	private int id;
	private double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		id=sc.nextInt();
		System.out.println("Enter the percentage");
		per=sc.nextDouble();
	}
	public void in(int a,double b)
	{
		id=a;
		per=b;
	}
	public void out()
	{
		System.out.println("\n id: "+id+"\n percentage: "+per);
	}

}
class DemoStudent1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Student1 s1=new Student1();
		s1.in();

		
		
		System.out.println("Enter the student id");
		int sid=sc.nextInt();
		System.out.println("Enter the student percentage");
		double sper=sc.nextDouble();
		Student1 s2=new Student1();
		s2.in(sid,sper);

		s1.out();
		s2.out();
	}
}

