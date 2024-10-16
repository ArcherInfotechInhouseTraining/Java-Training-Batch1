package source;

import java.io.Serializable;

/**
 * The class used to represent the main entity Item from the application
 * This class includes an item's Id, name and price and it can be serialized 
 */
public class Item implements Serializable {
	/**
	 * Unique identifier for the version of this class, used during the de-serialization of the process
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The unique identifier for an item
	 */
	private int id;
	
	/**
	 * The name of the item
	 */
	private String name;
	
	/**
	 * The price of the item
	 */
	private double price;

	/**
	 * Constructor to create new item
	 * @param id - The unique identifier for an item
	 * @param name - The name of the item
	 * @param price - The price of the item
	 */
	
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	/**
	 * Get Id of an item
	 * @return The unique identifier of an item
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get price of an item
	 * @return The price of an item
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Get the name of an item
	 * @return The name of an item
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the new price of an item for the updation 
	 * @param price the new price for the item
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Set a new name for an item
	 * @param name The new name set for an item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get a string representation for an item
	 * @return A String that contains Id, Name and price for the item
	 */
	@Override
	public String toString() {
		return "Item{" + "id=" + id + ", name='" + name + '\'' + ", Price='" + price + '\'' + '}';
	}
}