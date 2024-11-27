class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
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
class MainConcPrg1
{
	public static void main(String []args)
	{
		Thread ob1=new Thread(new Demo());
		ob1.start();
		Thread ob2=new Thread(new Demo());
		ob2.start();
	}
}
