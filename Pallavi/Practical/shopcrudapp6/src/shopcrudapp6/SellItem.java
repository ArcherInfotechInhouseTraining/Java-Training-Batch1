package shopcrudapp6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SellItem {

	static void sell(Scanner sc , List<Item> items , List<Cart> carts , List<Stock> stock) throws FileNotFoundException, IOException
	{
		Cart cart = new Cart();
		String opt ;
		int count=0, count1 , code;
		double total = 0;
		
		do
		{
			System.out.println("Enter item code: ");
		    code = Integer.parseInt(sc.nextLine());
		    
			for(Stock i : stock)
			{
//				System.out.println("i code is: "+i.getCode());
				if(code == i.getCode())
				{
					System.out.println("Enter item count: ");
					count = Integer.parseInt(sc.nextLine());

					if(count <= i.getCount())
					{
						for(Item j : items)
						{
							if(code == j.getiCode())
							{
								count1 = i.getCount() - count;
								i.setCount(count1);
								j.setCount(count1);
							}
						}
						
//						FileUtil.saveStock(stock);
					}
					
				}
			}
			cart.addItem(new Bill(FileUtil.getItemByCode(items, code) , count ));
			
			System.out.println("Enter yes to Continue or no to stop: ");
			opt = sc.nextLine();
			
		}while(opt.equals("yes"));
		
		carts.add(cart);
	}
}
