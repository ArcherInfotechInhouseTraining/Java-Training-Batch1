abstract class Shape
{
	public abstract void doubleArea();
	
	// concrete method
	public void display()
	{
		System.out.println("In Shape area");
	}
}
class Rect extends Shape
{
	private double x;
	private double y;

	Rect( double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	//@override
	public void doubleArea()
	{
		double area = x*y;
		System.out.println("Area: "+area);
	}

}
class Circle extends Shape
{
	private double r;
	final private double pi=3.142;

	Circle(double r)
	{
		this.r=r;
	}
	//@override
	public void doubleArea()
	{
		double area = pi*r*r;
		System.out.println("Area: "+area);
	}

}

class MainPolymorphismArea 
{
	public static void main(String[] args) 
	{
		
		Rect rect = new Rect(2.0,4.0);
		rect.doubleArea();

		Circle circle = new Circle(4.0);
		circle.doubleArea();
	}
}
