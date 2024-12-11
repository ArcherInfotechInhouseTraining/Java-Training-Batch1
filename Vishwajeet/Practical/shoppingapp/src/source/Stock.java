package source;

import java.io.Serializable;
import java.util.List;

import util.ListUtil;

/**
 * This class used to create an object which stores the stock information.
 * It includes the stock code and count of items in stock
 */
public class Stock implements Serializable {
	//Unique identifier for the version of this class, used during the deserialization process
	private static final long serialVersionUID = 1L;
	
	/**
	 *  The unique code for the stock item
	 */
	private int code;
	
	/**
	 * The number of items currently in stock
	 */
	private int countinstock;
	
	/**
	 * Constructor to create new Stock object
	 * @param code - The unique code for the stock item
	 * @param itemcount - The initial count of item in stock
	 */
	public Stock(int code, int itemcount) {
		this.code = code;
		countinstock = itemcount;
	}
	
	/**
	 * Get code of stock item
	 * @return The unique code for the stock item
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Get the current count of item in stock
	 * @return The number of items currently in stock
	 */
	public int getCountinstock() {
		return countinstock;
	}
	
	/**
	 * set new i.e update count of item in stock
	 * @param countinstock The new count of item in stock
	 */
	public void setCountinstock(int countinstock) {
		this.countinstock = countinstock;
	}
	
	/**
	 * Update the stock count by adding the specified number of items.
	 *
	 * @param itemcount The number of items to add to the stock count.
	 */
	public void updateStock(int itemcount) {
		countinstock = countinstock + itemcount;
	}
	
	/**
	 * Print the stock details including the item name, price, and the stock count.
	 *
	 * @param items The list of items to find the item by code.
	 */
	public void printStock(List<Item> items) {
		
		Item item = ListUtil.getItemByCode(items, code);
		String str = "Stock{" + "id=" + code + ", name='" + item.getName() + '\'' + ", Price='" + item.getPrice() + '\'' + '}'+" Stock: "+countinstock;
		System.out.println(str);
	}
}
