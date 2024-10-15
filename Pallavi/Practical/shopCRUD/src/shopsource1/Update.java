package shopsource1;

import java.util.List;
import java.util.Scanner;

class Update
{
 
    public static void updateItems(Scanner sc, List<Item> items) 
    {
        System.out.println("Enter item id to update:");
        int code = Integer.parseInt(sc.nextLine());
        for (Item item : items) 
        {
            if (item.getCode() == code) 
            {
            	
                System.out.println("Enter new item name:");
                String newName = sc.nextLine();
                item.setName(newName);
                
                System.out.println("Enter new item price: ");
                int price = Integer.parseInt(sc.nextLine());
                item.setPrice(price);
                
                System.out.println("Item updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}