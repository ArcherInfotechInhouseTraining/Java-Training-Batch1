import java.io.InputStreamReader;
import java.io.BufferedReader;
class DemoArith
{
	public static void main(String []args) throws Exception
	{
		int p=0,n=0;
		double s=0.0,r=0.0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter P : ");
		p=Integer.parseInt(br.readLine());

		System.out.println("Enter n : ");
		n=Integer.parseInt(br.readLine());

		System.out.println("Enter r : ");
		r=Double.parseDouble(br.readLine());

		s=(p*r*n)/100;
		System.out.println("s : "+s);
	}
}