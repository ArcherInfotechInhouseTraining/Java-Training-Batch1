// parameterized constructor

class Demo
{
	private int x;
	private double y;
	
	{
		System.out.println("\n In init block");
	}	
	public Demo(int x,double y) // parameterized constructor
	{
		System.out.println("\n In Constructor");
		this.x=x;
		this.y=y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoParaConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo(11,1.11);
		ob1.showData();

		Demo ob2=new Demo(22,2.22);
		ob2.showData();
	}
}

