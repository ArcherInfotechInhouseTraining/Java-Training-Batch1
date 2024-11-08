import java.util.Arrays;

class Sample
{
	int num;

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
		System.out.println("Num is: "+num);
	}

}
class ShallowExample 
{
	public static void main(String[] args) 
	{
		//shallowCopy

		Sample ob = new Sample();
		Sample ob1 = ob;

		System.out.println("ob equals ob1: "+ob.equals(ob1));
		ob.show();
		ob1.show();
		System.out.println("------------------------------------------");

		//deepCopy
		Sample s1 = new Sample(100);
		Sample s2 = new Sample(100);
		System.out.println("s1 equals s2: "+s1.equals(s2));
		s1.set(45);
		s1.show();
		s2.show();
		System.out.println("------------------------------------------");
	
		//Lazy Copy
		int x[]={11,22,33,44,55};
		int y[]={11,22,33,44,55};
		System.out.println("Array x: "+Arrays.toString(x));
		System.out.println("Array y: "+Arrays.toString(y));
		System.out.println("x equals y: "+Arrays.equals(x,y));

		y[2]=90;
		
		System.out.println("Array x: "+Arrays.toString(x));
		System.out.println("Array y: "+Arrays.toString(y));
		System.out.println("x equals y: "+Arrays.equals(x,y));

	}
}
