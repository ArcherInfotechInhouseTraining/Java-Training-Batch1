import java.util.Scanner;
class Student 
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
	public void out()
	{
		System.out.println("\n id: "+id+"\n percentage: "+per);
	}

}
class DemoStudent
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.in();

		Student s2=new Student();
		s2.in();

		s1.out();
		s2.out();
	}
}
