package FileExample;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileIOStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		String file = "D:\\example.txt";
		String contentToWrite = "Hello World! How are you good morning! to all of you";
		
		// write content to file by using FileOutputStream
		FileOutputStream fos = new FileOutputStream(file);
		try(fos){
			fos.write(contentToWrite.getBytes());
			System.out.println("Content written to file");
		} catch(IOException e) {
			System.out.println("Error to writing the file "+e.getMessage());
		}
		try(FileInputStream fis = new FileInputStream(file)){
			int content;
			System.out.println("read content from file:");
			while((content = fis.read())!=-1) {
				System.out.print((char)content);
			}
			System.out.println();
		} catch(IOException e) {
			System.out.println("Error while reading file "+e.getMessage());
		}

	}

}
