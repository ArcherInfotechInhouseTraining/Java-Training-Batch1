package FileExample;
import java.io.File;
//import java.io.IOException;
public class FileParentChildExample {

	public static void main(String[] args) {
		
		String parentDir = "D:\\parentDir";
		
		File parentDirectory = new File(parentDir);
		
		if(!parentDirectory.exists()) {
			if(parentDirectory.mkdir()) {
				System.out.println("parent directory created "+ parentDirectory.getAbsolutePath());
			}
			else {
				System.out.println("Failed to create parent directory");
			}
		}
		
		String childfile = "childfile.txt";
		
		File file = new File(parentDir,childfile);
		try {
			if(file.createNewFile()) {
				System.out.println("File created "+file.getAbsolutePath());	
			}
			else {
				System.out.println("file already exists "+file.getAbsolutePath());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(file.delete()) {
			System.out.println("file deleted "+file.getAbsolutePath());
		}
		else {
			System.out.println("failed to delete file");
		}
		
		if(parentDirectory.delete()){
			System.out.println("parent directory deleted "+file.getAbsolutePath());
			
		}
		else {
			System.out.println("failed to delete parentdirectory");
		}		
		
	}

}
