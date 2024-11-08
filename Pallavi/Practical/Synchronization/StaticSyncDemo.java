class ShowArray
{
	private static int []x = {1,11,22,33,44,55,66,77,88,99};

	synchronized static public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" "+x[i]);

			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

class StaticSyncDemo 
{
	public static void main(String[] args) 
	{
		ShowArray ob1 = new ShowArray();

		Thread t1 = new Thread(){
			public void run()
			{
				ob1.print();
			}
		};

		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t2.start();


		ShowArray ob2 = new ShowArray();

		Thread t12 = new Thread(){
			public void run()
			{
				ob2.print();
			}
		};

		t12.start();

		Thread t22 = new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t22.start();
	}

}
