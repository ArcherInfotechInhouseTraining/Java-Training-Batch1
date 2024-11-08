class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread t = Thread.currentThread();
			System.out.println("Hello "+i+" - "+t.getName()+" - with Priority "+t.getPriority());
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

class MainRunnable 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Demo());
		t1.setName("4HelloThread");
		t1.setPriority(4);
		t1.start();

		Demo ob1 = new Demo();
		Thread t2 = new Thread(ob1);
		t2.setName("2HiThread");
		t2.setPriority(2);
		t2.start();

		Thread t3 = new Thread(new Demo());
		t3.setName("NormThread");
		t3.setPriority(Thread.NORM_PRIORITY);
		t3.start();

		Thread t4 = new Thread(new Demo());
		t4.setName("MinThread");
		t4.setPriority(Thread.MIN_PRIORITY);
		t4.start();

		Thread t5 = new Thread(new Demo());
		t5.setName("MaxThread");
		t5.setPriority(Thread.MAX_PRIORITY);
		t5.start();
	}
}
