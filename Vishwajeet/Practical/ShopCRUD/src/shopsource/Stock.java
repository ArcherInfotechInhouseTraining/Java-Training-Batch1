package shopsource;

import java.io.Serializable;

class Stock implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private int itemId;
	    private int quantity;

	    public Stock(int itemId, int quantity) {
	        this.itemId = itemId;
	        this.quantity = quantity;
	    }

	    public int getItemId() {
	        return itemId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void addStock(int amount, int id) {
	        this.quantity += amount;
	    }

	    public void reduceStock(int amount) {
	        this.quantity -= amount;
	    }

	    
	    @Override
	    public String toString() {
	        return "Stock{" +
	                "itemId=" + itemId +
	                ", quantity=" + quantity +
	                '}';
	    }
}



