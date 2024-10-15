package Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product1
{
	String name;
	double price;
	int id;
	
	public Product1(String name,double price,int id)
	{
		this.name=name;
		this.price=price;
		this.id=id;
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
		return id+" "+name+" Rs.: "+price;
	}
}
public class SortProductsExample2 {

	public static void main(String[] args) {
		
		List<Product1> products = new ArrayList<>();
		products.add(new Product1("Laptop",80888,1));
		products.add(new Product1("HeadPhones",888,6));
		products.add(new Product1("Mobile",60999,2));
		products.add(new Product1("Tablet",3888,4));
		
		System.out.println("Before Sort: "+products);
		

        // Sort the list based on product price
		products.sort(new ProductpriceComparator1());
		System.out.println("After Sort(Based on price): "+products);
		
		// Sort the list based on product id
		products.sort(new ProductIdComparator());
		System.out.println("After Sort(Based on Id): "+products);

	}
}

class ProductpriceComparator1 implements Comparator<Product1>
{

	@Override
	public int compare(Product1 p1, Product1 p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPrice(), p2.getPrice());
	}	
}

class ProductIdComparator implements Comparator<Product1>
{

	@Override
	public int compare(Product1 p1, Product1 p2) {
		// TODO Auto-generated method stub
		return Integer.compare(p1.getId(), p2.getId());
	}
	
}
