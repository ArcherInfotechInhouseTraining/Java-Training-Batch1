package shopcrudapp7;

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

class StockItem implements Serializable
{
	private static final long serialVersionUID = 1L;
	 
	private int code;
	private int count;
	
	public StockItem(int code, int count) {
		
		this.code = code;
		this.count = count;
	}

	public int getCode()
	{
		return code;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	

	@Override
	public String toString() {
		return "StockItem {code=" + code + ", count=" + count + "}";
	}
	
	
}

class StockFileUtil 
{
	
	private static final String Stock_Name = "stocks.txt";
	
	
	public static List<StockItem> loadStock() throws ClassNotFoundException, IOException
	{
		File file = new File(Stock_Name);
		
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Stock_Name)))
		{
			return (List<StockItem>) ois.readObject();
		}
	}
	
	public static void saveStock(List<StockItem> stock) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Stock_Name)))
		{
			oos.writeObject(stock);
		}
	}
}

public class Stock
{
	

	public static void stockMenue(Scanner sc, List<Item> items) throws ClassNotFoundException
	{
		try
		{
			List<StockItem> stock = StockFileUtil.loadStock();
			String str;
			
			do
			{
				System.out.println("Enter any option: ");
				System.out.println("1.create \t 2.read \t 3.update \t 4.delete");
				int op = Integer.parseInt(sc.nextLine());
				
				switch(op)
				{
				
				case 1:
					System.out.println("Enter item code: ");
					int code = Integer.parseInt(sc.nextLine());
					int flg = 0;
					for(Item i : items)
					{
						if( code == i.getiCode())
						{
							System.out.println("Enter count for item code: "+i.getiCode());
							int count = Integer.parseInt(sc.nextLine());
					
							stock.add(new StockItem(code, count));
							System.out.println("Stock created.");
							flg = 1;
						}
					}
					if(flg==0)
					{
						System.out.println("Invalid item code.");
					}
					break;
					
				case 2:
					for(StockItem i : stock)
					{
						System.out.println(i);
					}
					break;
					
				case 3:
					System.out.println("Enter the code that you want to update: ");
					int icode = Integer.parseInt(sc.nextLine());
					int flg1 = 0;
					
					for(StockItem i : stock)
					{
						if(icode == i.getCode())
						{
							System.out.println("You want to add or remove count form item code: "+i.getCode());
							String ch = sc.nextLine();
							
							if(ch.equals("add"))
							{
								System.out.println("Please enter the item count: ");
								int count = Integer.parseInt(sc.nextLine());
								count = count + i.getCount();
								i.setCount(count);
							}
							else
							{
								System.out.println("Enter the item count that you want remove");
								int count = Integer.parseInt(sc.nextLine());
								count = i.getCount() - count;
								i.setCount(count);
							}
							flg1 = 1;
						}	
					}
					
					if(flg1 == 0)
					{
						System.out.println("Invalid item code.");
					}
					else
					{
						System.out.println("Item updated succesfully.");
					}
	
					break;
					
				case 4:
					System.out.println("Enter the item code: ");
					int code1 = Integer.parseInt(sc.nextLine());
					int flg11 = 0;
					
					for(int i=0 ; i<stock.size() ; i++)
					{
						if( stock.get(i).getCode() == code1 )
						{
							stock.remove(i);
							System.out.println("Stock deleted.");
							flg11 = 1;
						}
					}
					if(flg11==0)
					{
						System.out.println("Invalid item code.");
					}
					break;
					
					default:
						System.out.println("Invalid option");
				}
				StockFileUtil.saveStock(stock);
				
				System.out.println("Enter yes  to continue or no to stop..!!");
				str = sc.nextLine();
				
			}while(str.equals("yes"));
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}