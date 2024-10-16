package util;

import java.util.List;

import Source.Bill;
import Source.Cart;
import Source.Item;
import Source.Stock;
/**
 *  This class defines several different methods used to process the different lists
 */
public class ListUtil {
	/**
	 * search for the current code in the list of items
	 * @param code - This is item code to be searched
	 * @param items - this is list where you have to search the item
	 */
	public static boolean containsCode(int code, List<Item> items) {
		for(Item i : items) {
			if(i.getId()==code)
				return true;
		}
		return false;
	}

	public static void addOrUpdateStock(int code, int itemcount, List<Stock> stocks) {

		// if stock list is empty
		if(stocks.isEmpty()) {
			stocks.add(new Stock(code, itemcount));
			return;
		}
		
		// if stock having entry, the add/increase stock of item having same code
		boolean flg = false;
		for(Stock s : stocks) {
			if(s.getCode()==code) {
				s.updateStock(itemcount);
				flg=true;
			}
		}
		
		// if stock don't have entry, adding the stock of code <code> first time
		if(!flg) {
			stocks.add(new Stock(code, itemcount));
		}
			
	}
	
	public static Item getItemByCode(List<Item> items, int code) {
		// TODO Auto-generated method stub
		for (Item i : items) {
			if (i.getId() == code)
				return i;
		}
		return null;
	}

	public static boolean isInStock(int code, int count, List<Stock> stocks) {

		for(Stock s : stocks) {
			if(s.getCode()==code && s.getCountinstock()>=count) {
				return true;				
			}
		}
		return false;
	}

	public static void showCart(Cart cart) {
		System.out.println("\n -----------------------------------------------------");
		cart.showBills();
	}

	public static void UpdateStock(Cart cart, List<Stock> stocks) {
		// TODO Auto-generated method stub
		List<Bill> bill = cart.getBilList();
		for(Bill b : bill) {
			decreaseStock(b.getId(), b.getCount(), stocks);
		}
		
	}

	private static void decreaseStock(int id, int count, List<Stock> stocks) {
		// TODO Auto-generated method stub
		for (Stock s : stocks) {
			if(s.getCode() == id) {
				s.updateStock(-count);
			}
		}
	}

	public static double showAllCarts(List<Cart> carts) {
		double shopsell = 0.0;
		for (int i = 0; i < carts.size(); i++) {
			System.out.print("\n------- Cart:" + (i + 1) + " --------\n");
			carts.get(i).showBills();
			System.out.print("\n------- Cart Total: " +carts.get(i).getTotalBill());
			shopsell+=carts.get(i).getTotalBill();
		}
		return shopsell;
	}
}
