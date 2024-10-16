package FileExample;

import java.io.File;

public class DirectoryExample {

	public static void main(String[] args) throws Exception {
		File directory = new File("Directory");
		if(directory.mkdir()) {
			System.out.println("Directory created "+directory.getAbsolutePath());
		}
		else {
			System.out.println("Directory already exist or failed to create!");
		}
		
		for(int i=0;i<5;i++) {
			File file = new File("Directory","example"+ i + ".txt");
			
			if(file.createNewFile()) {
				System.out.println("File created "+file.getName());
			}
			else {
				System.out.println("file already exist "+file.getName());
			}
			
			System.out.println("files in directory ");
			File [] fileslist = directory.listFiles();
			if(fileslist!=null) {
				for(File f:fileslist) {
					System.out.println(f.getName());
				}
			}
			if(fileslist !=null) {
				for(File f:fileslist) {
					if(f.delete()) {
						System.out.println("File deleted "+f.getName());
					}
					else {
						System.out.println("failed to delete file "+f.getName());
					}
				}
			}
			if(directory.delete()) {
				System.out.println("Directory deleted "+directory.getName());
			}
			else {
				System.out.println("Failed to delete directory ");
			}
		}	
	}
}
