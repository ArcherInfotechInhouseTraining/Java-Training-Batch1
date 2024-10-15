package Comparable;

//Trying to use compareTo() for same - analyze the change

class Iteams implements Comparable
{
	String name;
	double price;
	int id;
	
	public Iteams(String name,double price,int id)
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
		return id+" "+name+" "+" Rs."+price;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class SortProductExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
