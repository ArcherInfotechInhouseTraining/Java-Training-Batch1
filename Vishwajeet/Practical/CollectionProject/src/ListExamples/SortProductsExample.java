package ListExamples;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class Product {
	private String name;
	private double price;
	private int id;
	
	public Product (int id,String name,double price) {
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
public class SortProductsExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(11,"Mercedes",120000.00));
		products.add(new Product(17,"BMW",15000.00));
		products.add(new Product(21,"Audi",170000.00));
		products.add(new Product(7,"Porsche",770000.00));
		
		//before sorting
		System.out.println("Before sorting: "+products);
		
		products.sort(new PriceComparator());
		
		System.out.println("After sorting: "+products);	

	}

}

class PriceComparator implements Comparator <Product>{
	public int compare(Product p1,Product p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}
