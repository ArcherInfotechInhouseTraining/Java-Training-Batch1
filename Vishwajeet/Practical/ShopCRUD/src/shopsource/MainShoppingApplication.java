package shopsource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FileUtil {
    private static final String FILE_NAME = "items.txt";
    private static final String CARTS_NAME = "carts.txt";
    private static final String STOCKS_NAME = "stocks.txt";


    public static void saveItems(List<Item> items) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(items);
        }
    }
    
    @SuppressWarnings("unchecked")
	public static List<Item> loadItems() throws IOException, ClassNotFoundException{
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Item>) ois.readObject();
        }
    }
    
    public static Item getItemByCode(List<Item> items, int code) {
		// TODO Auto-generated method stub
		for(Item i : items)
		{
			if(i.getId()==code)
				return i;
		}
		return null;
	}

    
    public static void writeCart(List<Cart> carts) throws IOException {
		// TODO Auto-generated method stub

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CARTS_NAME))) {
            oos.writeObject(carts);
        }
	}
    @SuppressWarnings("unchecked")
	public static List<Cart>  loadCarts() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(CARTS_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CARTS_NAME))) {
            return (List<Cart>) ois.readObject();
        }
	}

    public static void showBills(Cart c) {
		// TODO Auto-generated method stub
		c.showBills();
	}
    
    public static void saveStocks(List<Stock> stocks) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STOCKS_NAME))) {
            oos.writeObject(stocks);
        }
    }

    @SuppressWarnings("unchecked")
	public static List<Stock> loadStocks() throws IOException, ClassNotFoundException {
        File file = new File(STOCKS_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STOCKS_NAME))) {
            return (List<Stock>) ois.readObject();
        }
    }

    public static Stock getStockByItemId(List<Stock> stocks, int itemId) {
        for (Stock stock : stocks) {
            if (stock.getItemId() == itemId) {
                return stock;
            }
        }
        return null;
    }
}

                                                                                                                   
public class MainShoppingApplication {

	public static void main(String[] args) {
			try {
		            List<Item> items = FileUtil.loadItems();
		            List<Cart> carts = FileUtil.loadCarts();
		            List<Stock> stocks = FileUtil.loadStocks();
		            Scanner scanner = new Scanner(System.in);
		            boolean running = true;
		            while (running) {
		                System.out.println("Choose an operation: create, read, update, delete, Stock,  sell, allcarts, shopsell, exit");
		                String operation = scanner.nextLine();

		                switch (operation.toLowerCase()) {
		                    case "create":
		                        Create.createItem(scanner, items, stocks);
		                        break;
		                    case "read":
		                        Read.readItems(items);
		                        Read.readStocks(stocks);
		                        break;
		                    case "update":
		                        Update.updateItem(scanner, items);
		                        break;
		                    case "delete":
		                       Delete.deleteItem(scanner, items);
		                       Delete.deleteStock(scanner, stocks);
		                        break;
		                    case "stock":
		                        manageStock(scanner, stocks);
		                        break;
		                    case "sell":
		                    	sellItem(scanner, items, carts, stocks);
							FileUtil.writeCart(carts);
		                    	break;
		                    case "allcarts":
		                    	List<Cart> list = FileUtil.loadCarts();
		                    	for(int i=0;i<list.size();i++) {
		                    		System.out.println("\n----------------------Cart:"+(i+1)+"------------------\n");
		                    		FileUtil.showBills(list.get(i));
		                    		//list.get(i).showBills(i + 1);
		                    	}
		                    	break;
		                    case "shopsell":
		                    	List<Cart> allcarts = FileUtil.loadCarts();
		                    	double shopsell=0.0;
		                    	for(int i=0;i<allcarts.size();i++) {
		                    		
		                    		shopsell=shopsell+allcarts.get(i).calculateTotal();             		
		                    	}
		                    	System.out.println("Total shop sell :  "+shopsell);
		                    	break;
		                    case "exit":
		                        running = false;
		                        break;
		                    default:
		                        System.out.println("Invalid operation");
		                }
		                FileUtil.saveItems(items);
		                FileUtil.saveStocks(stocks);
		            }
		        } catch (IOException | ClassNotFoundException e) {
		            System.err.println("Error: " + e.getMessage());
		        }
			
		    }
	 private static void manageStock(Scanner scanner, List<Stock> stocks) {
	        System.out.println("Enter item id to manage stock:");
	        int itemId = Integer.parseInt(scanner.nextLine());
	        Stock stock = FileUtil.getStockByItemId(stocks, itemId);
	        if (stock != null) {
	            System.out.println("Enter stock amount to add:");
	            int amount = Integer.parseInt(scanner.nextLine());
	            stock.addStock(amount, amount);
	            System.out.println("Stock updated.");
	        } else {
	            System.out.println("Stock not found for item id " + itemId);
	        }
	    }

	 private static void sellItem(Scanner scanner, List<Item> items, List<Cart> carts, List<Stock> stocks) {
	        Cart cart = new Cart();
	        String choice;
	        int code, count;
	        do {
	            System.out.println("Enter item code:");
	            code = Integer.parseInt(scanner.nextLine());
	            System.out.println("Enter item count:");
	            count = Integer.parseInt(scanner.nextLine());

	            Item item = FileUtil.getItemByCode(items, code);
	            Stock stock = FileUtil.getStockByItemId(stocks, code);
	            if (item != null && stock != null) {
	                if (stock.getQuantity() >= count) {
	                    stock.reduceStock(count);
	                    Bill bill = new Bill(FileUtil.getItemByCode(items,code),count);
	                    cart.addItem(bill);
	                } else {
	                    System.out.println("Insufficient stock for item: " + item.getName()+" Stock "+stock.getQuantity()+" items available Do you want to Buy?");
	                    String sellAvailable = scanner.nextLine();
	                    if(sellAvailable.equals("yes")) {
	                    	int availableCount = stock.getQuantity();
	                    	stock.reduceStock(availableCount);
	                    	Bill bill = new Bill(item, availableCount);
	                    	cart.addItem(bill);
	                    }
	                }
	            } else {
	                System.out.println("Item or stock not found.");
	            }

	            System.out.println("Add more items to cart? (yes/no):");
	            choice = scanner.nextLine();
	        } while (choice.equals("yes"));
	        
	        double total = cart.calculateTotal();
	        System.out.println("Total bill: " + total);
	        System.out.println("Enter available money:");
	        double money = Double.parseDouble(scanner.nextLine());

	        while (money < total) {
	            System.out.println("Not enough money. Remove an item from the cart.");
	            System.out.println("Enter item code to remove:");
	            code = Integer.parseInt(scanner.nextLine());
	            System.out.println("Enter item count to remove:");
	            count = Integer.parseInt(scanner.nextLine());

	            cart.removeItemByCode(code, count, stocks);

	            total = cart.calculateTotal();
	            System.out.println("New total bill: " + total);
	            System.out.println("Enter available money:");
	            money = Double.parseDouble(scanner.nextLine());
	        }

	        carts.add(cart);
	        System.out.println("Items added to cart and stock updated.");
	        
	    }
}





