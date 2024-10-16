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
		for(int i=0;i<10;i++)
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
class MainClassConcProg
{
	public static void main(String[] args)
	{
		Demo ob1=new Demo();
		ob1.start();

		Sample ob2=new Sample();
		ob2.start();
	}

}