package shopcrudapp2;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

/*
class BillItem implements Serializable
{

public static int billNo = 1;

	private static final long serialVersionUID = 1L;
	
	private int icode;
	private int price;
	private String name;
	private int mrp;
	private int count;
	
	public BillItem(Item i,int cnt) 
	{
		icode = i.getiCode();
		name = i.getName();
		count = cnt;
		mrp = i.getMrp();
	}
	
	public BillItem(Item i) 
	{
		icode = i.getiCode();
		name = i.getName();
		count = i.getCount();
		mrp = i.getMrp();
	}
	public BillItem() {
		// TODO Auto-generated constructor stub
	}

	public String getName()
	{
		return name;
	}
	
	public int getCode()
	{
		return icode;
	}
	
	public int getMrp()
	{
		return mrp;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString() 
	{
		return "code=" + icode + ", name = " + name + " , count = " + count + " , mrp = "+mrp;
	}
	
	public static void finalBill(List<BillItem> Bill )
	{
		int iTotal , finalTot = 0 ;
		
		
		Date date = new Date();
		
		System.out.println("Date: "+date);
		System.out.println("BillNo: "+billNo);
		billNo++;
		
		System.out.println("Icode \t Name \t MRP \t Icount \t Itotal");
		for(BillItem i : Bill)
		{
			iTotal = 0;
			iTotal = i.getMrp() * i.getCount();
			System.out.println(i.getCode()+" \t "+i.getName()+" \t "+i.getMrp()+" \t "+i.getCount() +" \t      "+iTotal);
			
			finalTot = finalTot + iTotal;
		}
	
		System.out.println("Your final bill is: "+finalTot);
	}

}

class FileBillUtil implements Serializable
{

	private static final long serialVersionUID = 1L;
	private static final String File_Name = "Bill.txt";

	public static void saveBills(Bill bill) throws FileNotFoundException, IOException 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(bill);
		}
	}

	public static List<BillItem> loadBills() throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		File file = new File(File_Name);

		if (!file.exists()) 
		{
			return new ArrayList<>();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name)))
		{
			return (List<BillItem>) ois.readObject();
		}
	}
}

public class Bill 
{
	private int icode;
	private String name;
	private int mrp;
	private int count;
	
	public Bill(Item i) 
	{
		icode = i.getiCode();
		name = i.getName();
		mrp = i.getMrp();
		count = i.getCount();
	}

	public String getName()
	{
		return name;
	}
	
	public int getCode()
	{
		return icode;
	}
	
	public int getMrp()
	{
		return mrp;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString() 
	{
		return "code=" + icode + ", name = " + name + " , count = " + count + " , mrp = "+mrp;
	}


	public static void BillItem(Scanner sc, List<SellItem> items) throws IOException, ClassNotFoundException,NumberFormatException 
	{
		int cnt;
		boolean running = true;
		int flg = 0;
		

		List<BillItem> Bill = FileBillUtil.loadBills();

		System.out.println("\nIcode \t Name \t MRP \t Count ");
		for (SellItem i : items) 
		{
			System.out.println(i.getCode() + " \t " + i.getName() + " \t " + i.getMrp()+ " \t "+ i.getCount());
		}	
	}
}

*/

public class Bill
{
	double Indi_Tot;
	{
		Indi_Tot = 0;
	}
	
	public Bill( List<Item> item, int count , int code )
	{
		for(Item i : item)
		{
			if(code == i.getiCode())
			{
				Indi_Tot = count * i.getMrp();
			}
		}
	}
}
