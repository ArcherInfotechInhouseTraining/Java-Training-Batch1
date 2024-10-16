package FileExample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) throws IOException {
		String filepath = "D:\\myfileout.dat";
		
		FileOutputStream fos = new FileOutputStream(filepath);
		
		// create data output stream for create wrap for fos
		DataOutputStream dos = new DataOutputStream (fos);
		
		dos.writeUTF("Welcome to java by Archer Infotech!");
		dos.writeInt(777);
		dos.writeDouble(777.777);
		dos.writeBoolean(true);
		dos.writeChar('A');
		
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(filepath);
		
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
		dis.close();
		fis.close();

	}

}
