class DemoRelational
{
	public static void main(String arg[])
	{
		int x=2,y=8;
		boolean b;

		System.out.println("x: "+x+" \t y: "+y);
		
		b=x>y;
		System.out.println("(x>y)"+b);
		
		b=x==y;
		System.out.println("(x==y)"+b);
		
		b=x<10;
		System.out.println("(x<10)"+b);
	}
}