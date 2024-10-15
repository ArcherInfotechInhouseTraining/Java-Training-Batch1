import java.util.Scanner;

class ArrayInputScanner
{
	public static void main(String args[])
	{
		int x[]=new int[5];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter array elements : ");

		for(int i=0;i<5;i++)
		{
			x[i]=s.nextInt();
		}

		System.out.println("Display array elements :  ");

		for(int i=0;i<5;i++)
		{
			System.out.println(""+x[i]);
		}
	}


}