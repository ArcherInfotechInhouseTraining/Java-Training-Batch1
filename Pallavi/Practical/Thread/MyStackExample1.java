class MyStack
{
	private int Max_Size;
	private int top;
	private int stackArray[];

	Object lock1;
	Object lock2;

	public MyStack(int size)
	{
		this.Max_Size = size;
		this.stackArray = new int[Max_Size];
		this.top = -1;

		lock1 = new Object();
		lock2 = new Object();
	}

	public void push(int value)
	{
		synchronized(lock1)
		{
			try{ Thread.sleep(600); }catch(Exception e){}

			if(isFull())
			{
				System.out.println("Stack is full. cannot push element "+value);
				return;
			}
			stackArray[++top] = value;
		}
	}

	public int  pop()
	{
		synchronized(lock2)
		{
			try{Thread.sleep(600);}catch(Exception e){}

			if(isEmpty())
			{
				System.out.println("Stack is empty.Cannot pop element");
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
		return (top == Max_Size - 1);
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

class MyStackExample1
{
	public static void main(String[] args) 
	{
		MyStack stack = new MyStack(14);

		PushAccessThread a1 = new PushAccessThread(stack);
		PopAccessThread a2 = new PopAccessThread(stack);

		PushAccessThread a3 = new PushAccessThread(stack);
		PopAccessThread a4 = new PopAccessThread(stack);
	}
}
