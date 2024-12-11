class Base
{
	public int a;
	Base()
	{
		a=10;
	}
}
class Derived extends Base
{
	public int a;
	Derived()
	{
		a=100;
	}
	public void out()
	{
		System.out.println("\n In Base a="+super.a+" and Derived a="+a);
	}
}
class DemoInitBlockAndSuper_InstanceVariable
{
	public static void main(String []args)
	{
		Derived ob=new Derived();
		ob.out();
	}
}