package shopcrudapp1;

import java.util.List;

class Read
{
	public static void readItems(List<Item> items)
	{
		if(items.isEmpty())
		{
			System.out.println("No item found.");
		}
		else
		{
			for(Item item : items)
			{
				System.out.println(item);
			}
		}
	}
}