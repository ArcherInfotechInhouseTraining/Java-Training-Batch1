package shopcrudapp6;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Stock implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	
    private int code;
    private int count;
    private String name;
    private double price;
    
	public Stock(int code, String name, double price, int count) {
		
		this.code = code;
		this.name = name;
		this.price = price;
		this.count = count;
		
	}

	
	public int getCount() {
		
		return count;
	}

	public int getCode() {
		return code;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stock {code=" + code + ", count=" + count + ", name=" + name + ", price=" + price + "}";
	}

	static void stockList(List<Stock> stock)
	{
		if(stock.isEmpty())
		{
			System.out.println("Stock is empty.");
		}
		else
		{
			for(Stock i : stock)
			{
				System.out.println(i);
			}
		}
		
	}
//
//	public static void addtoStock(List<Item> items) {
//	
//		
//	}

}
