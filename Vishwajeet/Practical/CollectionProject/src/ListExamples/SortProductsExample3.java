package ListExamples;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class Product2{
	private String nm;
	private int id;
	private double price;
	
	public Product2 (int id,String nm,double price) {
		this.id=id;
		this.nm=nm;
		this.price=price;
	}
	
	public String getNm() {
		return nm;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString () {
		return id+" - "+nm+" RS: "+price;
	}
	
	public int compareTo(Object ob) {
		return this.id - ((Product2)ob).id;
	}
}
public class SortProductsExample3 {

	public static void main(String[] args) {
		List<Product2> products = new ArrayList<>();
		products.add(new Product2(11,"Mercedes",120000.00));
		products.add(new Product2(17,"BMW",15000.00));
		products.add(new Product2(21,"Audi",170000.00));
		products.add(new Product2(7,"Porsche",770000.00));
		
		System.out.println("Before Sorting: "+products);
		
		products.sort(new ProductPriceComparator1());
		
		System.out.println("After Sorting: "+products);	
		
		products.sort(new ProductIdComparator1());
		System.out.println("After Sorting: "+products);	
		
	}

}
class ProductPriceComparator1 implements Comparator<Product2>{
	public int compare(Product2 p1,Product2 p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}

class ProductIdComparator1 implements Comparator<Product2> {
	public int compare(Product2 p1, Product2 p2) {
	return p1.compareTo(p2);
	}
		
	


	public int compare(Product1 o1, Product1 o2) {
		// TODO Auto-generated method stub
		return 0;
		
	}
	
	
}




