package source;

import java.io.Serializable;

/**
 * The Bill class represents a bill for a particular item.
 * It stores details such as item ID, count, total price for the items, and the item itself.
 * This class provides methods to get item details, calculate the total price, display the bill, and update the item count.
 */
public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *  The unique ID of the item in the bill
     */
    private int id;

    /**
     *  The number of items in the bill+9++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     */
    private int count;

    /**
     *  The total price for the number of items in the bill
     */
    private double totalpricefornitems;

    /**
     *  The item object associated with the bill
     */
    private Item item;

    /**
     * Constructor to create a new bill for an item with a specified count.
     *
     * @param item - The item for which the bill is created.
     * @param count - The number of items in the bill.
     */
    public Bill(Item item, int count) { 
        this.item = item;
        this.id = item.getId();
        this.count = count;
        this.totalpricefornitems = item.getPrice() * this.count;
    }

    /**
     * Get the unique ID of the item.
     *
     * @return The ID of the item.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Get the number of items in the bill.
     *
     * @return The count of items.
     */
    public int getCount() {
        return count;
    }

    /**
     * Get the total price for the number of items in the bill.
     *
     * @return The total price for the items.
     */
    public double getIndividuaTotal() {
        return totalpricefornitems;
    }
    
    /**
     * Display the details of the billed item, including ID, name, price, count, and total price.
     */
    public void showBilledItem() {
        this.totalpricefornitems = item.getPrice() * this.count;
        System.out.println("ID: " + id + "\t Name: " + item.getName() + "\t Price: " + item.getPrice() + "\t Count: " + count + "\t Total Items Price: " + totalpricefornitems);
    }

    /**
     * Update the count of items in the bill and recalculate the total price.
     *
     * @param count - The new count to update in the bill.
     */
    public void setCount(int count) {
        this.count -= count;
        this.totalpricefornitems = item.getPrice() * this.count;
    }
}
