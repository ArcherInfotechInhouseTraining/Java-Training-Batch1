class Demo
{
	private int a;
	{
		a=100;
	}
	public void Print()
	{
		System.out.println("a = "+a);
	}
}

class ABC
{
	private int b;
	{
		b=200;
	}
	public void print()
	{
		System.out.println("b = "+b);
	}
}

class MainObjectClass 
{
	public static void main(String[] args) 
	{
		Demo ob1 = new Demo();
		System.out.println("class name: "+ob1.getClass());
		System.out.println("HashCode: "+ob1.hashCode());

		ABC ob2 = new ABC();
		ABC ob3=ob2;
		System.out.println("class name: "+ob2.getClass());
		System.out.println("HashCode: "+ob2.hashCode());
		System.out.println("HashCode of ob3: "+ob3.hashCode());

		System.out.println("HashCode: "+ob2.equals(ob3));
	}
}