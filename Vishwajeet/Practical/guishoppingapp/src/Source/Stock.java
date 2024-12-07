package Source;

import java.io.Serializable;
import java.util.List;

import util.ListUtil;

/**
 * This class used to create an object which stores the stock.
 */
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;
	private int code;
	private int countinstock;
	public Stock(int code, int itemcount) {
		this.code = code;
		countinstock = itemcount;
	}
	public int getCode() {
		return code;
	}
	public int getCountinstock() {
		return countinstock;
	}
	public void setCountinstock(int countinstock) {
		this.countinstock = countinstock;
	}
	public void updateStock(int itemcount) {
		countinstock = countinstock + itemcount;
	}
	public void printStock(List<Item> items) {
		
		Item item = ListUtil.getItemByCode(items, code);
		String str = "Stock{" + "id=" + code + ", name='" + item.getName() + '\'' + ", Price='" + item.getPrice() + '\'' + '}'+" Stock: "+countinstock;
		System.out.println(str);
	}
}
