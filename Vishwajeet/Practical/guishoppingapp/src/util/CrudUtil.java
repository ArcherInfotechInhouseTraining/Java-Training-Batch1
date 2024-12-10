package util;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import Source.Item;
import Source.Stock;

public class CrudUtil {
	public static void readStock(DefaultTableModel model1, List<Stock> stocks, List<Item> items) {
		if (stocks.isEmpty()) {
			System.out.println("No stock found.");
		} else {
			model1.setNumRows(0);
			for (Stock s : stocks) {
				model1.addRow(new Object[] { s.getCode(), ListUtil.getItemByCode(items, s.getCode()).getName(),
						s.getCountinstock() });
			}
		}
	}

	/**
	 * This method will update the current item stock.
	 * 
	 * @param scanner - input stream
	 * @param stock   - list used to hold the item stock
	 * @param items   - list of items
	 */
	public static void addStock(int code, int count, List<Stock> stocks, List<Item> items) {
		if (!ListUtil.containsCode(code, items)) {
			System.out.println("Invalid Item Code..!! Try another code");
			return;
		}
		ListUtil.addOrUpdateStock(code, count, stocks);
		System.out.println("Stock Added Sucessfully....!!!");
	}



	/**
	 * This is the method used to create the new Items
	 * 
	 * @param items
	 * @param model1
	 * @param item
	 * 
	 * @param scanner - default input stream
	 * @param items   - ArrayList used to store newly created items, which will be
	 *                written in the items.txt at ast
	 */
	public static void createItem(DefaultTableModel model1, Item item, List<Item> items) {
		items.add(item);
		CrudUtil.readItems(model1, items);
	}

	/**
	 * This method used to update the name and price of an Item
	 * 
	 * @param items
	 * @param item2
	 */
	public static void updateItem(Item item, List<Item> items) {
		System.out.println("Enter item id to update:");
		for (Item i : items) {
			if (item.getId() == i.getId()) {

				i.setName(item.getName());
				i.setPrice(item.getPrice());
				return;
			}
		}
		System.out.println("Item not found.");
	}

	/**
	 * Used to delete the item from the item list
	 * 
	 * @param id2   - input stream
	 * @param items - List of items
	 */
	public static void deleteItem(int id, List<Item> items) {

		items.removeIf(item -> item.getId() == id);
		System.out.println("Item deleted.");
	}

	/**
	 * this will reads all the items from the file
	 * 
	 * @param items : list of Items
	 */

	public static void readItems(DefaultTableModel model1, List<Item> items) {
		// TODO Auto-generated method stub
		model1.setNumRows(0);
		for (Item item : items) {
			model1.addRow(new Object[] { item.getId(), item.getName(), item.getPrice() });
		}
	}
}
