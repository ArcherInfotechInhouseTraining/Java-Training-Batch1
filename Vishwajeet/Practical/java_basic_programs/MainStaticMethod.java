interface Shape
{
	double area();

	static double calculateRectArea(double length, double width)
	{
		return length * width;
	}

}
class Rect implements Shape
{
	private double length;
	private double width;

	public Rect(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double area()
	{
		return length * width;
	}

}
class MainStaticMethod 
{
	public static void main(String[] args) 
	{
		Rect r = new Rect(4.0,5.0);
		double ans = r.area();
		System.out.println("Area of rectangle: "+ans);

		System.out.println("Area of rectangle: "+Shape.calculateRectArea(4.0,4.0));
	}
}
