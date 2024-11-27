class DemoFinal
{
	final public int x;

	public DemoFinal()
	{
		x=10;
	}
	public void in(int x)
	{
		//this.x=x;
	}
	public void show()
	{
		System.out.println("x: "+x);
	}
}
class MainFinal 
{
	public static void main(String[] args) 
	{
		DemoFinal ob =new DemoFinal();
		//ob.x=20;     Error due to x is declare as final it acts as constant so its value cannot be changed
		//ob.in(30);
		ob.show();
	}
}
