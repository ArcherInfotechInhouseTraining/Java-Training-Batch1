package shopcrudapp7;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill implements Serializable {


	private static final long serialVersionUID = 1L;
	 
	 private int code;
	 private String name;
	 private double price;
	 private int count;
	 private double totalpricefornitems;
	 
	 private static double total;
	 
	 static List<Bill> bill = new ArrayList<>();
	 
	 
	public Bill(Item item, int count) {
		
		this.code = item.getiCode();
		this.price = item.getPrice();
		this.count = count;
		this.name = item.getName();
		this.totalpricefornitems = this.count * this.price;
		
	}

	public Bill(int code, int count, double price) {
		this.code = code;
		this.count = count;
		this.price = price;
		this.totalpricefornitems = this.count * this.price;
		
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		totalpricefornitems = price * count;
	} 

	public void showBillItem() {
		System.out.println("Code: "+code+" \t Name: "+name+" \t Price: "+price+" \t count: "+count+" \t totalprice: "+totalpricefornitems);

	}

	@Override
	public String toString() {
		return "Bill [code=" + code + ", count=" + count + ", totalpricefornitems=" + totalpricefornitems + "]";
	}

	public static void showBill(Scanner sc, List<Cart> carts) throws ClassNotFoundException, IOException {
		
		 boolean running =  true;
		 List<StockItem> stock = StockFileUtil.loadStock();
		 List<Cart> cart = FileUtil.loadCarts();
		 
		 do
		 {
			 total = 0;
			 for(Bill i : bill)
			 {
				 System.out.println(i);
				 total = i.totalpricefornitems + total ;
			 }
			 
			 System.out.println("Total bill: "+total);
		
			 System.out.println("Please enter your option: ");
			 System.out.println("1.Proceed To Pay \t\t 2.Not Able To Pay");
			 int opt = Integer.parseInt(sc.nextLine());
		
			 if(opt == 1)
			 {
				 System.out.println("Thank you for visiting us.....!!!");
				 StockFileUtil.saveStock(stock);
				 
				 running = false;
			
			 }
			 else
			 {
				System.out.println("What you want to do: ");
				System.out.println("1.Delete Item \t\t 2.Reduce Count");
				int ch = Integer.parseInt(sc.nextLine());
				if(ch==1)
				{
					for(int i=0 ; i<bill.size() ; i++)
					{
						System.out.println("Enter item code: ");
						int code1 = Integer.parseInt(sc.nextLine());
						if(bill.get(i).getCode() == code1)
						{
							for(int j=0 ; j<stock.size() ; j++)
							{
								if(stock.get(j).getCode() == code1)
								{
									stock.get(j).setCount(stock.get(j).getCount()+bill.get(j).getCount());
									bill.remove(i);
								}
							}
						}
					}
				}
				else
				{
					System.out.println("Enter item code: ");
					int code2 = Integer.parseInt(sc.nextLine());
					for(Bill i : bill)
					{
						if(i.getCode() == code2)
						{
							for(StockItem j : stock)
							{
								if(j.getCode() == code2)
								{
									System.out.println("Enter the item count that you want to reduce: ");
									int count1 = Integer.parseInt(sc.nextLine());
										
									j.setCount(j.getCount() + count1 );
									count1 = i.getCount() - count1;
									i.setCount(count1);
								}
							}
								
						}
					}
				}
			}
		}while(running);
	}

	public static void addtoBill(int code, int count, double price) {
		bill.add(new Bill(code, count, price));		
	}
}
