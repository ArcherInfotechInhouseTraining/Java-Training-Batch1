interface A
{
	int x=10;
	void out();
}
class B implements A
{
	public void out()
	{
		System.out.println(x);
	}
}
class MainClassInterface 
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.out();

		System.out.println(A.x);
	}
}
