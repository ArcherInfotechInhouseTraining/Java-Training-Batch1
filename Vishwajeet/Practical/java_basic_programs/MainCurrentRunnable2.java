class DemoThread implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		for(int i=0;i<10;i++)
		{
			System.out.println(t.getId()+" Hello: "+i+t.getName()+" with priority: "+t.getPriority());
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
class MainCurrentRunnable2
{
	public static void main(String []args)
	{
		DemoThread ob1 =new DemoThread();
		Thread t1 = new Thread(ob1);
		t1.setName("Hello Thread");
		t1.start();

		Thread t2 = new Thread(new DemoThread());
		t2.setName("Hii Thread");
		t2.setPriority(7);
		t2.start();

		Thread t3 = new Thread(new DemoThread());
		t3.setName("Bye Thread");
		t3.setPriority(3);
		t3.start();
	}
}