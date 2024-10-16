package ListExamples;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

class Product11{
	private String name;
	private double price;
	private int id;
	
	public Product11 (int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString() {
		return id+" - "+name+" "+"RS: "+price;
	}
	
}
public class SortProductsExample2 {

	public static void main(String[] args) {
		List<Product11> products = new ArrayList<>();
		products.add(new Product11(11,"Mercedes",120000.00));
		products.add(new Product11(17,"BMW",15000.00));
		products.add(new Product11(21,"Audi",170000.00));
		products.add(new Product11(7,"Porsche",770000.00));
		
		//before sorting
		System.out.println("Before sorting: "+products);
		
		products.sort(new ProductPriceComparator());
		
		System.out.println("After Price sorting: "+products);	
		
		products.sort(new IdComparator());
		
		System.out.println("After Id sorting: "+products);	

	}

}

class ProductPriceComparator implements Comparator <Product11>{
	public int compare(Product11 p1,Product11 p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}

class IdComparator implements Comparator <Product11>{
	public int compare(Product11 p1,Product11 p2) {
		return Integer.compare(p1.getId(),p2.getId());
	}
}