package shopsource2;

import java.util.List;
import java.util.Scanner;

class Delete
{
	public static void  deleteItem(Scanner scanner , List<Item> items)
	{
		System.out.println("Enter item code to delete : ");
		int code = Integer.parseInt(scanner.nextLine());

		if( ( (Item) items).getCode() == code)
		{
			items.removeIf(item -> item.getCode() == code);
			System.out.println("Item is deleted.");
		}
		else
		{
			System.out.println("Invalid code.");
		}
		
		items.removeIf(item->item.getCode() == code);	
	}
}
