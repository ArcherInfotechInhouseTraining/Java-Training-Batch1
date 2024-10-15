import java.util.Scanner;
class MyArray
{
	private int x[];
	private int cnt;

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter cnt: ");
			cnt = sc.nextInt();
			x = new int[cnt];

			try
			{
				System.out.println("Ente the "+cnt+"elements: ");
				for(int i=0;i<5;i++)
				{
					x[i]=sc.nextInt();
				}
			}
			catch (NegativeArraySizeException e)
			{
				e.printStackTrace();
				System.out.println("One");
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

	}

	public void display()
	{
		System.out.println("Array elements are: ");

		for(int i=0;i<x.length;i++)
		{
			System.out.println("  "+x[i]);
		}
	}
}
class NestedTryCatchExample 
{
	public static void main(String[] args) 
	{
		MyArray ob = new MyArray();
		ob.input();
		ob.display();
	}
}
