class Number 
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv()
	{
		return x/y;
	}
}
class MainNumberExample
{
	public static void main(String []args)
	{
		Number ob = new Number();
		ob.setx(10);
		ob.sety(0);
		//ob.sety(5);

		System.out.println("Division is: "+ob.getDiv());
	}
}