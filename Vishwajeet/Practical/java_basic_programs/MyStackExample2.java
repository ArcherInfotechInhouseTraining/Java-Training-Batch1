class MyStack
{
	private int maxsize;
	private int []stackArray;
	private int top;
	//Object lock;
	public MyStack(int size)
	{
		this.maxsize=size;
		this.stackArray = new int[maxsize];
		this.top=-1;
		//lock = new Object();
	}
	public void push(int value)
	{
		synchronized(this)
		{
			try{Thread.sleep(600);}catch(Exception e){}

			if(isFull())
			{
				System.out.println("Stack is full cannot push element"+value);
				return ;
			}
			stackArray[++top]=value;
		}
	}
	public int pop()
	{
		synchronized(this)
		{
			try{Thread.sleep(300);}catch(Exception e){}

			if (isEmpty()) 
				{
					System.out.println("Stack is empty. Cannot pop element.");
					return -1; 
				}
				return stackArray[top--];
		}
	}
	public boolean isEmpty() 
	{
        return (top == -1);
    }
    public boolean isFull() 
	{
        return (top == maxsize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack = stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push: "+i);
		}
	}
}
class PopAccessThread extends Thread
{
	MyStack stack;
	public PopAccessThread(MyStack stack)
		{
			this.stack = stack;
			start();
		}
		public void run()
		{
			for(int i=21;i<35;i++)
			{
				System.out.println("Pop: "+stack.pop());
			}
		}
}
class MyStackExample2
{
	public static void main(String []args)
	{
		MyStack stack = new MyStack(14);

		PushAccessThread a1 = new PushAccessThread(stack);
		PopAccessThread a2 = new PopAccessThread(stack);		
	}
}