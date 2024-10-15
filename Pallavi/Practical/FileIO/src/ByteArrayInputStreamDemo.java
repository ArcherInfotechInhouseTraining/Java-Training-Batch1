import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		
		String str = "Hello World";
		byte arr[] = str.getBytes();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		
		int ch;
		ch = bais.read();
		
		while(ch != -1)
		{
			System.out.print((char)ch);
			ch=bais.read();
		}
	}

}
