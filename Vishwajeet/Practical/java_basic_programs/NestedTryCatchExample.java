import java.util.*;
class MyArray
{
	private int []x;
	private int cnt;
	public void input()
	{
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("Enter the cnt");
			cnt=sc.nextInt();
			x=new int[cnt];

			try
			{
				System.out.println("Enter the "+cnt+" elements");
				for(int i=0;i<5;i++)
				{
					x[i]=sc.nextInt();
				}
			}
			catch (NegativeArraySizeException e)
			{
				System.out.println("One");
				e.printStackTrace();

			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Two");
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
	}
}
class NestedTryCatchExample
{
	public static void main(String []args)
	{
		MyArray ob =new MyArray();

		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("Three");
			e.printStackTrace();
		}
		ob.display();
		System.out.println("End of Program");
	}
}