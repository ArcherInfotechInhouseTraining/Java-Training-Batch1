class Producer implements Runnable
{
	Thread pthread;
	UpdateItems pitems;
	public Producer(UpdateItems pitems)
	{
		this.pitems= pitems;
		pthread=new Thread(this,"Producer");
		pthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			pitems.update(1);
		}
	}
}
class Consumer implements Runnable
{
	Thread cthread;
	UpdateItems citems;
	public Consumer(UpdateItems citems)
	{
		this.citems= citems;
		cthread=new Thread(this,"Consumer");
		cthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			citems.update(2);
		}
	}
}
class UpdateItems
{
	int n=0;
	synchronized public void update(int chk)
	{
		if(chk==1)
		{
			n=n+1;
			notify();
			System.out.println("Producing: "+n);
			try
			{
				wait();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		if(chk==2)
		{
			if(n==0)
			{
					try
				{
					wait();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}

			n=n-1;
			notify();
			System.out.println("Consuming: "+n);		
		}
	}
}
class MainConsumerProducerExample
{
	public static void main(String []args)
	{
		UpdateItems items = new UpdateItems();
		new Producer(items);
		new Consumer(items);
	}
}