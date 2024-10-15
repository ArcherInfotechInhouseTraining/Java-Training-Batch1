package Six;
import java.io.*;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.*;
import java.io.*;
public class Filetext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream f1=new FileInputStream("f1.txt");
		DataInputStream d1=new DataInputStream(d1);
		int count=d1.available();
		byte[] a=new byte[count];
		d1.read(a);
		for(byte b:a) {
			char k=(char)b;
			System.out.print(k+"=");
		}
		
		

	}

}
