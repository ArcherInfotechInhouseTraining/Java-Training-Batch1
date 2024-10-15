
public class First {

	public static void main(String[] args) {
		int i=50;
		int j=0;
		int data;
		try {
			data=i/j;
			
		}
		//if we knoew our exception name we can give it e.g ArithmeticException
		//if we don't know our exception name we write e
		catch(Exception e) {
			System.out.println(i/(j+1));
		}
	}
	
}
