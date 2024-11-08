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

		System.out.println("Enter the name: ");
		name=sc.nextLine();

		System.out.println("Enter the id: ");
		id=sc.nextInt();

		System.out.println("Enter the age: ");
		age=sc.nextInt();

		if(age<21)
		{
			throw new NumberFormatException("Age is less to apply the job");
		}
		else if(age>29)
		{
			throw new NumberFormatException("Age is more than expected to apply for the Job");
		}

		System.out.println("Enter ssc marks: ");
		sp=sc.nextInt();

		System.out.println("Enter hsc marks: ");
		hp=sc.nextInt();

		System.out.println("Enter final year marks: ");
		gp=sc.nextInt();

	}

	public void output()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Age: "+age);
		System.out.println("Marks: ssc "+sp+"\t hsc "+hp+"\t final year "+gp);
	}
}

class JobApplicationwithTryCatch 
{
	public static void main(String[] args) 
	{
		FillForm ob = new FillForm();

		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("Problem Due to : "+e);
			System.out.println("Problem Due to : "+e.getMessage());
		}
		
		ob.output();
	}
}
