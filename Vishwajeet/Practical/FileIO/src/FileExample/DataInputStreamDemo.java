package FileExample;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter any string: ");
		@SuppressWarnings("deprecation")
		String str = dis.readLine();
		System.out.println("String : "+str);
		
		
		System.out.println("Enter any integer");
		@SuppressWarnings("deprecation")
		int i = Integer.parseInt(dis.readLine()); //parsing
		System.out.println(" i : "+i);

		System.out.println("Enter any double");
		@SuppressWarnings("deprecation")
		double j = Double.parseDouble(dis.readLine()); //parsing
		System.out.println(" j : "+j);
	}
}
