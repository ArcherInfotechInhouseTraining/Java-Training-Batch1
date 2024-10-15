/// assigning values using init block and constructor

/*
class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{
		a2=11;
		System.out.println("Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}

class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Intit block B");
	}
	B()
	{
		b2=22;
		System.out.println("Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}

class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Intit block C");
	}
	C()
	{
		c2=33;
		System.out.println("Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}
class  MainConInitInhVal
{
	public static void main(String[] args) 
	{
		C ob=new C();
		ob.showC();
	}
}

*/

// Defining parameterized constructors in above program


class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{
		a2=11;
		System.out.println("Constructor A");
	}
	A(int p1)
	{
		a2=p1;
		System.out.println("Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}

class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Intit block B");
	}
	B()
	{
		b2=22;
		System.out.println("Constructor B");
	}
	B(int p1,int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}

class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Intit block C");
	}
	C()
	{
		c2=33;
		System.out.println("Constructor C");
	}

	C(int p1,int p2,int p3)
	{
		super(p1,p2);
		c2=p3;
		System.out.println("Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}
class  MainConInitInhVal
{
	public static void main(String[] args) 
	{
		C ob=new C();
		ob.showC();

		C ob1=new C(111,222,333);
		ob1.showC();
	}
}
