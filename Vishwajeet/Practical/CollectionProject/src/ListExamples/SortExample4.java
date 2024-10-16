package ListExamples;
import java.util.*;

class Product1{
	private String nm;
	private int id;
	private double price;
	
	public Product1 (int id,String nm,double price) {
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
		return this.id - ((Product1)ob).id;
	}
}
public class SortExample4 {

	public static void main(String[] args) {
		List<Product1> products = new ArrayList<>();
		products.add(new Product1(11,"Mercedes",120000.00));
		products.add(new Product1(17,"BMW",15000.00));
		products.add(new Product1(21,"Audi",170000.00));
		products.add(new Product1(7,"Porsche",770000.00));
		
		System.out.println("Before Sorting: "+products);
		
		//products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		Collections.sort(products,(p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		System.out.println("After Sorting: "+products);	
		
		products.sort(new ProductIdComparator());
		System.out.println("After Sorting: "+products);	
		
	}

}


class ProductIdComparator implements Comparator<Product1> {
	public int compare(Product1 p1, Product p2) {
	return p1.compareTo(p2);
	}
		
	


	public int compare(Product1 o1, Product1 o2) {
		// TODO Auto-generated method stub
		return 0;
		
	}
	
	
}




