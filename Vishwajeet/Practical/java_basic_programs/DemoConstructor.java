class Demo
{
	private int x;
	private double y;

	public Demo() //Default Constructor
	{
		System.out.println("In Default Constructor");
		x=1;
		y=1.2;
	}
	public Demo(int x) //Parameterized constructor
	{
		this.x=x;
		this.y=x;
	}
	public Demo(int x,double y) //parameterized constructor
	{
		this.x=x;
		this.y=y;
	}
	public Demo(Demo t) //copy constructor
	{
		this.x=t.x;
		this.y=t.y;
	}
	public void showData()
	{
		System.out.println("\n x: "+x+"\t y: "+y);
	}
}
class DemoConstructor
{
	public static void main(String []args)
	{
		Demo ob1 =new Demo();
		ob1.showData();

		Demo ob2 = new Demo(22);
		ob2.showData();

		Demo ob3= new Demo(11,11.22);
		ob3.showData();

		Demo ob4 = new Demo(ob2);
		ob4.showData();

		Demo ob5= new Demo(ob3);
		ob4.showData();
	}
}







