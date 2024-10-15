//import java.util.Scanner;
import java.util.*;
class ExampleUsingMultipleCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element count: ");

		try
		{
			int cnt = sc.nextInt();
			int x[] = new int[cnt];

			for(int i=0;i<5;i++)
			{
				x[i]=sc.nextInt();
			}

			System.out.println("Enter any position: ");
			int pos = sc.nextInt();
			System.out.println("value at position: "+x[pos]);

		}
		catch (InputMismatchException ime)
		{
			System.out.println("immproper input: "+ime);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Invalid index: "+ae);
		}
		catch(Exception a)
		{
			System.out.println("Execution problem "+a);
		}

		System.out.println("End of the program");
	}
}
