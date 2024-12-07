class Base
{
	private int a;

	public Base()
	{
		System.out.println("In Default base cons");
		a=10;
	}
	public Base(int x)
	{
		System.out.println("In Para base cons");
		a=x;
	}
	public void showBase()
	{
		System.out.println("\n a: "+a);
	}
}
class ImdBase extends Base
{
	private int b;
	public ImdBase()
	{
		System.out.println("In Default ImdBase cons");
		b=20;
	}
	public ImdBase(int x,int y)
	{
		super(x);
		System.out.println("In Para ImdBase cons");
		b=y;
	}
	public void showImdBase()
	{
		showBase();
		System.out.println("\n b: "+b);
	}

}
class Derived extends ImdBase
{
	private int c;
	public Derived()
	{
		System.out.println("In Default Derived cons");
		c=30;
	}
	public Derived(int x,int y,int z)
	{
		super(x,y);
		System.out.println("In para derived cons");
		c=z;
	}
	public void showDerived()
	{
		showImdBase();
		System.out.println("\n c: "+c);
	}
}
class MainParaPassInh
{
	public static void main(String []args)
	{
		Derived d1=new Derived();
		d1.showDerived();

		Derived d2=new Derived(11,22,33);
		d2.showDerived();
	}
}