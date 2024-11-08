class A implements Cloneable
{
	private int data;
	public A()
	{
		data = 100;
	}
	public void setA(int data)
	{
		this.data = data;
	}
	public int getA()
	{
		return data;
	}
	public Object getClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class DemoClone 
{
	public static void main(String[] args) 
	{
		try
		{
			A ob = new A();
			A ob1 = (A)ob.getClone();
			
			System.out.println("Value of ob: "+ob.getA());
			System.out.println("Value of ob1: "+ob1.getA());

			System.out.println("ob equals ob1: "+ob.equals(ob1));

			A ob2 = ob;
			System.out.println("ob equals ob2: "+ob.equals(ob2));

			ob2.setA(1500);
			System.out.println("value of ob2: "+ob2.getA());
			System.out.println("Value of ob: "+ob.getA());

			System.out.println("HashCode of ob: "+ob);
			System.out.println("HashCode of ob1: "+ob1);
			System.out.println("HashCode of ob2: "+ob2);
			
		}
		catch (Exception e)
		{
		}

	}
}
