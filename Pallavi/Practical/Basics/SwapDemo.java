
class MyNumber
{
	int x;
	int y;

	public MyNumber(int x,int y)
	{
		this.x = x;
		this.y = y;
	}

/*	public void setNumber(int x,int y)
	{
		this.x = x;
		this.y = y;
	}*/

	public void show()
	{
		System.out.println("x: "+x+"\t y: "+y);
	}
	public void swap(MyNumber tmp)
	{
		int t = tmp.x;
		tmp.x = tmp.y;
		tmp.y = t;
	}
}
class SwapDemo 
{
	public static void main(String[] args) 
	{
		MyNumber ob = new MyNumber(5,10);
		//MyNumber ob1 = new MyNumber();

		//ob.setNumber(5,10);

		ob.show();
		
		//ob1.swap(ob);
		//ob.show();

		ob.swap(ob);
		ob.show();


	}
}
