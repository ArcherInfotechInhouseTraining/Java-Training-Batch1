import java.io.InputStreamReader;
import java.io.BufferedReader;
class EvenOdd {
	public static void main(String []args) throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int x;
		System.out.println("Enter value of x");
		x=Integer.parseInt(br.readLine());
		if(x%2==0) {
			System.out.println(+x+"Number is even");
		}
		else {
			System.out.println(+x+"Number is odd");
		}
	}
}