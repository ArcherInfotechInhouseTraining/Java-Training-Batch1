import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIo2
{
	public static void main(String[]args) throws Exception
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter any int value: ");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter any fractional value: ");
		y=Double.parseDouble(br.readLine());

		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("sum= "+(x+y));
	}
}