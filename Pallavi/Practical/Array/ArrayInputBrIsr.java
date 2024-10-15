
	// Array input using BufferedReader and InputStreamReader

import java.io.InputStreamReader;
import java.io.BufferedReader;

class ArrayInputBrIsr
{

	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int x[] = new int[5];

		System.out.println("Enter array five elements : ");
		for(int i=0;i<5;i++)
		{
			try
			{
				x[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{
			}
		}
	
		System.out.println("Display  five elements of array : ");
		for(int i=0;i<5;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
}