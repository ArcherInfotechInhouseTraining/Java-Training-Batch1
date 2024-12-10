class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("In Init Block A");
	}
	A()
	{
		System.out.println("In Default constructor A");
		a2=11;
	}
	A(int p1)
	{
		System.out.println("In Para constructor A");
		a2=p1;
	}
	public void show()
	{
		System.out.println("A: a1: "+a1+" \t A: a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("In Init Block B");
	}
	B()
	{
		System.out.println("In Default constructor B");
		b2=22;
	}
	B(int p1,int p2)
	{
		super(p1);
		System.out.println("In Para constructor B");
		b2=p2;
	}
	public void show()
	{
		super.show();
		System.out.println("B: b1: "+b1+" \t B: b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("In Init Block C");
	}
	C()
	{
		System.out.println("In Default constructor C");
		c2=33;
	}
	C(int p1,int p2,int p3)
	{
		super(p1,p2);
		System.out.println("In Para constructor C");
		c2=p3;
	}
	public void show()
	{
		super.show();
		System.out.println("C: c1: "+c1+" \t C: c2: "+c2);
	}
}
class MainParaConInitInhVal1
{
	public static void main(String []args)
	{
		C ob1 =new C();
		ob1.show();

		C ob2 =new C(111,222,333);
		ob2.show();
	}
}

	
