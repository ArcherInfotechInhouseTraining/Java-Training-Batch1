package shopsource;

import java.io.Serializable;

public class Bill implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	private int count;
	private double totalpricefornitems;
	private Item item;
	public Bill(Item item, int count) { 
		// TODO Auto-generated constructor stub
		this.id = item.getId();
		this.name = item.getName();
		this.price = item.getPrice();
		this.item = item;
		this.count = count;
        this.totalpricefornitems = calculateTotalPrice();

	}
	public Item getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
        this.totalpricefornitems = calculateTotalPrice();
    }
    private double calculateTotalPrice() {
        return this.price * this.count;
    }
    public double getTotalPriceForNItems() {
        return totalpricefornitems;
    }

	
	public void showBilledItem()
	{
		System.out.println("ID: "+id+"\t Name: "+name+"\t Price: "+price+"\t count: "+count+"\t Total Items Price: "+totalpricefornitems);
	}

}