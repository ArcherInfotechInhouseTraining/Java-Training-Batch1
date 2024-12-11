package shopsource;

import java.util.List;
import java.util.Scanner;

public class Delete {
	 public static void deleteItem(Scanner scanner, List<Item> items) {
	        System.out.println("Enter item id to delete:");
	        int id = Integer.parseInt(scanner.nextLine());
	        items.removeIf(item -> item.getId() == id);
	        System.out.println("Item deleted.");
	    }
	 public static void deleteStock(Scanner scanner, List<Stock> stocks) {
	        System.out.println("Enter item id to delete:");
	        int id = Integer.parseInt(scanner.nextLine());
	        stocks.removeIf(stock -> stock.getItemId() == id);
	        System.out.println("Stock deleted.");
	    }
}
