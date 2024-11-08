//---------------using throws------------------

import java.io.IOException;
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

	public int getDiv() throws ArithmeticException,IOException
	{
		return (x/y);
	}
}

class MainNumberExample 
{
	public static void main(String[] args) throws IOException
	{
		Number ob = new Number();

		ob.setx(10);
		ob.sety(5);
		//ob.sety(0);
		System.out.println("Div is: "+ob.getDiv());
	}
}

/*

//------------- Using try catch-----------------------------
import java.io.IOException;
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
		return (x/y);
	}
}

class MainNumberExample 
{
	public static void main(String[] args) 
	{
		Number ob = new Number();

		ob.setx(10);
		//ob.sety(5);
		ob.sety(0);

		try
		{
			System.out.println("Div is: "+ob.getDiv());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}

*/