
package six;
import java.io.ByteArrayOutputStream;

public class Fileout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Fileoutputstream fout1= new Fileoutputstream("f1.text");
		FileOutPutStream fout2= new FileOutPutStream("f2.text");
			
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			bout.flush();
			bout.close();
			System.out.println("Success.....");
			}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
