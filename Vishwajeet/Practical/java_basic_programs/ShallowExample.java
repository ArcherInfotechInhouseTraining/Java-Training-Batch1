import java.util.Arrays;
class Sample
{
	private int num;
	public Sample()
	{
		num=1;
	}
	public Sample(int num)
	{
		this.num=num;
	}
	public void set(int num)
	{
		this.num=num;
	}
	public void show()
	{
		System.out.println("value of num: "+num);
	}
}
class ShallowExample 
{
	public static void main(String[] args) 
	{
		//shallow copies
		Sample s1=new Sample();
		Sample s2=s1;
		s1.set(1000);
		s2.show();
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("-----------------------------------");
		// As the change in ob1 is reflected in ob2 these are shallow copies.

		//deep copies
		Sample s3=new Sample(100);
		Sample s4=new Sample(100);
		System.out.println("s3 equals s4: "+s3.equals(s4));
		System.out.println("-----------------------------------");

		//Lazy copies
		int []x={11,22,33,44,55};
		int []y={11,22,33,44,55};
		System.out.println("x equals y: "+Arrays.equals(x,y));
		System.out.println("-----------------------------------");

		y[2]=100;
		System.out.println("x equals y: "+Arrays.equals(x,y));
	}
}
