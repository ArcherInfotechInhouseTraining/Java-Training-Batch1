package util;

import java.util.List;

import source.Bill;
import source.Cart;
import source.Item;
import source.Stock;

/**
 *  This class contains several methods used to process different lists of items, stocks, and carts.
 * These methods help in searching, updating, and displaying items and their stocks.
 */
public class ListUtil {
	
	/**
     * Default constructor for the ListUtil class.
     * This constructor is intentionally left empty as this class only contains static utility methods.
     */
    public ListUtil() {
        // No initialization required
    }
    
	/**
	 * Search for an item with the given code in the list of items.
	 * 
	 * @param code - This is item code to be searched
	 * @param items - this is list where you have to search the item
	 * @return true if the item with the given code is found, otherwise false.
	 */
	public static boolean containsCode(int code, List<Item> items) {
		for(Item i : items) {
			if(i.getId()==code)
				return true;
		}
		return false;
	}

	/**
     * Add a new stock entry or update the stock count if the item already exists.
     *
     * @param code - This is the item code.
     * @param itemcount - This is the count of items to add to the stock.
     * @param stocks - This is the list of stock items.
     */
	public static void addOrUpdateStock(int code, int itemcount, List<Stock> stocks) {

		/**
		 *  if stock list is empty
		 */
		if(stocks.isEmpty()) {
			stocks.add(new Stock(code, itemcount));
			return;
		}
		
		/**
		 *  if stock having entry, the add/increase stock of item having same code
		 */
		boolean flg = false;
		for(Stock s : stocks) {
			if(s.getCode()==code) {
				s.updateStock(itemcount);
				flg=true;
			}
		}
		
		/**
		 *  if stock don't have entry, adding the stock of code  first time
		 */
		if(!flg) {
			stocks.add(new Stock(code, itemcount));
		}
			
	}
	
	/**
     * Get an item by its code from the list of items.
     *
     * @param items - This is the list of items.
     * @param code - This is the item code to search for.
     * @return The item with the given code, or null if not found.
     */
	public static Item getItemByCode(List<Item> items, int code) {
		for (Item i : items) {
			if (i.getId() == code)
				return i;
		}
		return null;
	}

	/**
     * Check if an item with the given code is in stock with at least the given count.
     *
     * @param code - This is the item code.
     * @param count - This is the required count of items in stock.
     * @param stocks - This is the list of stock items.
     * @return true if the item with the given code is in stock with at least the required count, false otherwise.
     */
	public static boolean isInStock(int code, int count, List<Stock> stocks) {

		for(Stock s : stocks) {
			if(s.getCode()==code && s.getCountinstock()>=count) {
				return true;				
			}
		}
		return false;
	}

	
	/**
     * Show the details of the items in the cart.
     *
     * @param cart - This is the cart to display.
     */
	public static void showCart(Cart cart) {
		System.out.println("\n -----------------------------------------------------");
		cart.showBills();
	}

	
	/**
     * Update the stock based on the items in the cart.
     *
     * @param cart - This is the cart containing the items.
     * @param stocks - This is the list of stock items.
     */
	public static void UpdateStock(Cart cart, List<Stock> stocks) {

		List<Bill> bill = cart.getBilList();
		for(Bill b : bill) {
			decreaseStock(b.getId(), b.getCount(), stocks);
		}
		
	}

	/**
     * Decrease the stock count for an item with the given code.
     *
     * @param id - This is the item code.
     * @param count - This is the count to decrease from the stock.
     * @param stocks - This is the list of stock items.
     */
	private static void decreaseStock(int id, int count, List<Stock> stocks) {
		for (Stock s : stocks) {
			if(s.getCode() == id) {
				s.updateStock(-count);
			}
		}
	}

	
	/**
     * Show the details of all carts and calculate the total sales.
     *
     * @param carts - This is the list of carts.
     * @return The total sales amount.
     */

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
