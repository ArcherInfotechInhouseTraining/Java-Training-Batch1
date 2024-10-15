package shopcrudapp5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item implements Serializable
{
	 private static final long serialVersionUID = 1L;
	    private int code;
	    private String name;
	    private double price;

	    public Item(int id, String name, double price) {
	        this.code = id;
	        this.name = name;
	        this.price = price;
	    }

		public int getiCode() {
			return code;
		}

	    public double getPrice() {
	        return price;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Item{" +
	                "code=" + code +
	                ", name='" + name + '\'' +
	                ", Price='" + price + '\'' +                
	                '}';
	    }
}

class FileUtil
{
	private static final String File_Name = "items.txt";
	private static final String Cart_Name = "carts.txt";

	public static void saveItems(List<Item> items) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
		{
			oos.writeObject(items);
		}
	}
	
	public static List<Item> loadItems() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file = new File(File_Name);
		
		if( !file.exists())
		{
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name)))
		{
			return (List<Item>) ois.readObject();
		}
	}

	public static List<Cart> loadCarts() throws FileNotFoundException, IOException, ClassNotFoundException {

		File file = new File(Cart_Name);
		
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Cart_Name)))
		{
			return (List<Cart>) ois.readObject();
		}
	}
	
	public static Item getItemByCode(List<Item> items , int code)
	{
		for(Item i : items)
		{
			if(code == i.getiCode())
			{
				return i;
			}
		}
		return null;
	}
	
	public static void writeCart(List<Cart> cart) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Cart_Name)))
		{
			oos.writeObject(cart);
		}
	}
	
	public static void showBill(Cart c)
	{
		c.showBills();
	}
}
public class CRUDappl 
{

	public static void main(String[] args) 
	{
		
		try
		{
			List<Item> items = FileUtil.loadItems();
			List<Cart> carts = FileUtil.loadCarts();
			
			Scanner scanner = new Scanner(System.in);
			
			boolean running = true;
			
			while(running)
			{
				System.out.println("Choose an operation: create, read, update,sell, allcarts, delete, exit");
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
                		Update.updateItem(scanner, items);
                		break;
                		
                	case "sell":
                		SellItem.sell(scanner , items , carts);
                		FileUtil.writeCart(carts);
                		break;
                		
                	case "allcarts":
                		List<Cart> list = FileUtil.loadCarts();
          
                		for(int i=0 ; i<list.size() ; i++)
                		{
                			System.out.println("\n----------------Cart:"+(i+1)+"------------------\n");
                			FileUtil.showBill(list.get(i));
                		}
                		break;
                    
                	case "delete":
                		Delete.deleteItem(scanner, items);
                		break;
                    
                	case "exit":
                		running = false;
                		break;
                	default:
                		System.out.println("Invalid operation");
                }
                FileUtil.saveItems(items);  
			}
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.err.println("Error: "+e.getMessage());
		}
	}
}


