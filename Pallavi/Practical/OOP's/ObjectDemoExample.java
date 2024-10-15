class MyClass extends Thread
{
	Thread t;

	public MyClass()
	{
		super("Thread-0");
		t=this;
	}
	String info;
	public String toString()
	{
		t=Thread.currentThread();
		info="["+t.getName()+" , "+t.getPriority()+" , "+t.getThreadGroup()+"]";
		return info;
	}
}

class ObjectDemoExample 
{
	public static void main(String[] args) 
	{
		MyClass ob = new MyClass();
		System.out.println("object information: "+ob);
	}
}
