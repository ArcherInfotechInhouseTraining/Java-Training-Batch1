package shopsource;

import java.util.List;

public class Read {
	 public static void readItems(List<Item> items) {
		 System.out.println("\n--------------Item----------------------");
	        if (items.isEmpty()) {
	            System.out.println("No items found.");
	        } else {
	            for (Item item : items) {
	                System.out.println(item);
	            }
	        }
	    }
	 
	 public static void readStocks(List<Stock> stocks) {
		 System.out.println("\n--------------Stocks----------------------");
	        if (stocks.isEmpty()) {
	            System.out.println("No Stocks found.");
	        } else {
	            for (Stock stock : stocks) {
	                System.out.println(stock);
	            }
	        }
	    }


}
