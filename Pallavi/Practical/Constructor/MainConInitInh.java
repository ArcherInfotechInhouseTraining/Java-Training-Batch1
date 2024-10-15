/// Using the constructors and initiliser blocks in inheritance

class A
{
	{
		System.out.println("Init block A");
	}
	A()
	{
		System.out.println("Constructor A");
	}
}

class B extends A
{
	{
		System.out.println("Intit block B");
	}
	B()
	{
		System.out.println("Constructor B");
	}
}

class C extends B
{
	{
		System.out.println("Intit block C");
	}
	C()
	{
		System.out.println("Constructor C");
	}
}
class  MainConInitInh
{
	public static void main(String[] args) 
	{
		C ob=new C();
	}
}
