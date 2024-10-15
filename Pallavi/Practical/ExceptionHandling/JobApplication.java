import java.util.Scanner;
class FillForm
{
	private int id;
	private int age;
	private String name;
	private double sp;
	private double hp;
	private double gp;

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student name: ");
		name=sc.nextLine();

		System.out.println("Enter student id: ");
		id=sc.nextInt();

		System.out.println("Enter student age: ");
		age=sc.nextInt();

	/*	if(age<21 || age>29)
		{
			//throw new NumberFormatException();
			throw new NumberFormatException("Age is not within age window");
		}
    */

	    if(age<21)
		{
			throw new NumberFormatException("Age is less to apply for the Job");
		}
		else if(age>29)
		{
			throw new NumberFormatException("Age is more than expected to apply for the Job");
		}


		System.out.println("Enter student ssc marks: ");
		sp=sc.nextDouble();

		System.out.println("Enter student hsc marks: ");
		hp=sc.nextDouble();

		System.out.println("Enter student final year marks: ");
		gp=sc.nextDouble();
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
		System.out.println("age: "+age);
		System.out.println("Marks: ssc: "+sp+"\t hsc: "+hp+"\t Final year: "+gp);
	}

}

class JobApplication 
{
	public static void main(String[] args) 
	{
		FillForm ob = new FillForm();

		ob.input();
		ob.display();
	}
}
