package shopcrudapp2;
/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Itemcart
{
	private int icode;
	private int price;
	private String name;
	private int mrp;
	private int count;
	
	public Itemcart(Bill bill)
	{
		icode = bill.getCode();
		name = bill.getName();
		count = bill.getCount();
		mrp = bill.getMrp();
	}
	public String toString() 
	{
		return "code=" + icode + ", name = " + name + " , count = " + count + " , mrp = "+mrp;
	}
	
//	public static void loadCart()
//	{
//		List<Cart> cart = new ArrayList<>();
//	}
	
	
	
//	public static void finalBill(List<BillItem> Bill )
//	{
//		int iTotal , finalTot = 0 ;
//		
//		
//		Date date = new Date();
//		
//		System.out.println("Date: "+date);
//		System.out.println("BillNo: "+billNo);
//		billNo++;
//		
//		System.out.println("Icode \t Name \t MRP \t Icount \t Itotal");
//		for(BillItem i : Bill)
//		{
//			iTotal = 0;
//			iTotal = i.getMrp() * i.getCount();
//			System.out.println(i.getCode()+" \t "+i.getName()+" \t "+i.getMrp()+" \t "+i.getCount() +" \t      "+iTotal);
//			
//			finalTot = finalTot + iTotal;
//		}
//	
//		System.out.println("Your final bill is: "+finalTot);
//	}

}

class CartFileUtil 
{
	private static final String File_Name = "cart.txt";

	public static void saveItems(Cart cart) throws IOException 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(cart);
		}

	}

	public static List<Itemcart> loadItems() throws ClassNotFoundException, IOException 
	{
		File file = new File(File_Name);

		if (!file.exists()) 
		{
			return new ArrayList<>();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name))) 
		{
			return (List<Itemcart>) ois.readObject();
		}
	}
}

public class Cart 
{
	static List<Itemcart> cart1 = new ArrayList<>();
	
	public Cart(Item i) throws ClassNotFoundException, IOException 
	{	
		List<Itemcart> cart = CartFileUtil.loadItems();
//		cart.add(new Itemcart(i));
//		CartFileUtil.saveItems((Itemcart) cart);
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public void addItems(Bill bill) throws ClassNotFoundException, IOException {
		cart1 = CartFileUtil.loadItems();
		cart1.add(new Itemcart(bill));
		
	}
	
	public static  void display()
	{
		System.out.println(cart1);
	}
}
*/