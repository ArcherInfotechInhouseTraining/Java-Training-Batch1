package shopcrudapp2;

import java.util.List;
import java.util.Scanner;

class Update
{
 
    public static void updateItems(Scanner sc, List<Item> items) 
    {
    	boolean run = true;
        System.out.println("Enter item id to update:");
        int code = Integer.parseInt(sc.nextLine());
        for (Item item : items) 
        {
            if (item.getiCode() == code) 
            {
            	
            	while(run)
            	{
            		
            		System.out.println("What you want to update: ");
                	System.out.println("1.Name \t 2.MRP \t 3.Count \t 4.Price \t 5.Icode \t 6.Stop");
                	System.out.println("Enter your choice: ");
                	int ch = Integer.parseInt(sc.nextLine());
            		
            		
            		switch(ch)
                	{
                	case 1:
                		
                		System.out.println("Enter new item name:");
                        String newName = sc.nextLine();
                        item.setName(newName);
                		
                		break;
                		
                	case 2:
                		
                		System.out.println("Enter new item price: ");
                        int mrp = Integer.parseInt(sc.nextLine());
                        item.setMrp(mrp);
                        
                        break;
                        
                	case 3:
                		
                		System.out.println("Enter new item count: ");
                		int cnt = Integer.parseInt(sc.nextLine());
                		item.setCount(cnt);
               
                        break;
                        
                	case 4:
                		
                		System.out.println("Enter new item price: ");
                        int price = Integer.parseInt(sc.nextLine());
                        item.setPrice(price);
                        
                        break;
                        
                	case 5:
                		
                		System.out.println("Enter new item code: ");
                		int icode = Integer.parseInt(sc.nextLine());
                		item.setCode(icode);
                		
                		break;
                		
                	case 6:
                		run = false;
                		break;
                	}
            	}
            	
                System.out.println("Item updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}