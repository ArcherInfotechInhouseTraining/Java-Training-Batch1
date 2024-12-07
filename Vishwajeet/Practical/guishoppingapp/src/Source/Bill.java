package Source;

import java.io.Serializable;

public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int count;
	private double totalpricefornitems;
	private Item item;
	public Bill(Item item, int count) { 
		this.item = item;
		this.id = item.getId();
		this.count = count;
		this.totalpricefornitems=item.getPrice()*this.count;
	}

	public int getId() {
		return id;
	}
	
	public int getCount() {
		return count;
	}

	public double getIndividuaTotal() {
		// TODO Auto-generated method stub
		return totalpricefornitems;
	}
	
	public void showBilledItem()
	{
		this.totalpricefornitems=item.getPrice()*this.count;
		System.out.println("ID: "+id+"\t Name: "+item.getName()+"\t Price: "+item.getPrice()+"\t count: "+count+"\t Total Items Price: "+totalpricefornitems);
	}

	public void setCount(int count) {
		this.count -= count;
		this.totalpricefornitems=item.getPrice()*this.count;
	}

}


