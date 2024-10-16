class Demo
{
	private int x;
	public void in(final int t)
	{
		t=12; // final parameter t may not be assigned t=12;
		x=t;
	}
	public void out()
	{
		System.out.println("x: "+x);
	}
}
class MainFinalParameter 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.in(100);
		ob.out();
	}
}
