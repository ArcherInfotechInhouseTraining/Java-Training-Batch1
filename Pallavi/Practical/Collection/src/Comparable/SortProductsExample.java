package Comparable;

//Defining single own comparator

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product
{
	String name;
	double price;
	int id;
	
	public Product(String name,double price, int id)
	{
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" "+name+": Rs."+price;
	}
}
public class SortProductsExample {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop",80489,1));
		products.add(new Product("SmartPhone",20000,7));
		products.add(new Product("Tablet",50489,9));
		products.add(new Product("HeadPhone",2580,3));
		
		// Output the list before sorting
		System.out.println("Before Sort: "+products);
		
		 // Sort the list based on product price
		products.sort(new ProductPriceComparator());
		
		// Output the list before sorting
		System.out.println("Before Sort: "+products);
	}
}

class ProductPriceComparator implements Comparator<Product>
{
	public int compare(Product p1,Product p2)
	{
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}
