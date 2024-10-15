package shopsource1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil
{
	private static final String File_Name = "items1.txt";
	
	public static void saveItems(List<Item> items) throws IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(items);
		}
		
	}
	
	 public static List<Item> loadItems() throws ClassNotFoundException , IOException
	 {
	     File file = new File(File_Name);

	     if(!file.exists())
	     {
	         return new ArrayList<>();
	     }

	     try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name)))
	     {
	         return(List<Item>) ois.readObject();
	     }
	 }
}
