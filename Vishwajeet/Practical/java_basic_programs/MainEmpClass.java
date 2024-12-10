import java.util.*;
class Employee 
{
	
	private int empcode;
	private double sal;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee code: ");
		empcode=sc.nextInt();
		System.out.println("Enter the salary");
		sal=sc.nextInt();
	}
	public void out()
	{
		System.out.println("Employee code: "+empcode+" \t Salary: "+sal);
	}
}
class MainEmpClass
{
	public static void main(String []args)
	{
		Employee e1=new Employee();
		e1.in();
		

		Employee e2=new Employee();
		e2.in();

		e1.out();
		e2.out();
	}
}
