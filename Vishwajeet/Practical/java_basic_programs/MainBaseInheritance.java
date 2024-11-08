class Base
{
	private int a;

	Base()
	{
		System.out.println("Default constructor");
		a=10;
	}
	Base(int x)
	{
		System.out.println("Parameterized constructor");
		a=x;
	}
	public void showBase()
	{
		System.out.println("a= "+a);
	}
}
class ImdBase extends Base
{
	private int b;

	public ImdBase()
	{
		System.out.println("Default constructor Imd");
		b=20;
	}
	public ImdBase(int x, int y)
	{
		super(x);
		System.out.println("Para constructor Imd");
		b=y;
	}
	public void showImdBase()
	{
		showBase();
		System.out.println("b: "+b);
	}

}
class DerivedBase extends ImdBase
{
	private int c;

	public DerivedBase()
	{
		System.out.println("In defalut constructor");
		c=30;
	}
	public DerivedBase(int x, int y,int z)
	{
		super(x,y);
		System.out.println("In para Derived ");
		c=z;
	}
	public void showDerived()
	{
		showImdBase();
		System.out.println("c: "+c);
	}
}
class MainBaseInheritance 
{
	public static void main(String[] args) 
	{
		DerivedBase ob = new DerivedBase();
		ob.showDerived();

		DerivedBase ob2 = new DerivedBase(100,200,300);
		ob2.showDerived();
	}
}
