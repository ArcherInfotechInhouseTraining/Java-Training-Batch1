package shopcrudapp5;

import java.util.List;
import java.util.Scanner;

public class SellItem {

	static void sell(Scanner sc , List<Item> items , List<Cart> carts )
	{
		Cart cart = new Cart();
		String opt ;
		int count , code;
		double total = 0;
		
		do
		{
			
			System.out.println("Enter item code: ");
		    code = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter item count: ");
			count = Integer.parseInt(sc.nextLine());
			
		
			
			cart.addItem(new Bill(FileUtil.getItemByCode(items, code) , count ));
			
			System.out.println("Enter yes to Continue or no to stop: ");
			opt = sc.nextLine();
		}while(opt.equals("yes"));
		
		carts.add(cart);
	}
}
