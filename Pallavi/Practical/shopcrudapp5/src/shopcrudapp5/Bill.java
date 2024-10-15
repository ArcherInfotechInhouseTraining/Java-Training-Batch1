package shopcrudapp5;

import java.io.Serializable;

public class Bill implements Serializable {


	 private static final long serialVersionUID = 1L;
	 
	 private int code;
	 private String name;
	 private double price;
	 private int count;
	 private double totalpricefornitems;
	 
	 private static double total;
	 
	public Bill(Item item, int count) {
		
		this.code = item.getiCode();
		this.name = item.getName();
		this.price = item.getPrice();
		this.count = count;
		
		this.totalpricefornitems = this.count * this.price;

	}

	public void showBillItem() {
		
		System.out.println("Code: "+code+" \t Name: "+name+" \t Price: "+price+" \t count: "+count+" \t totalprice: "+totalpricefornitems);

	}
}
