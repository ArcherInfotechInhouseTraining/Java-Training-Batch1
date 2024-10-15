class DemoAssignment
{
	public static void main(String args[])
	{
		int x=10;
		int y=x;
		int z=x+y;

		System.out.println("x: "+x+"\t y: "+y+"\t z: "+z);

		x+=100;
		y*=2;
		System.out.println("x: "+x+"\t y: "+y);
	}
}