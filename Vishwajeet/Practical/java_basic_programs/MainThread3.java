class DemoThread extends Thread
{
	public DemoThread(String name)
	{
		super(name);
		setPriority(6);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getId()+"Hello: "+i+" - "+getName()+" with priority: "+getPriority());
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getId()+"Hii: "+i+" - "+getName()+" with priority: "+getPriority());
			try
			{
				Thread.sleep(300);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class MainThread3
{
	public static void main(String []args)
	{
		DemoThread ob1 = new DemoThread("Hello Thread");
		ob1.start();

		SampleThread ob2 = new SampleThread();
		ob2.setName("Hi Thread");
		ob2.setPriority(Thread.MAX_PRIORITY);
		ob2.start();
	}
}
