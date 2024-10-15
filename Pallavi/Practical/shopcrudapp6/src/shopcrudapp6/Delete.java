package shopcrudapp6;

import java.util.List;
import java.util.Scanner;

public class Delete {

	static void deleteItem(Scanner scanner, List<Item> items) 
	{
	
		System.out.println("Enter item code to delete:");
    
		int id = Integer.parseInt(scanner.nextLine());
    
		items.removeIf(item -> item.getiCode() == id);
    
		System.out.println("Item deleted.");
	}
	
}
