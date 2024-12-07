class DemoObject 
{
	public void show()
	{
		System.out.println("In show()");
	}
}
class Anonymous
{
	public static void main(String []args)
	{
		new DemoObject().show();
	}
}
