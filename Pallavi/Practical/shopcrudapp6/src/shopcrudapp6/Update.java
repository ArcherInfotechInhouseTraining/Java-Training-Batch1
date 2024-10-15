package shopcrudapp6;

import java.util.List;
import java.util.Scanner;

public class Update {

	static void updateItem(Scanner scanner, List<Item> items, List<Stock> stock)	
	{
		System.out.println("Enter item id to update:");
		int id = Integer.parseInt(scanner.nextLine());
		for (Item item : items) 
		{
			if (item.getiCode() == id) 
			{
				for(Stock j : stock)
				{
					if(j.getCode() == id)
					{
						System.out.println("Enter new item name:");
						String newName = scanner.nextLine();
						item.setName(newName);
						j.setName(newName);
						System.out.println("Item updated.");
					}
				}
				
				return;
			}
		}
		System.out.println("Item not found.");
	}
}
