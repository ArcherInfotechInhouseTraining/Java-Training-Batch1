package source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Cart class represents a shopping cart that contains a list of bills.
 * It provides methods to add items, show bills, get the total bill amount, 
 * remove items, and retrieve the list of bills.
 */

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 /**
	  *  List to store the bills in the cart
	  */
		List <Bill> bill = new ArrayList<Bill>(); 
		
		/**
	     * Default constructor for the Cart class.
	     * Initializes an empty list of bills.
	     */
	    public Cart() {
	        this.bill = new ArrayList<>();
	    }
	
	/**
     * Add a bill to the cart
     *
     * @param bill - The bill to be added to the cart.
     */
	public void addItem(Bill bill) {
		// TODO Auto-generated method stub
		this.bill.add(bill);
	}
	
	/**
     * Show the details of all the bills in the cart.
     */
	public void showBills() {
		for(int i=0;i<bill.size();i++)
		{
			bill.get(i).showBilledItem();
		}
	}
	
	/**
     * Get the total amount of all the bills in the cart.
     *
     * @return The total bill amount.
     */
	public double getTotalBill() {
		double tot = 0.0;
		for(Bill b : bill) {
			tot = tot + b.getIndividuaTotal();
		}
		return tot;
	}
	
	/**
     * Remove an item from the cart by reducing the count of the specified item.
     *
     * @param code - The code of the item to be removed.
     * @param count - The count to be reduced.
     */
	public void remove(int code, int count) {
		for(int i=0 ; i<bill.size();i++)
		{
			if(bill.get(i).getId()==code) {
				bill.get(i).setCount(count);
			}
		}
	}
	
	/**
     * Get the list of bills in the cart.
     *
     * @return The list of bills.
     */
	public List<Bill> getBilList() {
		return bill;
	}
}

