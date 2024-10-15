package shopcrudapp7;

import java.util.List;

public class Read {

	static void readItems(List<Item> items) 
	{
		if (items.isEmpty()) 
		{
			System.out.println("No items found.");
		} 
		else 
		{
			for (Item item : items) 
			{
				System.out.println(item);
			}
		}
	}
}
