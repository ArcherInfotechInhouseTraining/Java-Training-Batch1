import java.util.*;
class AgeException extends Exception
{
	private String msg;
	public AgeException()
	{

	}
	public AgeException(String message)
	{
		super(message);
		msg=message;
	}
	public String toString()
	{
		return "As Per the Application Demand the problem due to: "+msg;
	}


}
class FillForm
{
		private int id;
		private String name;
		private int age;
		private double sp;
		private double hp;
		private double gp;

		public void input() throws AgeException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of Student");
			name=sc.nextLine();
			System.out.println("Enter the id of Student");
			id=sc.nextInt();
			System.out.println("Enter the age of Student");
			age=sc.nextInt();
			if(age<21)
			{
				throw new AgeException("Age is less to apply for job");
			}
			else if(age>29)
			{
				throw new AgeException("Age is more to apply for job");
			}
			System.out.println("Enter the ssc percentage of Student");
			sp=sc.nextDouble();
			System.out.println("Enter the hsc percentage of Student");
			hp=sc.nextDouble();
			System.out.println("Enter the graduation percentage of Student");
			gp=sc.nextDouble();
		}
		public void display()
		{
			System.out.println("Name: "+name+" \t Id: "+id+" \t age: "+age+" \t ssc percentage: "+sp+" \t Hsc Pecentage: "+hp+" \t graduation pecentage: "+gp);
		}
}
class JobApplicationWithUDE
{
	public static void main(String []args)
	{
		FillForm ob = new FillForm();
		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("Problem is due to:"+e.getMessage());
			System.out.println("------------------------------------------------------------");
			System.out.println("2. Exception info - "+e);
			System.out.println("------------------------------------------------------------");
			System.out.println("3. Exception info - ");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
		}
		ob.display();
		System.out.println("End of Program");
	}
}


