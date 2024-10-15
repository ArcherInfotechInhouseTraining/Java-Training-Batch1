package shopcrudapp;

import java.util.List;

class Read
{
	public static void readItems(List<Item> itemss)
	{
		if(itemss.isEmpty())
		{
			System.out.println("No item found.");
		}
		else
		{
			for(Item item : itemss)
			{
				System.out.println(item);
			}
		}
	}
}