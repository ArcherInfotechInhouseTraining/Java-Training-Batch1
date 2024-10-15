
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);

			try
			{
				Thread.sleep(200);
			}
			catch (Exception e)
			{
			}
		}
	}
}


class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hii: "+i);

			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}
		}
	}
}

class MainConProgClass 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.start();

		//Sample ob3 = new Sample();
		//ob3.start();

		Demo ob2 = new Demo();
		ob2.start();
	}
}



