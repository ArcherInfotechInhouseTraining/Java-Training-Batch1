package shopcrudapp1;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Sell {
	
	public static void sellItem(Scanner sc , List<Item>items) throws ClassNotFoundException, IOException
	{
		String opt;
		Cart cart = new Cart();
		
		do
		{
//			FileUtil.showItemList();
			Read.readItems(items);
			
			System.out.println("Enter the item code: ");
			int code = Integer.parseInt(sc.nextLine());
			
			for(Item i : items)
			{
				if( code == i.getiCode())
				{
					System.out.println("Enter item count: ");
					int count = Integer.parseInt(sc.nextLine());
					
					if(count <= i.getCount())
					{
						Bill bill = new Bill(code);
						cart.addItem(bill);
					}
				}
			}
			System.out.println("yes to continue shopping.....!! otherwise no.");
			opt = sc.nextLine();
		}while(opt.equals("yes"));
		
		FileUtil.writeCart(cart);
		
	}

}
