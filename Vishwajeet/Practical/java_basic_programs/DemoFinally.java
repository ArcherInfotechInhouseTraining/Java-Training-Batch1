import java.util.*;
class DemoFinally
{
	public static void main(String []args)
	{
		int x,y;
		double z=0.0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();

		try
		{
			z=x/y;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\n In Finally block");
		}
		System.out.println(" value of z is: "+z);
	}
}