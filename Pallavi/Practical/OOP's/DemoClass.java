
/*
class DemoClass
{
	private int x;
	private double y;
	public static void main(String []args)
	{
		DemoClass ob=new DemoClass();
		ob.x=10;	// As a main() is a method from same class, it will able to access
		ob.y=33.25;	// method, directly using the . operator.
		System.out.println("\n x="+ob.x+"\t y="+ob.y);
	}
} 

*/


class DemoClassQ
{
	public static void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
}
class DemoClass
{
	/*public static void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}*/
	public static void main(String []args)
	{
		System.out.println("Hello...!! Welcome to OOP's in Java");
		
		showMessage();
		DemoClassQ.showMessage();
	}
}  
