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

class CartItem implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int icode;
	private int price;
	private String name;
	private int mrp;
	private int count;
	
	public CartItem(Item i , Bill bill , int cnt)
	{
		icode = i.getiCode();
		name = i.getName();
		count = i.getCount();
		mrp = i.getMrp();
	}
	
	public int getMrp()
	{
		return mrp;
	}
	
	public String toString() 
	{
		return "code=" + icode + ", name = " + name + " , count = " + count + " , mrp = "+mrp;
	}
	
	public static void finalBill(List<CartItem> item )
	{
		int iTotal , finalTot = 0 ;
		
//		Date date = new Date();
		
//		System.out.println("Date: "+date);
//		System.out.println("BillNo: "+billNo);
//		billNo++;
		
		System.out.println("Icode \t Name \t MRP \t Icount \t Itotal");
		for(CartItem i : item)
		{
			iTotal = 0;
			iTotal = i.getMrp() * i.getCount();
			System.out.println(i.getCode()+" \t "+i.getName()+" \t "+i.getMrp()+" \t "+i.getCount() +" \t      "+iTotal);
			
			finalTot = finalTot + iTotal;
		}
	
		System.out.println("Your final bill is: "+finalTot);
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class CartFileUtil 
{
	private static final String File_Name = "cart.txt";

	public static void saveItems(List<CartItem> cart) throws IOException 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(cart);
		}

	}

	public static List<CartItem> loadItems() throws ClassNotFoundException, IOException 
	{
		File file = new File(File_Name);

		if (!file.exists()) 
		{
			return new ArrayList<>();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name))) 
		{
			return (List<CartItem>) ois.readObject();
		}
	}
}
//
//class SellItem 
//{
//	public static void finalSell(List<SellItem> Sell )
//	{
//		
//	}
//
//}

//class FileSellUtil 
//{
//	private static final String File_Name = "Sell.txt";
//
//	public static void saveSells(List<SellItem> sell) throws FileNotFoundException, IOException 
//	{
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
//		{
//			oos.writeObject(sell);
//		}
//	}
//
//	public static List<SellItem> loadSells() throws FileNotFoundException, IOException, ClassNotFoundException 
//	{
//		File file = new File(File_Name);
//
//		if (!file.exists()) 
//		{
//			return new ArrayList<>();
//		}
//
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name)))
//		{
//			return (List<SellItem>) ois.readObject();
//		}
//	}
//}

public class Sell 
{

	private static final long serialVersionUID = 1L;
	
	public static void SellItem(Scanner sc, List<Item> items) throws IOException, ClassNotFoundException,NumberFormatException 
	{
		int cnt;
		boolean running = true;
		int flg = 0;

//		List<SellItem> sell = FileSellUtil.loadSells();
		List<CartItem> cartitem = CartFileUtil.loadItems();

		System.out.println("\nIcode \t Name \t MRP \t Count ");
		for (Item i : items) 
		{
			System.out.println(i.getiCode() + " \t " + i.getName() + " \t " + i.getMrp()+ " \t "+ i.getCount());
		}

		do {
			
			flg = 0;
			
			System.out.println("Enter item code that u want to purches: ");
			int code = Integer.parseInt(sc.nextLine());

			for (Item i : items) 
			{
				//flg = 0;
				if (i.getiCode() == code) 
				{
					
					flg = 1;
					System.out.println("Enter the item count: ");
					int count = Integer.parseInt(sc.nextLine());
					if ( count <= i.getCount() ) 
					{
//						
//						sell.add(new SellItem(i, count) );
//
//						cnt =  i.getCount() -  count;
//						i.setCount(cnt);
						
						Bill bill = new Bill(items , count , code);
						FileUtil.addItem(bill);
						
						cartitem.add(new CartItem(i , bill , count));
//						FileUtil.saveItems(items);
//						FileSellUtil.saveSells(sell);
//						FileBillUtil.saveBills(bill);
//						Cart cart = new Cart(i);
						CartFileUtil.saveItems(cartitem);
					}
					else
					{
						System.out.println("Sorry....!!\n We Don't have that much count for item : "+ i.getName() +"\nplease enter item count upto : "+i.getCount());
					}	
				}
			}
			if(flg == 0)
			{
				System.out.println("Please enter valid code: ");
			}
			
			System.out.println("Do you want to continue ?");
			//char ch = sc.nextLine().charAt(0);
			String ch = sc.nextLine();
			if(ch.equals("yes"))
			{
				running = true;
			}
			else
			{
				running = false;
//				System.out.println("Your final Sell list: ");
//				Cart.display();
//				Itemcart.cartDisplay(cart);
			}

		} while (running);

//		SellItem.finalSell(sell);
		
		System.out.println("Please Confirm your Sell list: ");
		System.out.println("1.Confirm \t 2.Cancel");
		System.out.println("Please enter your choice: ");
		int ch = Integer.parseInt(sc.nextLine());
		
		if(ch == 1)
		{
			System.out.println("THANK YOU FOR VISITING US.....!!");
			
		}
		else
		{
			System.out.println("Your Sell List is Canceled......");
		}
	}

}
