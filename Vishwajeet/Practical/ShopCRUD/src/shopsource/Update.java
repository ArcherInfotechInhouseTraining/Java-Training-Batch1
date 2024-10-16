package shopsource;

import java.util.List;
import java.util.Scanner;

public class Update {
	public static void updateItem(Scanner scanner, List<Item> items) {
        System.out.println("Enter item id to update:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Item item : items) {
            if (item.getId() == id) {
                System.out.println("Enter new item name:");
                String newName = scanner.nextLine();
                item.setName(newName);
                System.out.println("Item updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
