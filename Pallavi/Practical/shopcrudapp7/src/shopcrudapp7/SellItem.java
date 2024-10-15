
package shopcrudapp7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellItem {

	
	static void sell(Scanner sc , List<Item> items , List<Cart> carts ) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		List<StockItem> stock = StockFileUtil.loadStock();
		Cart cart = new Cart();
		String opt ;
		int count=0, count1 , code;
		double total = 0;
		int flg ;
		
		do
		{
			System.out.println("Enter item code: ");
		    code = Integer.parseInt(sc.nextLine());
		    flg = 0;
			for(StockItem i : stock)
			{
				if(code == i.getCode())
				{
					for(Item j : items)
					{
						if(code == j.getiCode())
						{
							System.out.println("Enter item count: ");
							count = Integer.parseInt(sc.nextLine());

							if(count <= i.getCount())
							{
								count1 = i.getCount() - count;
								i.setCount(count1);
								flg = 1;
								
								Bill.addtoBill(code, count, j.getPrice());
								
								StockFileUtil.saveStock(stock);
								
							}
						}
					}
					
				}	
			}
			
			if(flg == 1)
			{
				cart.addItem(new Bill(FileUtil.getItemByCode(items, code) , count ));
			}
			else
			{
				System.out.println("Whether your item code is invalid or u enterd stock is not available");
			}
	
			System.out.println("Enter yes to Continue or no to stop: ");
			opt = sc.nextLine();
			
		}while(opt.equals("yes"));
		
		carts.add(cart);
	}
}
