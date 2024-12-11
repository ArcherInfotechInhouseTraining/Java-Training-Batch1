class Resource
{
	private int value;
	{value = 0;}
	public int getValue()
	{
		return value;
	}
	public void incr()
	{
		value = value+1;
		System.out.println("After producing value: "+value);
	}
	public void decr()
	{
		value= value-1;
		System.out.println("After Consuming value: "+value);
	}
}
class Producer extends Thread
{
	Resource res;
	public Producer(Resource res)
	{
		this.res=res;
		start();
	}
	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.getValue()==1)
				{
					try
					{
						res.wait();
					}
					catch (Exception e)
					{
					}
				}
				res.incr();
				res.notify();
				try{Thread.sleep(200);}catch(Exception e){}
			}
		}
	}
}
class Consumer extends Thread
{
	Resource res;
	public Consumer(Resource res)
	{
		this.res=res;
		start();
	}
	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.getValue()==0)
				{
					try
					{
						res.wait();
					}
					catch (Exception e)
					{
					}
				}
				res.decr();
				res.notify();
				try{Thread.sleep(200);}catch(Exception e){}
			}
		}
	}
}
class MainResource 
{
	public static void main(String[] args) 
	{
		Resource ob = new Resource();

		Producer p = new Producer(ob);
		Consumer c = new Consumer(ob);
	}
}
