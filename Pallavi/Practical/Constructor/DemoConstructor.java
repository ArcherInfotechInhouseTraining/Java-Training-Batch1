// default constructor

class Demo
{
	private int x;
	private double y;
	public Demo() // default constructor
	{
		System.out.println("\n In Constructor");
		x=1;
		y=2.5;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo();
		ob1.showData();

		Demo ob2=new Demo();
		ob2.showData();

		Demo ob3=new Demo();
		ob3.showData();

		Demo ob4=new Demo();
		ob4.showData();
	}
}
