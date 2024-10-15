package shopcrudapp1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class FinalBill implements Serializable
{

	private static final long serialVersionUID = 1L;
	private final static String File_Name = "bill.txt";
	
	public static void saveBill(List<Bill> bill) throws IOException 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(bill);
		}

	}

	public static List<Bill> loadBill() throws ClassNotFoundException, IOException 
	{
		File file = new File(File_Name);

		if (!file.exists()) 
		{
			return new ArrayList<>();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name))) 
		{
			return (List<Bill>) ois.readObject();
		}
	}
}

public class Bill implements Serializable{
	
	public Bill(int code) throws ClassNotFoundException, IOException 
	{
		List<Item> items = FileUtil.loadItems();
		List<Bill> bill = FinalBill.loadBill();
		
		for(Item i : items)
		{
//			if(code == ((Item) i).getiCode())
			if(code == i.getiCode())
			{
				bill.add(this);
			}
		}
		FinalBill.saveBill(bill);
	}
}
