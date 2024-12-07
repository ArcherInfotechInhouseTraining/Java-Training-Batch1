import java.util.*;
class FillForm
{
		private int id;
		private String name;
		private int age;
		private double sp;
		private double hp;
		private double gp;

		public void in()
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
				throw new NumberFormatException("Age is less to apply for job");
			}
			else if(age>29)
			{
				throw new NumberFormatException("Age is more to apply for job");
			}
			System.out.println("Enter the ssc percentage of Student");
			sp=sc.nextDouble();
			System.out.println("Enter the hsc percentage of Student");
			hp=sc.nextDouble();
			System.out.println("Enter the graduation percentage of Student");
			gp=sc.nextDouble();
		}
		public void out()
		{
			System.out.println("Name: "+name+" \t Id: "+id+" \t age: "+age+" \t ssc percentage: "+sp+" \t Hsc Pecentage: "+hp+" \t graduation pecentage: "+gp);
		}
}
class JobApplication
{
	public static void main(String []args)
	{
		FillForm ob = new FillForm();
		try
		{
			ob.in();
		}
		catch (Exception e)
		{
			System.out.println("Problem is due to:"+e.getMessage());
		}
		
		ob.out();
		System.out.println("End of Program");
	}
}


