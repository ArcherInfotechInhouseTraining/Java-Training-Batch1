package FileExample;
import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		
		String str = "Hello Java";
		byte [] br = str.getBytes();
		ByteArrayInputStream bras  = new ByteArrayInputStream(br);
		
		int ch;
		ch = bras.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=bras.read();
		}
			
	}

}
