
/*
import java.util.Random;
class RandomLocationAccessFromArray 
{
	public static void main(String[] args) 
	{

		int x[]={22,11,56,77,68,90,65,33,44,21,56,32,54,98,67,54,32};
		System.out.println("Array size: "+x.length);

		Random random = new Random();

		for(int i=0;i<10;i++)
		{
			int r = random.nextInt(30);

			try
			{
				System.out.print(x[r]);
			}
			catch (Exception e)
			{
				System.out.print("-");
			}
			finally
			{
				System.out.println(": Random Location: "+r);
			}
		}
		System.out.println("Prg End");
	}
}
*/

//=================================================================


import java.util.Random;
class RandomLocationAccessFromArray 
{
	public static void main(String[] args) 
	{

		int x[]={22,11,56,77,68,90,65,33,44,21,56,32,54,98,67,54,32};
		System.out.println("Array size: "+x.length);

		Random random = new Random();

		for(int i=0;i<10;i++)
		{
			int r = random.nextInt(30);

			try
			{
				System.out.print(x[r]);
			}
			finally
			{
				System.out.println(": Random Location: "+r);
			}
		}
		System.out.println("Prg End");
	}
}

