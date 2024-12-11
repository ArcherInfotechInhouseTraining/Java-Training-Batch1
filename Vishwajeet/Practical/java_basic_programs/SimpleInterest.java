import java.io.InputStreamReader;
import java.io.BufferedReader;
class SimpleInterest {
	public static void main(String []args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double p=0,r=0,n=0,si=0.0;
		System.out.println("Enter the value of p");
		p=Double.parseDouble(br.readLine());
		System.out.println("Enter the value of r");
		r=Double.parseDouble(br.readLine());
		System.out.println("Enter the value of n");
		n=Double.parseDouble(br.readLine()); 

		si=(p*r*n)/100;
		System.out.println("Simple Interest: "+si);
	}
}

