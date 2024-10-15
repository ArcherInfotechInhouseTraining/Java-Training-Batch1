
import java.util.Scanner;
class Employee 
{

	private int empc;
	private double empsal;

	public void in()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee code : ");
		empc=sc.nextInt();

		System.out.println("Enter the Employee Salary : ");
		empsal=sc.nextDouble();

	}
	public void out()
	{
		System.out.println(" Employee code is : "+empc+" and salary is : "+empsal);
	}
	
}

class MainEmpClass
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		Employee e1 = new Employee();

		e.in();
		e.out();

		e1.in();
		e1.out();

		System.out.println("Details of high salary employee: ");


	}
}
