package shopsource2;
import java.io.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Serializable;

class Item implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int code;
	private int price;
	private String name;
	private int mrp;
	private int count;

	public Item(int code , String name , int price , int mrp , int count )
	{
		this.code = code;
		this.name = name;
		this.price = price;
		this.mrp = mrp;
		this.count = count;

	}

	public String getName()
	{
		return name;
	}

	public int getCode()
	{
		return code;
	}

	public int getCount()
	{
		return count;
	}

	public int getPrice()
	{
		return price;
	}

	public int getMrp()
	{
		return mrp;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public void setMrp(int mrp)
	{
		this.mrp = mrp;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public String toString()
	{
//		return "Item{" +
//				"code=" + code +
//				", name= ' " + name + '\'' + ", price= "+price+" , count= "+count+
//				'}';
		
		return "code=" + code +", name = " + name  + ", price = "+price+" , count = "+count ;
	}
}


class FileUtil
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

class MainShoppingApplication 
{
 public static void main(String[] args)
 {
     try
     {
         List<Item> items = FileUtil.loadItems();

         Scanner scanner = new Scanner(System.in);
         boolean running = true;

         while(running)
         {
             System.out.println("Choose an operation: create , read , update , delete , exit ");
             String operation = scanner.nextLine();

             switch(operation.toLowerCase())
             {
                 case "create":
                     Create.createItem(scanner, items);
                     break;

                 case "read":
                	 
                     Read.readItems(items);
                     break;

                 case "update":
                     Update.updateItems(scanner , items);
                     break;

                 case "delete":
                     Delete.deleteItem(scanner , items);
                     break;

                 case "exit":
                     running = false;
                     break;
                 default:
                     System.out.println("Invalid Operation");
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