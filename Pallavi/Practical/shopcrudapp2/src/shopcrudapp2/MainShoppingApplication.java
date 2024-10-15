//Modified delete file
//	17/06/24

package shopcrudapp2;

import java.io.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Serializable;

class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private int icode;
	private int price;
	private String name;
	private int mrp;
	private int count;

	public Item(int code, String name, int price, int mrp, int count) {
		this.icode = code;
		this.name = name;
		this.price = price;
		this.mrp = mrp;
		this.count = count;

	}

	public String getName() {
		return name;
	}

	public int getiCode() {
		return icode;
	}

	public int getCount() {
		return count;
	}

	public int getPrice() {
		return price;
	}

	public int getMrp() {
		return mrp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(int code) {
		this.icode = code;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	public String toString() 
	{
		return "code=" + icode + ", name = " + name + ", price = " + price + " , count = " + count + " , mrp = "+mrp ;
	}
}

class FileUtil 
{
	private static final String File_Name = "items1.txt";

	public static void saveItems(List<Item> items) throws IOException 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(items);
		}

	}

	public static List<Item> loadItems() throws ClassNotFoundException, IOException 
	{
		File file = new File(File_Name);

		if (!file.exists()) 
		{
			return new ArrayList<>();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name))) 
		{
			return (List<Item>) ois.readObject();
		}
	}
	
	public static void addItem(Bill bill)
	{
		System.out.println("Individual bill: "+bill.Indi_Tot);
		
	}
}

class MainShoppingApplication 
{
	public static void main(String[] args) throws NumberFormatException 
	{
		try 
		{
			List<Item> items = FileUtil.loadItems();

			Scanner scanner = new Scanner(System.in);
			boolean running = true;

			while (running) 
			{
				System.out.println("Choose an operation: create , read , update , delete,sell ,cart, exit ");
				String operation = scanner.nextLine();

				switch (operation.toLowerCase()) 
				{
				case "create":
					Create.createItem(scanner, items);
					break;

				case "read":

					Read.readItems(items);
					break;

				case "update":
					Update.updateItems(scanner, items);
					break;

				case "delete":
					Delete.deleteItem(scanner, items);
					break;

				case "sell":
					Sell.SellItem(scanner, items);
					break;
					
//				case "bill":
//					Bill.BillItem(scanner, items);
			
				case "exit":
					running = false;
					break;

				default:
					System.out.println("Invalid Operation");
					
				}
				FileUtil.saveItems(items);
			}
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
	}
}