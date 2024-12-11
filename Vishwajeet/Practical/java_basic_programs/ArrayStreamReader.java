import java.io.InputStreamReader;
import java.io.BufferedReader;
class ArrayStreamReader {
	public static void main(String []args) throws Exception{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter element count");
		int cnt=Integer.parseInt(br.readLine());
		int []x=new int[cnt];
		System.out.println("Enter Array "+cnt+ " element");
		for(int i=0;i<cnt;i++) {
			x[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Array elements are");
	for(int i=0;i<x.length;i++) {
		System.out.print("  "+x[i]);
	}
	}
}
		
