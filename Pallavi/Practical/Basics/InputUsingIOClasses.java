
///Way1.Handle error using try catch()
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputUsingIOClasses
{
	public static void main(String args[])
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{

			System.out.println("Enter any int value : ");
			x=Integer.parseInt(br.readLine());

			System.out.println("Enter any double value : ");
			y=Double.parseDouble(br.readLine());
		}
		catch(Exception e)
		{
		
		}

		System.out.println("X is  : "+x);
		System.out.println("Y is : "+y);
		System.out.println("Sum is : "+(x+y));

	}
}

*/

//Way 2 . Handle error using throws clause

import java.io.BufferedReader;
import java.io.InputStreamReader;

class 	InputUsingIOClasses
{
	public static void main(String args[]) throws Exception
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter any int value : ");
		x=Integer.parseInt(br.readLine());
		System.out.println("Enter any double value : ");
		y=Double.parseDouble(br.readLine());


		System.out.println("X is  : "+x);
		System.out.println("Y is : "+y);
		System.out.println("Sum is : "+(x+y));
	}
}
			



		