import java.util.*;
class Student 
{
	private int id;
	private int age;
	private Double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id");
		id=sc.nextInt();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the percentage");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("Student id: "+id+" \t Percentage: "+per+" \t Age: "+age);
	}
	public int getAge()
	{
		return age;
	}
}
class FindElder
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.in();

		Student s2=new Student();
		s2.in();

		s1.out();
		s2.out();

		System.out.println("\n Elder Details:");
		if(s1.getAge()>s2.getAge())
			s1.out();
		else
			s2.out();
	}
}
