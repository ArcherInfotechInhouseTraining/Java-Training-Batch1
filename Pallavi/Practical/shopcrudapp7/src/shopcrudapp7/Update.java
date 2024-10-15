package shopcrudapp7;

import java.util.List;
import java.util.Scanner;

public class Update {

	static void updateItem(Scanner scanner, List<Item> items)	
	{
		System.out.println("Enter item id to update:");
		int id = Integer.parseInt(scanner.nextLine());
		for (Item item : items) 
		{
			if (item.getiCode() == id) 
			{
				System.out.println("Enter new item name:");
				String newName = scanner.nextLine();
				item.setName(newName);
				System.out.println("Item updated.");
					
			}
			else
			{
				System.out.println("Item not found.");
			}
			return;
		}
	}
}
