import java.io.InputStreamReader;
import java.io.BufferedReader;

class DemoIfElse
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a=0;
		
		try
		{	
			System.out.println("Enter the value of a: ");
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
		}

		if(a%2==0)
		{
			System.out.println("Entered num is div by 2");
		}
		else
		{
			System.out.println("Entered num is not div by 2");
		}
	}

}