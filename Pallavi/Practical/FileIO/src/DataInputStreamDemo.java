import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException {


		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter any string: ");
		String str = dis.readLine();
		System.out.println("str = "+str);
		
		System.out.println("Enter any integer: ");
		int i = Integer.parseInt(dis.readLine());
		System.out.println("i = "+i);
		
		System.out.println("Enter any Double: ");
		double d = Double.parseDouble(dis.readLine());
		System.out.println("d = "+d);
	}

}
