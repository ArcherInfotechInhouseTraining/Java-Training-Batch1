 abstract class Shape
{
	public abstract void area();
}
class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("In Rectangle area");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area");
	}
}
class Parabolla extends Shape
{
	public void area()
	{
		System.out.println("In Parabolla area");
	}
}
class PolymorphismArea 
{
	public static void main(String[] args) 
	{
		Shape ref;

		ref = new Rectangle();
		ref.area();

		ref = new Circle();
		ref.area();

		ref = new Triangle();
		ref.area();

		ref = new Parabolla();
		ref.area();
	}
}
