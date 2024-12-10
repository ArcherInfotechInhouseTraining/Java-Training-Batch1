package FileExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\myfileout.txt");
			BufferedInputStream bis= new BufferedInputStream(fis); 
			
			bis.skip(5);
			System.out.println("After skipping  5 bytes");
				int i=0;
				while((i=bis.read())!=-1) {
					char ch = (char)i;
					System.out.print(ch);
				}
				bis.close();
				fis.close();
	
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
