package shopsource;

import java.util.List;
import java.util.Scanner;

public class Create {
	public static void createItem(Scanner scanner, List<Item> items, List<Stock>stocks) {
		
        System.out.println("Enter item id:");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter item name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter item price:");
        double price = Double.parseDouble(scanner.nextLine());
        
//        System.out.println("Enter the stock count:");
//        int quantity = Integer.parseInt(scanner.nextLine());
        
        items.add(new Item(id, name, price));
        stocks.add(new Stock(id, 0));
        
        System.out.println("Item created.");
        
    }


}
