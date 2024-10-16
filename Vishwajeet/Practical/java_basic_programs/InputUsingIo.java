import java.io.InputStreamReader;
import java.io.BufferedReader;

class InputUsingIo
{
	public static void main(String []args)
	{	
		int x = 0;
		double y = 0.0;

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try
		{
			System.out.println("Enter the int value: ");
			x = Integer.parseInt(br.readLine());
			System.out.println("Enter the fractional value: ");
			y=Double.parseDouble(br.readLine());	
		}
		catch(Exception e){}
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("Sum= "+(x+y));
	}
}
