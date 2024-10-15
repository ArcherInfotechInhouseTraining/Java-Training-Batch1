import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) throws IOException {
		String filepath = "myfileout.dat";
		
		FileOutputStream fos = new FileOutputStream(filepath);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("Welcome to java prg.World");
		dos.write(1);
		dos.writeInt(8);
		dos.writeDouble(32.4);
		dos.writeChar('P');
		dos.writeBoolean(true);
		
		dos.close();
		fos.close();
		
		// Reading data from the "myfileout.dat" file.
		FileInputStream fis = new FileInputStream(filepath);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		
		dis.close();
		fis.close();
	}
}
