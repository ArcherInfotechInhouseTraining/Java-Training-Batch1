import java.io.InputStreamReader;
import java.io.BufferedReader;

class InputUsingIo
{
	public static void main(String []args)
	{	
		int x = 0;
		double y = 0.0;

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BuffredeReader(isr);
		
		try
		{
			int x=Integer parseInt(args[0]);
			double y=Double parseDouble(args[1]);	
		}
		catch(Exception e){}
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("Sum= "+(x+y));
	}
}
