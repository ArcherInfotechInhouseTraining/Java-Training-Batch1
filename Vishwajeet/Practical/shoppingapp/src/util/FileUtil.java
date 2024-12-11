package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import source.Cart;
import source.Item;
import source.Stock;

/**
 * The class FileUtil defined the different static methods used to perform the different operations on file.
 *  * This includes saving(writing) and loading(reading) lists of items, carts, and stock to and from files.
 */

public class FileUtil  {
	
	/**
     * Default constructor for the FileUtil class.
     * This constructor is intentionally left empty as this class only contains static utility methods.
     */
    public FileUtil() {
        /**
         *  No initialization required
         */
    }

	/**
	 *  name of the file where items are saved
	 */
	private static final String FILE_NAME = "items.txt";
	
	/**
	 *  name of the file where carts are saved
	 */
	private static final String CARTS_NAME = "carts.txt";
	
	/**
	 *  name of the file where stocks are saved
	 */
	private static final String stock_NAME = "stock.txt";
	
	
	/**
	 *  This method used to write the entire list of items to file
	 * @param items - this is ArrayList contains all newly created items
	 * @throws IOException - exception class
	 */
	public static void saveItems(List<Item> items) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(items);
		}
	}

	/**
	 * This method is used to load(read) the list of items from file.
	 * @return A list of item loaded from file. if a file does not exist it returns the empty list.
	 * @throws IOException - This Exception is thrown if an I/O Error occurs.
	 * @throws ClassNotFoundException - This Exception is thrown if the class of serialized object is not found.
	 */
	@SuppressWarnings("unchecked")
	public static List<Item> loadItems() throws IOException, ClassNotFoundException {
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			/**
			 *  if the file is not exist then return the empty list
			 */
			return new ArrayList<>();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			return (List<Item>) ois.readObject();
		}
	}
	
	/**
	 * This method is used to write entire list of carts to the file of carts.txt.
	 * @param carts -This is the list of all carts .
	 * @throws IOException - This Exception is thrown if an I/O Error occurs.
	 */
	public static void saveCarts(List<Cart> carts) throws IOException {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CARTS_NAME))) {
			oos.writeObject(carts);
		}
	}
	
	/**
	 * This method is used to load the list of carts from a file.
	 * @return A list of carts loaded from the file. If the file does not exist, it returns an empty list.
	 * @throws IOException - This exception is thrown if an I/O error occurs.
	 * @throws ClassNotFoundException - This exception is thrown if the class of a serialized object cannot be found.
	 */
	@SuppressWarnings("unchecked")
	public static List<Cart> loadCarts() throws IOException, ClassNotFoundException {
		File file = new File(CARTS_NAME);
		if (!file.exists()) {
			return new ArrayList<>();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CARTS_NAME))) {
			return (List<Cart>) ois.readObject();
		}
	}
	
	/**
	 * This method is used to write the entire list of stock to a file.
	 *
	 * @param stock - This is a list containing all stock items.
	 * @throws IOException - This exception is thrown if an I/O error occurs.
	 */
	public static void saveStock(List<Stock> stock) throws IOException {
		// TODO Auto-generated method stub

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(stock_NAME))) {
			oos.writeObject(stock);
		}
	}

	
	/**
	 * This method is used to load the list of stock from a file.
	 *
	 * @return A list of stock items loaded from the file. If the file does not exist, it returns an empty list.
	 * @throws IOException - This exception is thrown if an I/O error occurs.
	 * @throws ClassNotFoundException - This exception is thrown if the class of a serialized object cannot be found.
	 */
	@SuppressWarnings("unchecked")
	public static List<Stock> loadStock() throws IOException, ClassNotFoundException {
		File file = new File(stock_NAME);
		if (!file.exists()) {
			return new ArrayList<>();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(stock_NAME))) {
			return (List<Stock>) ois.readObject();
		}
	}	
}

