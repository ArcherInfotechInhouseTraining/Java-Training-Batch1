	// Garbage Collector

class GCDemo
{
	GCDemo()
	{
		System.out.println("GCD Default-cons");
	}
	
	protected void finalize()
	{
		System.out.println("From finalize() method");
	}
	
}

class GCDemoMain
{
	public static void main(String []args)
	{
		GCDemo ob5, ob2;
		GCDemo ob1 = new GCDemo();  //, ob2;
		{
			GCDemo ob3, ob4;
			
		}
		System.gc();
		
	}
}
