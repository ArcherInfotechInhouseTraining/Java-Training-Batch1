import java.util.*;
class ExampleUsingMultipleCatch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any count");

		try
		{
			int cnt=sc.nextInt();
			int []x=new int[cnt];
			for(int i=0;i<5;i++)
			{
				x[i]=sc.nextInt();
			}
			System.out.println("Enter any position");
			int pos=sc.nextInt();
			System.out.println("\n value at position: "+x[pos]);

		}
		catch (InputMismatchException ime)
		{
			System.out.println("\n Improper Input: "+ime);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("IndexIssue: "+ae);
		}
		catch(Exception e)
		{
			System.out.println("\n Execution problem: "+e);	
		}
		System.out.println("End of Program");
	}
}