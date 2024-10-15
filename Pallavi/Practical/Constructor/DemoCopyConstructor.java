//  copy constructor

class Demo
{
	private int x;
	private double y;
	public Demo() // default constructor
	{
		System.out.println("\n In default Constructor");
		x=1;
		y=2.5;
	}
	public Demo(int x) // parameterized constructor-1
	{
		System.out.println("\n In para -1 Constructor");
		this.x=x;
		this.y=x;
	}
	public Demo(int x,double y) // parameterized constructor-2
	{
		System.out.println("\n In para -2 Constructor");
		this.x=x;
		this.y=y;
	}
	public Demo(Demo t) //  copy constructor
	{
		System.out.println("\n In copy Constructor");
		this.x=t.x;
		this.y=t.y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoCopyConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo(); // will invoke default constructor
		ob1.showData();

		Demo ob2=new Demo(22); // will invoke para -1 constructor
		ob2.showData();

		Demo ob3=new Demo(132,11.244); // will invoke para -2 constructor
		ob3.showData();

		Demo ob4=new Demo(ob2); // will invoke copy constructor
		ob4.showData();

		Demo ob5=new Demo(ob3); // will invoke copy constructor
		ob5.showData();
	}
}