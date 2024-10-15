package shopcrudapp7;

import java.util.List;
import java.util.Scanner;

public class Create {
	
	static void createItem(Scanner scanner, List<Item> items ) 
	{

		System.out.println("Enter item id:");
		int code = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter item name:");
		String name = scanner.nextLine();

		System.out.println("Enter item price:");
		double price = Double.parseDouble(scanner.nextLine());
				

		items.add(new Item(code, name, price));
		
		System.out.println("Item created.");
	}
}
