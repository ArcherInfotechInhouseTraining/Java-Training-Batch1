import java.util.*;
interface Sample
{
	void in();
	void out();
}
class Demo
{
	private int a;
	public Demo()
	{
		a=100;
	}
	public void show()
	{
		System.out.println("A: "+a);
	}
}
class Test extends Demo implements Sample
{
	private int x,y;
	public Test()
	{
		x=121;
		y=123;
	}

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public void out()
	{
		show();
		System.out.println("X: "+x+" \t Y: "+y);
	}

}
class MainInterfaceExample 
{
	public static void main(String[] args) 
	{
		Test ob = new Test();
		//ob.in();
		ob.out();
	}
}
