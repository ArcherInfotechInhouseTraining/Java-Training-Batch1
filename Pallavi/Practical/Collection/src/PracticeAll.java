import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Map;
import java.util.Hashtable;


/*
public class PracticeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Iterator<Integer> iterator = list.iterator();
		
//		 while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		 ListIterator<Integer> listiterator = list.listIterator(3);
		 listiterator.forEachRemaining(System.out::println);
		 System.out.println("\n-------------------------------------------");
		 
		 listiterator.previous();
		 listiterator.forEachRemaining(System.out::println);
		 listiterator.previous();
		 listiterator.forEachRemaining(System.out::println);
		 System.out.println("\n-------------------------------------------");
		 
		 //gives element in reverse order
		 while(listiterator.hasPrevious())
		 {
			 System.out.println(listiterator.previous());
		 }	 
	}
}

//=====================================================================================

	//converting ArrayList to Array and Array to ArrayList

public class PracticeAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		//ArrayList to Array
		
		Integer[] arr = new Integer[list.size()];
		arr = list.toArray(arr);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		//Array to ArrayList
		List<Integer> list1 = new ArrayList<>();
		list1 = Arrays.asList(arr);
		System.out.println(list1);
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println("Using Iterator(): ");
		Iterator<Integer> iterator = list1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("\n-----------------------------------------");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println("Using ListIterator: ");
		
		ListIterator<Integer> listIterator = list2.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		System.out.println("-----------------------------");
		System.out.println("BackWard: ");
		while(listIterator.hasPrevious())
		{
			Integer l = listIterator.previous();
			System.out.println(l);
		}
	}
}


//===============================================================

	// Jagged Array

public class PracticeAll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student count: ");
		int scnt = sc.nextInt();
		 
		int arr[][] = new int[scnt][];
		
		for(int i=0 ; i<scnt ; i++)
		{
			System.out.println("Enter subject cnt for " + (i+1) +" student : ");
			int subcnt = sc.nextInt();
			
			System.out.println("Enter "+subcnt+" subject marks: ");
			arr[i] = new int[subcnt];
			for(int j=0 ; j<arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display Marks: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student : "+(i+1));
			for(int j=0 ; j<arr[i].length ; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}


//===============================================================

class A{  
	protected void msg()
	{
		System.out.println("Hello java");
	}  
}  
  
public class PracticeAll extends A
{  
	protected void msg()
	{
		System.out.println("Hello java");
	}//C.T.Error  
	
	public static void main(String args[]){  
	 
		PracticeAll obj=new PracticeAll();  
		obj.msg();  
   }  
} 


//====================================================
class Demo
{
	private int z=10;
	
	public int getz()
	{
		return z;
	}
}
class PracticeAll
{
	private static int x=90;
	private static double y;
	public static void main(String []args)
	{
		PracticeAll ob=new PracticeAll();
		x=10;	
		y=33.25;	
		System.out.println("\n x="+x+"\t y="+y);
		
		Demo d = new Demo();
		System.out.println("z : "+d.getz());
	}
} 


//================================================================


class PracticeAll
{
	
	public static void main(String []args)
	{
		int x = (int) 33.90;
		double y = 20;
		System.out.println("X: "+x);
		System.out.println("y: "+y);
	}
}

//================================
 

// binary , octal and hexadecimal conversion

class Mynumber
{
	private int no;
	
	public void setNo(int a)
	{
		no = a;
	}
	public int getNo()
	{
		return no;
	}
	
	public void toBinary()
	{
		int no = this.no;
		int binum[] = new int[1000];
		
		int i=0;
		while(no!=0)
		{
			binum[i]=no%2;
			no = no/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binum[j]);
		}
	}
	
	public void toOctal()
	{
		int no = this.no;
		int oct[] = new int[1000];
		int i=0;
		while(no!=0)
		{
			oct[i]= no%8;
			no = no/8;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(oct[j]);
		}
	}
	
	public void toHex()
	{
		int no = this.no;
		int []hex = new int[1000];
		int i=0;
		
		while(no!=0)
		{
			hex[i] = no%16;
			i++;
			no = no/16;
		}
		 for (int j = i - 1; j >= 0; j--) 
		 { 
	         if (hex[j] > 9)
	        	System.out.print((char)(55 + hex[j])); 
	         else
	            System.out.print(hex[j]); 
	        } 
	}
}

class PracticeAll
{
	public static void main(String []args)
	{
		Mynumber ob = new Mynumber();
		ob.setNo(11);
		
		System.out.println("To Binary: ");
	    ob.toBinary();
		System.out.println("\n To Octal: ");
		ob.toOctal();
		System.out.println("\n to hex: ");
		ob.toHex();
	}
}
	

//===========================================
//Instance initializer block: 

public class PracticeAll
{
    // Instance variable
    private int x;

    // Instance initializer block
    {
        System.out.println("Instance initializer block");
        x = 100; // Assigning a value to the instance variable
    }

    // Constructor
    public PracticeAll() 
    {
        System.out.println("Constructor called");
    }

    // Method to display the value of x
    public void displayX() 
    {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) 
    {
        // Creating an object of MyClass
    	PracticeAll obj = new PracticeAll();
        obj.displayX();
        PracticeAll obj1 = new PracticeAll();
        obj1.displayX();
        PracticeAll obj2 = new PracticeAll();
        obj2.displayX();
    }
}


//===============================================
class Outer_Demo 
{
   int num=100;
   
   // inner class
	public class Inner_Demo 
	{
		public void print() 
		{
			System.out.println("This is an inner class no="+num);
		}
	}
   
   // Accessing he inner class from the method within
	void display_Inner() 
	{
		System.out.println("This is an Outer class no="+num);
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}
}
   
public class PracticeAll 
{

	public static void main(String args[]) 
	{
		// Instantiating the outer class 
		Outer_Demo outer = new Outer_Demo();
      
		// Accessing the display_Inner() method.
		outer.display_Inner();
		
		
	}
}

//==============================
class A
{
	private int x=10;
	
	public void show()
	{
		System.out.println("x is: "+x);
		B b = new B();
		b.display();
		
	}
}
class B
{
	private int y=20;
	
	public void display()
	{
		System.out.println("y is: "+y);
		
	}
}

public class PracticeAll 
{

	public static void main(String args[]) 
	{
		A a = new A();
		a.show();
	}
}

//============================================

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Animal{  
void weep(){System.out.println("weeping...");}  
}  
class PracticeAll{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
//d.bark();  
d.eat();  
}
} 

///=============================================
 

//Exception handling

public class PracticeAll 
{
	public static void main(String args[]) 
	{
		Random random = new Random();
		int x[] = {1,345,67,99,58,37,25,89,24,57,82,38,51,27,54,67,43,21,12,53};
		System.out.println("x length: "+x.length);
		
		try
		{
			for(int i=0;i<10;i++)
			{
				int r = random.nextInt(30);
				System.out.println("x: "+x[r]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid index"+e.getMessage());
		}
		finally
		{
			System.out.println("The End..............");
		}
	}
}


class Demo
{
	private String name;
	private int age;
	private int id;
	
	Scanner sc = new Scanner(System.in);
	
	public void in()
	{
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		if(age<20 || age>29)
		{
			//throw new NumberFormatException();
			throw new NumberFormatException("Age is not valid");
		}
		System.out.println("Enter id: ");
		id = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name : "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);
	}
}

public class PracticeAll 
{
	public static void main(String args[]) 
	{
		Demo d = new Demo();
		d.in();
		d.out();
	}
}


//==================================================


class Demo
{
	private String name;
	private int age;
	private int id;
	
	Scanner sc = new Scanner(System.in);
	
	public void in()
	{
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		if(age<20 || age>29)
		{
			//throw new NumberFormatException();
			throw new NumberFormatException("Age is not valid");
		}
		System.out.println("Enter id: ");
		id = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name : "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);
	}
}

public class PracticeAll 
{
	public static void main(String args[]) 
	{
		Demo d = new Demo();
		try
		{
			d.in();
		}
		catch(Exception e)
		{
			System.out.println("Problem due to: ");
			e.printStackTrace();
			System.out.println("Problem Due to: "+e.getMessage());
		}		
		d.out();
	}
}

//========================================

class Demo
{
	private int x;
	private int y;
	
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv()throws Throwable
	{
		return x/y;
	}
}
public class PracticeAll 
{
	public static void main(String args[]) throws Throwable 
	{
		Demo d = new Demo();
		d.setx(16);
		d.sety(0);
		
		try
		{
			System.out.println("div is: "+d.getDiv());
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
	}
}



//=========================================

//user defined exception

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}

class User
{
	private int age;
	
	public User(int age) throws InvalidAgeException
	{
		if(age<0)
		{
			throw new InvalidAgeException("Age can not be negative ");
		}
		if(age>100)
		{
			throw new InvalidAgeException("Age is to high");
		}
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
public class PracticeAll 
{
	public static void main(String args[]) throws Throwable 
	{
		User user = new User(-12);
		System.out.println("Age is: "+user.getAge());
	}
}


//=============================================================

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
	{
    	super(message);
    }
}

class User 
{
    private int age;
    public User(int age) throws InvalidAgeException 
	{
       	if (age < 0) 
		{
            throw new InvalidAgeException("Age cannot be negative.");
        }

        if (age > 150) 
		{
            throw new InvalidAgeException("Age is too high.");
        }
	    this.age = age;
   	}
}

class PracticeAll 
{
    public static void main(String[] args) 
	{
        try 
		{
            User user = new User(-1);
        } 
		catch (InvalidAgeException ex) 
		{
			System.out.println(ex.getMessage());
        }

        try 
		{
        	User user = new User(151);
        } 
		catch (InvalidAgeException ex) 
		{
            System.out.println(ex.getMessage());
        }

        try 
		{
       		User user = new User(30);
            System.out.println("Age is valid.");
        } 
		catch (InvalidAgeException ex) 
		{
       		System.out.println(ex.getMessage());
        }
   	}
}

//=====================================

interface A
{
	int x = 10;
	
	void output();
}

interface B
{
	int y = 20;
	
	void out();
	void output();
}
class C implements A,B
{
	public void output()
	{
		System.out.println("x is:  "+x);
	}
	public void out()
	{
		System.out.println("y: "+y);
	}
}

class PracticeAll 
{
    public static void main(String[] args) 
	{
    	C c = new C();
    	c.out();
    	c.output();
	}
}

//==================================================

//Thread practice

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii..."+i);
			try
			{
				Thread.sleep(600);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hello..."+i);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class PracticeAll 
{
    public static void main(String[] args) 
	{
    	DemoThread ob1 = new DemoThread();
    	ob1.start();
    	
    	SampleThread ob2 = new SampleThread();
    	ob2.start();
    	
	}
}

//====================

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello..."+i);
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class PracticeAll 
{
    public static void main(String[] args) 
	{
    	DemoThread ob1 = new DemoThread();
    	ob1.start();
    	
    	DemoThread ob2 = new DemoThread();
    	ob2.run();
	}
}

//------------------------------------------

	// getting default name of threads


class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii..."+i+" - "+getName());
			try
			{
				Thread.sleep(600);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hello..."+i+" - "+getName());
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class PracticeAll 
{
    public static void main(String[] args) 
	{
    	DemoThread ob1 = new DemoThread();
    	ob1.start();
    	
    	SampleThread ob2 = new SampleThread();
    	ob2.start();
    	
    	SampleThread ob3 = new SampleThread();
    	ob3.start();
    	
	}
}


//============================================

//Using setName(), getName(), setPririty(), getPriotity(), getId() and Thread(String)

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
			System.out.println("Hii..."+i+" - "+getName()+" - with priority "+getPriority());
			try
			{
				Thread.sleep(600);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hello..."+i+" - "+getName()+" - "+getPriority());
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class PracticeAll 
{
    public static void main(String[] args) 
	{
    	DemoThread ob1 = new DemoThread("FirstThread");
    	ob1.start();
    	
    	SampleThread ob2 = new SampleThread();
    	ob2.setName("SecondThread");
    	ob2.setPriority(Thread.MAX_PRIORITY);
    	ob2.start();
    	    	
	}
}

//===============================

// Using Runnable Interface to create the Threads
class DemoThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello...: "+i);
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii...: "+i);
			try{Thread.sleep(70);}catch(Exception e){}
		}
	}
}

class PracticeAll
{
	public static void main(String []args)
	{
		Thread ob1=new Thread(new DemoThread());
		ob1.start();

		Thread ob2=new Thread(new SampleThread());
		ob2.start();
	}
}


//====================================
// Another ways of creating thread using the Runnable interface

class DemoThread implements Runnable
{
	private Thread t;
	public DemoThread()
	{
		
	}
	public DemoThread(String name,int priority)
	{
		t = new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii.."+i+" - "+t.getName()+" - "+t.getPriority());
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class SampleThread implements Runnable
{
	private Thread t;
	public SampleThread()
	{
		
	}
	public SampleThread(String name,int priority)
	{
		t = new Thread(this,name);
		t.setPriority(priority);
		t.run();
	}

	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello.."+i+" - "+t.getName()+" - "+t.getPriority());
		
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class PracticeAll
{
	public static void main(String []args)
	{
		DemoThread d = new DemoThread("A",3);
		
		SampleThread s = new SampleThread("B",1);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
		
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}	
}

//=========================================================
//Creating Thread using anonymous class

class PracticeAll
{
	public static void main(String []args)
	{
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try {Thread.sleep(300);}catch(Exception e) {}
				}
			}
		});
		
		t1.setName("One");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try{Thread.sleep(400);}catch(Exception e){}
				}	
			}
		});
		t2.setName("Two");
		t2.start();	
	}
}

//=========================
//thread group
class FirstThread extends Thread
{
	public FirstThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class PracticeAll
{
	public static void main(String []args)
	{
		ThreadGroup tg=new ThreadGroup("MyThreadGroup");

		FirstThread t1=new FirstThread(tg,"One");
		t1.start();

		SecondThread t2=new SecondThread(tg,"Two");
		t2.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

//==================================================
//   isAlive() and join()

class FirstThread extends Thread
{
	public FirstThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class PracticeAll
{
	public static void main(String []args)
	{
		FirstThread t1 = new FirstThread("One");
		t1.start();
		
		SecondThread t2 = new SecondThread("Two");
		t2.start();
		
		System.out.println("t1 isAlive : "+t1.isAlive());
		System.out.println("t2 isAlive: "+t2.isAlive());
		
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				
			}
			if(i==10)
			{
				try
				{
					t1.join();
				}
				catch(Exception e)
				{
					
				}
			}
		}
		System.out.println("t1 is Alive: "+t1.isAlive());
		System.out.println("t2 is Alive: "+t2.isAlive());
	}
}
	

//===================================


class PracticeAll
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				try
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("Hello");
						Thread.sleep(300);
					}
				}
				catch (Exception e)
				{
				}
			}
		};
		t1.start();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}


//===============================

class Demo extends Thread
{
	public void run()
	{
		System.out.println("Interrupted: "+this.interrupted());
		try
		{
			for(int i=0;i<15;i++)
			{
				
				System.out.println(i+" - "+this);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class PracticeAll
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.start();
		d.interrupt();
		System.out.println("is Interrupted: "+d.interrupted());
	}
}

//==================================

class DemoThread extends Thread
{
	public void run()
	{
		System.out.println("Is Interrupted: "+this.interrupted());
		
			try
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					Thread.sleep(300);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
class PracticeAll
{
	public static void main(String[] args) 
	{
		DemoThread t1 = new DemoThread();
		t1.start();
		t1.interrupt();
	}
}

//===========================

class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println(i+" - "+this.getName());
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class  PracticeAll
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread("One");
		MyThread t2=new MyThread("Two");
		MyThread t3=new MyThread("Three");
		MyThread t4=new MyThread("Four");
		MyThread t5=new MyThread("Five");
		try
		{
			t3.yield();
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}


//===============================


class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
	Object lock1;
	Object lock2;
    public MyStack(int size) 
	{
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
		lock1=new Object();
		lock2=new Object();
    }
    public void push(int value) 
	{
		// t1->, t2-O
		synchronized(this)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			if (isFull()) 
			{
				System.out.println("Stack is full. Cannot push element " + value);
				return;
			}
			stackArray[++top] = value;
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
        return (top == maxSize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack=stack;
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
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
			System.out.println("Pop: "+stack.pop());
	}
}
class PracticeAll
{
	public static void main(String[] args) 
	{
		MyStack stack=new MyStack(14);

		PushAccessThread a1=new PushAccessThread(stack);
		PopAccessThread a2=new PopAccessThread(stack);
	}
}

//====================================

class ShowArray
{
	private static int []x={1,11,22,33,44,55,66,77,88,99};
	synchronized static public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("  "+x[i]);
			try{Thread.sleep(600);}catch(Exception e){}
		}
	}
}
class PracticeAll
{
	
	public static void main(String[] args) 
	{
		ShowArray ob1=new ShowArray();
		Thread t1=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t2.start();
		//------------------------------------
		ShowArray ob2=new ShowArray();
		Thread t12=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t12.start();
		Thread t22=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t22.start();
	}
}


//===============================
//wait().notify(),notifyall()

import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;
	public double getBill(){return bill;}
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
			
				try{Thread.sleep(400);}catch(Exception e){}
				int price=new Random().nextInt(200);
				System.out.println("Item "+(i+1)+" Price: "+price);
				bill=bill+price;
			}
			this.notify();
		}
	}
}
class PracticeAll 
{
	public static void main(String[] args) 
	{
		Cart c1=new Cart();
		c1.start();
		
		synchronized(c1)
		{
			try{c1.wait();}catch(Exception e){}
		}

		System.out.println("Total Bill: "+c1.getBill());
	}
}

//============================


class A
{
	private String  a;
	public A()
	{
		a = "hi";
	}
	public A(String a)
	{
		this.a = a;
	}
	public String getA()
	{
		return a;
	}
}
class B
{
	private String b;
	public B()
	{
		b = "hi";
	}
	public B(String b)
	{
		this.b = b;
	}
	public String getB()
	{
		return b;
	}
}
class PracticeAll 
{
	public static void main(String[] args) 
	{
		A ob = new A("hello");
		System.out.println("A is: "+ob.getA());
		B ob1 = new B("Good");
		System.out.println("B is: "+ob1.getB());
		
		System.out.println("A equals B: "+ob.equals(ob1));
		
		B ob2 = new B("hello");
		System.out.println("ob4 equals ob: "+ob2.equals(ob));
		
		String str = "hi";
		String str1 = "hi";
		String str2 = new String("hi");
		System.out.println("str equals str2: "+str.equals(str2));
		System.out.println("str==str2: "+(str==str2));
		System.out.println("str equals str1: "+str.equals(str1));
		System.out.println("str == str1: "+(str==str1));
		
		int a=10;
		int b=40;
		System.out.println("a==b: "+(a==b));
		System.out.println("---");
		
	}
}

//===========================================

class PracticeAll 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("false");        
		System.out.println("b1: "+b1+"\t b2: "+b2);

		// logical AND
		System.out.println(Boolean.logicalAnd(b1,b2));
		System.out.println(Boolean.logicalAnd(false,true));
		System.out.println(Boolean.logicalAnd(b1,true));
		System.out.println(Boolean.logicalAnd(false,b2));
		System.out.println("--------------------------------------");

		// logical OR
		System.out.println(Boolean.logicalOr(b1,b2));
		System.out.println(Boolean.logicalOr(false,true));
		System.out.println(Boolean.logicalOr(b1,true));
		System.out.println(Boolean.logicalOr(false,b2));
		System.out.println("--------------------------------------");

		// logical XOR
		System.out.println(Boolean.logicalXor(b1,b2));
		System.out.println(Boolean.logicalXor(false,true));
		System.out.println(Boolean.logicalXor(b1,true));
		System.out.println(Boolean.logicalXor(false,b2));
		System.out.println("--------------------------------------");
	}
}


//======================================================

import java.util.Arrays;
class PracticeAll
{
	public static void main(String[] args) 
	{
		int []x={34,5,67,9,23,45,12};

		// Using toString() to display the array
		System.out.println("Entered x array is: "+Arrays.toString(x));

		// using sort
		Arrays.sort(x);		
		System.out.println("Sorted x array is: "+Arrays.toString(x));

		//using sort a specific range
		int []y={34,5,67,9,23,45,12,40,69,233,10};
		System.out.println("Entered y array is: "+Arrays.toString(y));
		Arrays.sort(y,2,7);
		System.out.println("Sorted y array is: "+Arrays.toString(y));

		// searching
		int key=45;
		int pos=Arrays.binarySearch(x,key);
		System.out.println("Position is: "+pos);

		//fill
		Arrays.fill(x,1);
		Arrays.fill(y,2,7,111);		
		System.out.println("After fill x array is: "+Arrays.toString(x));
		System.out.println("After fill range y array is: "+Arrays.toString(y));

		// copy
		int []z=Arrays.copyOf(x,12);		
		System.out.println("After copyOf(), z array is: "+Arrays.toString(z));

		int []t=Arrays.copyOf(y,5);		
		System.out.println("After copyOf(), t array is: "+Arrays.toString(t));

		int []t1=Arrays.copyOf(y,y.length);		
		System.out.println("After copyOf(), t1 array is: "+Arrays.toString(t1));

		int []t2=Arrays.copyOfRange(y,4,8);		
		System.out.println("After copyOf(), t1 array is: "+Arrays.toString(t2));

		// Using equals
		boolean b=Arrays.equals(x,y);
		System.out.println("x equals y: "+b);

		boolean b1=Arrays.equals(t1,y);
		System.out.println("t1 equals y: "+b1);

		int []k={1,1,1,1,1,1,1};
		boolean b2=Arrays.equals(x,k);
		System.out.println("x equals k: "+b2);
	}
}

//==============================================================

class Sample 
{
	private int num;
	public Sample()
	{
		num=1;
	}
	public Sample(int num)
	{
		this.num=num;
	}
	public void set(int num)
	{
		this.num=num;
	}
	public void show()
	{
		System.out.println("value of num: "+num);
	}
}
class PracticeAll
{
	public static void main(String []args)
	{
		// shallow copies
		Sample ob1=new Sample();
		Sample ob2=ob1;
		ob1.set(1000);
		ob2.show();		
		System.out.println("ob1 equals ob2: "+ob1.equals(ob2));
		System.out.println("------------------------------------------");
	
		// deep copies
		Sample s1=new Sample(100);	
		Sample s2=new Sample(100);
		System.out.println("s1 equals s2: "+s1.equals(s2));
		s1.set(45);
		s1.show();
		s2.show();
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("------------------------------------------");
	

		// Lazy copies
		int []x={11,22,33,44};
		int []y={11,22,33,44};
		
		System.out.println("After value insert x array is: "+Arrays.toString(x));
		System.out.println("x equals y: "+Arrays.equals(x,y));

		y[2]=100;
		System.out.println("After insert y is: "+Arrays.toString(y));
		System.out.println("x equals y: "+Arrays.equals(x,y));
	}
}

//============================================================
//Collections

class MyIterable implements Iterable<String>
{
	private String []data;
	
	public MyIterable(String[] data)
	{
		this.data = data;
	}
	
	@Override
	public Iterator<String> iterator() {
		
		return new Iterator<String>() {

			private int index = 0;
			@Override
			public boolean hasNext() {
				
				return index<data.length;
			}

			@Override
			public String next() {
				if(!hasNext())
				{
					throw new java.util.NoSuchElementException();
				}
				return data[index++];
			} 
			
		};
	}
}

class PracticeAll
{
	public static void main(String []args)
	{
		MyIterable myIterable = new MyIterable(new String[] {"hi","how","are","you"});
		for(String a : myIterable )
		{
			System.out.println(a);
		}
	}
}

//=================================================

//ArrayList

class PracticeAll
{
	public static void main(String []args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Hi");
		al.add("By");
		al.add("Good");
		al.add("Bad");
		
		System.out.println("String al: ");
		System.out.println(al);
		al.add(0,"Hello");
		System.out.println(al);
		al.set(3, "Morning");
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("C");
		al2.add("C++");
		al2.add("SQL");
		al2.add("Java");
		
		System.out.println("\n String al2: ");
		System.out.println(al2);
		
		al.addAll(0,al2);
		System.out.println(al);
		
		
		System.out.println("sublist: "+al.subList(2, 7));
		
		System.out.println("Contains: "+al.containsAll(al2));
		System.out.println("Contains SQL: "+al.contains("SQL"));
		
		System.out.println("Get: "+al.get(1));
		System.out.println("IndexOf JAVA: "+al.indexOf("Java"));
		
		System.out.println("\n Using iterator: ");
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//listIteartor()
		System.out.println("\nUsing listIterator: ");
		ListIterator list = al.listIterator();
		System.out.println("\nFED: ");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("\n BWD: ");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
}

//===============================================================

//function interface

//using anonymous class

interface MyMessage
{
	void printMsg();
}

class PracticeAll
{
	public static void main(String []args)
	{
		MyMessage mob = new MyMessage() {

			@Override
			public void printMsg() {
				System.out.println("Hello Function");	
			}
		};
		mob.printMsg();
	}
}


//=======================================================

//using lambda expression

interface MyMessage
{
	void printMsg();
}

class PracticeAll
{
	public static void main(String []args)
	{
		MyMessage mob = ()->System.out.println("Hello All");
		
		mob.printMsg();
	}
	
}


//===========================================================

//argument passing and return

interface MyAdd
{
	int add(int a,int b);
}
class PracticeAll
{
	public static void main(String []args)
	{
		MyAdd ob = (a,b)->a+b;
		
		System.out.println("Addition is: "+ob.add(2, 4));
	}
}


//===========================================================

//function types:
//1.function

class PracticeAll
{
	public static void main(String []args)
	{
		Function<String , Integer> strLength = (str)->str.length();
		
		int length = strLength.apply("Hello");
		System.out.println("String length is: "+length);
		
		Function<Integer,Integer> square = (x)->x*x;
		
		int s = square.apply(5);
		System.out.println("Square is: "+s);
	}
}


//===========================================================

class PracticeAll
{
	public static void main(String []args)
	{
		//UnaryOperator
		UnaryOperator<Integer> not = (a)->a^1;
		System.out.println(not.apply(4));
		
		//BinaryOperator
		BinaryOperator<Integer> ob = (a,b)->a&b;
		System.out.println(ob.apply(2, 4));
		
	}
}

//===========================================================

//2.Supplier

class PracticeAll
{
	public static void main(String []args)
	{
		Supplier<String> message = () -> "Hello Supplier";
		
		System.out.println(message.get());
	}
}

//==================================================

//3.Consumer

class PracticeAll
{
	public static void main(String []args)
	{
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		//System.out.println(numbers);
		
		Consumer<Integer> printNumber = new PrintNumber();
		
		numbers.forEach(printNumber);
		
	}
}

class PrintNumber implements Consumer<Integer>
{

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}


//=======================================

//above prg using lambda expression 

class PracticeAll
{
	public static void main(String []args)
	{
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		Consumer<Integer> printNumber =  (numbers) -> System.out.println(numbers);
		
		number.forEach(printNumber);
		
		number.forEach((numbers) -> System.out.println(numbers));

	}
}

//==============================================================

//Predicate<T> Example

class PracticeAll
{
	public static void main(String []args)
	{
		Predicate<Integer> isEven = new IsEvenPredicate();
		
		System.out.println("4 is even: "+isEven.test(4));
		System.out.println("7 is even: "+isEven.test(7));
		
	}
}

class IsEvenPredicate implements Predicate<Integer>
{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2 == 0;
	}
	
}


//=====================================
//Above example using lambda expression

class PracticeAll
{
	public static void main(String []args)
	{
		Predicate<Integer> isEven = (number)-> number%2==0;
		
		System.out.println("4 is even: "+isEven.test(4));
		System.out.println("7 is even: "+isEven.test(7));
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		boolean removed = list.removeIf( n->n%2 == 0);
		

        System.out.println("Numbers after removal: " + list);
        System.out.println("Elements removed: " + removed);
	}
}
	

//==============================================


public class PracticeAll {
    public static void main(String[] args) {
        // Creating two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        // Adding elements to the f]irst ArrayList
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("grapes");
        
        // Adding elements to the second ArrayList
        list2.add("banana");
        list2.add("orange");
        list2.add("kiwi");
        
        // Printing the original lists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);
        
        // Retaining only the elements that are common in both lists
        boolean changed = list1.retainAll(list2);
        
        // Printing the modified list1
        System.out.println("Modified list1: " + list1);
        
        // Checking if the list1 has been modified
        System.out.println("List1 has been modified: " + changed);
    }
}


//==============================================
//Comparator - ArrayList()
class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) 
    {
    	this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() 
   {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return id+" - "+name + ":Rs." + price+" "+super.toString();
    }
}
public class PracticeAll 
{
    public static void main(String[] args) 
    {
    	List<Product> products = new ArrayList<>();
    	
    	products.add(new Product(1,"laptop",1234));
    	products.add(new Product(2,"Mobile",9876));
    	products.add(new Product(3,"mac",5667));
    	products.add(new Product(4,"camera",4348));
    	
    	System.out.println(products);
    	
    	products.sort(new ProductPriceComparator());
    	
    	System.out.println("After price sorting: "+products);

    }
}

class ProductPriceComparator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
	
}

//===================================================

class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) 
    {
    	this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() 
   {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return id+" - "+name + ":Rs." + price+" "+super.toString();
    }
}
public class PracticeAll 
{
    public static void main(String[] args) 
    {
    	List<Product> products = new ArrayList<>();
    	
    	products.add(new Product(1,"laptop",1234));
    	products.add(new Product(2,"Mobile",9876));
    	products.add(new Product(3,"mac",5667));
    	products.add(new Product(4,"camera",4348));
    	
    	System.out.println("Before sort: ");
    	System.out.println(products);
    	
    	System.out.println("\n After Sort: ");
    	products.sort( (p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    	
    	System.out.println("After price sorting: "+products);

    }
}

//=================================

public class PracticeAll 
{
    public static void main(String[] args) 
    {
    	List<Integer> list = new ArrayList<>();
    	
    	list.add(2);
    	list.add(67);
    	list.add(34);
    	list.add(24);
    	list.add(90);
    	list.add(31);
    	
    	System.out.println("List: \n");
    	System.out.println(list);
    	
    	Iterator<Integer> iterator = list.iterator();
    	
    	while(iterator.hasNext())
    	{
    		System.out.println(iterator.next());
    	}
    	
    	System.out.println("\n list1: ");
    	
    	List<Integer> list1 = new ArrayList<>();
    	
    	list1.add(2);
    	list1.add(67);
    	list1.add(34);
    	list1.add(24);
    	list1.add(90);
    	list1.add(31);
    	
    	//System.out.println(list1);
    	
    	System.out.println("FWD");
    	ListIterator<Integer> listiterator = list1.listIterator();
    	
    	List<Integer> list2 = new ArrayList<>();
    	
    	list2 = list1;
    	
    	while(listiterator.hasNext())
    	{
    		System.out.println(listiterator.next());
    	}
    	
    	System.out.println("\n BWD");
    	while(listiterator.hasPrevious())
    	{
    		int a = listiterator.previous();
    		System.out.println(a);
    	}
    	
    	
    	System.out.println("Spliterator: ");
    	Spliterator<Integer> spliterator = list1.spliterator();
    	
    	System.out.println("Sequential traversing( tryAdvance() ): ");
    	while(spliterator.tryAdvance(System.out::println));
    	
    	// Parallel traversal using trySplit()
    	System.out.println("Parallel traversal using trySplit()");
    	spliterator = list1.spliterator();
    	
    	Spliterator<Integer> split = spliterator.trySplit();
    	
    	if(split!=null)
    	{
    		split.forEachRemaining(System.out::println);
    	}

    	 System.out.println("\nProcessing remaining elements sequentially:");
         spliterator.forEachRemaining(System.out::println);
  
    }
}

//================================================

//stack operation

public class PracticeAll 
{
    public static void main(String[] args) 
    {
    	Stack<Integer> stack = new Stack<>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true)
    	{
    		System.out.println("******* MENU ********");
    		System.out.println("1.Push \t 2.Pop \t 3.Stop");
    		System.out.println("Enter any option: ");
    		int opt = sc.nextInt();
    		
    		switch(opt)
    		{
    		case 1:
    			try
    			{
    				System.out.println("Enter any value: ");
    				stack.push(sc.nextInt());
    			}
    			catch(Exception e)
    			{
    				System.out.println("Enter only integer value.");
    			}
    			break;
    			
    		case 2:
    			if(!stack.isEmpty())
    			{
    				System.out.println("Element is poped: "+stack.pop());
    			}
    			else
    			{
    				System.out.println("Stack is empty");
    			}
    			break;
    			
    		case 3:
    			System.exit(0);
    		}
    	}
    }
}

//=============================================
//SynchronizedListExample

public class PracticeAll  {

    public static void main(String[] args) throws InterruptedException {
        
	// Create an ArrayList
        List<Integer> numbers = new LinkedList<>();

        // Wrap it in a synchronized list
        List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);

        // Thread 1 keeps adding numbers
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                synchronizedNumbers.add(i);
                try {
                    Thread.sleep(200); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 keeps printing the list size
        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("List Size: " + synchronizedNumbers.size());
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish (unlikely due to the infinite loop in thread2)
        thread1.join();
        thread2.join();
    }
}

//==================================================
//UnmodifiableListDemo

public class PracticeAll {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original List (LinkedList): ");
        printList(fruits);

        // Create an unmodifiable view using Collections.unmodifiableList()
        List<String> unmodifiableList = Collections.unmodifiableList(fruits);

        System.out.println("\nUnmodifiable List: ");
        printList(unmodifiableList);

        // Trying to modify the unmodifiable list throws an exception
        try {
            unmodifiableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }

        // Modifications to the original list are still reflected
        fruits.addFirst("Grape");
        System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);

        System.out.println("\nUnmodifiable List (after modification): ");
        printList(unmodifiableList);
    }

    private static void printList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
    
}

//=====================================================

//List.of() in LinkedList() 
public class PracticeAll {

    public static void main(String[] args) {
    	
    	ArrayList<String> fruits = new ArrayList<>();
    	fruits.add("Banana");
    	fruits.add("Mango");
    	fruits.add("Apple");
    	
    	String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
    	
    	List<String> immutableList = List.of(fruitsArray);
    	
    	System.out.println("\nImmutable List (using List.of() with array): ");
        printList(immutableList);

        // Trying to modify the immutable list throws an exception
        try {
            immutableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }
    }

	private static void printList(List<String> immutableList) {
		// TODO Auto-generated method stub
		
	}
}

//====================================================

public class PracticeAll 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(10);  // Duplicate element
        queue.add(30);

        // Printing the elements in the queue
        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue is: "+queue);
        System.out.println("Removed: " + queue.poll());

        // Printing the remaining elements
        System.out.println("Remaining elements in the queue: " + queue);
        
    }
}


//=====================================
//Implementations of Queue that Allow Duplicates

public class PracticeAll 
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Apple");  // Duplicate element
        queue.add("Cherry");

        // Printing the elements in the queue
        System.out.println("Elements in the queue: " + queue);

        // Removing elements from the queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        // Printing the remaining elements
        System.out.println("Remaining elements in the queue: " + queue);
    }
}

//=================================

// ArrayDeque

public class PracticeAll 
{
    public static void main(String[] args) 
    {
    	Deque<Integer> queue = new ArrayDeque<>();
    	
    	queue.add(2);
    	queue.add(34);
    	queue.add(90);
    	queue.add(2);
    	queue.add(12);
    	queue.add(67);
    	
    	System.out.println(queue);
    	
    	queue.poll();
    	System.out.println("After poll: "+queue);
    	
    	System.out.println("After peek: "+queue.peek());
    	
    	queue.offer(55);
    	System.out.println("Using offer: "+queue);
    	
    	System.out.println("Using element: "+queue.element());
    	System.out.println("Using remove: "+queue.remove());
    	
    	System.out.println("Using pop: "+queue.pop());
    	
    	queue.push(23);
    	System.out.println("Using push: "+queue);
    	
    	queue.push(33);
    	System.out.println("Using push: "+queue);
    	
    	queue.addLast(100);
    	System.out.println(queue);
    }
}

//===============================
//Write a program to implement the stack using ArrayDeque

public class PracticeAll
{
    public static void main(String[] args) 
    {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if empty");
            System.out.println("5: Get size");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int numberToPush = scanner.nextInt();
                    stack.push(numberToPush);
                    System.out.println("Pushed " + numberToPush + " onto the stack.");
                    System.out.println("Current stack: " + stack);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedNumber = stack.pop();
                        System.out.println("Popped " + poppedNumber + " from the stack.");
                        System.out.println("Current stack: " + stack);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot peek.");
                    } else {
                        int topNumber = stack.peek();
                        System.out.println("Top element is " + topNumber);
                    }
                    break;

                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;

                case 5:
                    System.out.println("Size of the stack: " + stack.size());
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}


//===================================
//Sorted Set
public class PracticeAll
{
    public static void main(String[] args) 
    {
    	SortedSet<String> sortedset = new TreeSet<>();
    	
    	sortedset.add("Orange");
    	sortedset.add("Apple");
    	sortedset.add("Cherry");
    	sortedset.add("Mango");
    	sortedset.add("Banana");
   
//    	sortedset.add(null);
    	System.out.println("Sorted set: "+sortedset);
    	
    	System.out.println("First element: "+sortedset.first());
    	System.out.println("Last element: "+sortedset.last());
    	
    	SortedSet subset = sortedset.subSet("Banana", "Mango");
    	System.out.println("Subset: "+subset);
    	
    	SortedSet headset = sortedset.headSet("Cherry");
    	SortedSet tailset = sortedset.tailSet("Cherry");
    	
    	System.out.println("HeadSet: "+headset);
    	System.out.println("TailSet: "+tailset);
    	
    }
}

//=========================
//TreeSet

public class PracticeAll {
    public static void main(String[] args) {
        // Using the default constructor
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(3);
        treeSet1.add(1);
        treeSet1.add(2);
        System.out.println("TreeSet created with default constructor: " + treeSet1);

        // Using the constructor with a collection parameter
        List<Integer> list = Arrays.asList(7, 5, 6);
        TreeSet<Integer> treeSet2 = new TreeSet<>(list);
        System.out.println("TreeSet created with collection constructor: " + treeSet2);

        // Using the constructor with a comparator parameter
        TreeSet<String> treeSet3 = new TreeSet<>(Comparator.reverseOrder());
        treeSet3.add("banana");
        treeSet3.add("apple");
        treeSet3.add("cherry");
        System.out.println("TreeSet created with comparator constructor: " + treeSet3);

	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(6);
	        numbers.add(66);
	        numbers.add(35);
	        numbers.add(44);
	        numbers.add(10);
	        numbers.add(55);
	        numbers.add(16);
	        numbers.add(24);
	        
	        System.out.println("TreeSet: " + numbers);

	        // Using higher()
	        System.out.println("Using higher: " + numbers.higher(6));

	        // Using lower()
	        System.out.println("Using lower: " + numbers.lower(16));

	        // Using ceiling()
	        System.out.println("Using ceiling: " + numbers.ceiling(4));

	        // Using floor()
	        System.out.println("Using floor: " + numbers.floor(16));
	        
	        
	        TreeSet<Integer> treeSet = new TreeSet<>();

	        // Adding elements to the TreeSet
	        treeSet.add(10);
	        treeSet.add(20);
	        treeSet.add(30);
	        treeSet.add(40);
	        treeSet.add(50);
	        treeSet.add(60);
	        treeSet.add(70);

	        // Displaying the original TreeSet
	        System.out.println("Original TreeSet: " + treeSet);

	        // Demonstrating headSet() method
	        TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet.headSet(40);
	        System.out.println("headSet(40): " + headSet);

	        // Demonstrating tailSet() method
	        TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet.tailSet(40);
	        System.out.println("tailSet(40): " + tailSet);

	        // Demonstrating subSet() method
	        TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(20, 50);
	        System.out.println("subSet(20, 50): " + subSet);
	        
	        TreeSet<Integer> set1 = new TreeSet<>();
	        TreeSet<Integer> set2 = new TreeSet<>();

	        // Adding elements to the first set
	        set1.addAll(Arrays.asList(1, 2, 3, 4, 5));

	        // Adding elements to the second set
	        set2.addAll(Arrays.asList(4, 5, 6, 7, 8));

	        // Displaying the original sets
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);

	        // Union operation
	        TreeSet<Integer> union = new TreeSet<>(set1);
	        union.addAll(set2);
	        System.out.println("Union of set1 and set2: " + union);

	        // Subset operation
	        TreeSet<Integer> subset = new TreeSet<>(set1);
	        subset.retainAll(set2);
	        System.out.println("Subset of set1 and set2: " + subset);

	        // Difference operation (set1 - set2)
	        TreeSet<Integer> difference1 = new TreeSet<>(set1);
	        difference1.removeAll(set2);
	        System.out.println("Difference of set1 and set2: " + difference1);

	        // Difference operation (set2 - set1)
	        TreeSet<Integer> difference2 = new TreeSet<>(set2);
	        difference2.removeAll(set1);
	        System.out.println("Difference of set2 and set1: " + difference2);

	        // Intersection operation
	        TreeSet<Integer> intersection = new TreeSet<>(set1);
	        intersection.retainAll(set2);
	        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}

//=================================
 
//hashset

public class PracticeAll {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");  // Duplicate element, will not be added
        hashSet.add(null);     // Allows null
        hashSet.add(null);
        hashSet.add(null);
        
        System.out.println("HashSet: " + hashSet);
        
        Collection<String> collection = Arrays.asList("One","Two","Three");
        
        HashSet<String> set1 = new HashSet<>(collection);
        set1.add("Four");
        set1.add("Five");
        
        System.out.println(set1);
        
        System.out.println("\n Using for each: ");
        for(String str : set1)
        {
        	System.out.print(str+" , ");
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(2,4,78,6,3,23,90,73,27));
        System.out.println(set2);
        
        set2.removeAll(Arrays.asList(2,6,73));
        System.out.print(set2+" , ");
        
        System.out.println("\n Using removeif: ");
        set2.removeIf(num -> num%2==0);
        System.out.println(set2);
        
        Set<Integer> set3 = new HashSet<>();
        
        set3.add(3);
        set3.add(9);
        set3.add(24);
        set3.add(12);
        set3.add(56);
        set3.add(91);
        set3.add(63);
        set3.add(48);
        
        Iterator<Integer> iterator = set3.iterator();
        
        System.out.println("Using iterator");
        while(iterator.hasNext())
        {
        	System.out.print(" " +iterator.next());
        }
        
        System.out.println("\n Using Spliterator: ");
        Spliterator<Integer> spliterator = set3.spliterator();
        spliterator.forEachRemaining( (Integer i)->System.out.println(i) );
        
        System.out.println("--------------------");
        set3.forEach((Integer i) -> System.out.println(i));
        
        
    }
}

//======================================
//LinkedHashSet


public class PracticeAll
{
    public static void main(String[] args) 
    {
    	LinkedHashSet<String> set = new LinkedHashSet<>();
    	set.add("One");
    	set.add("Two");
    	set.add("One");
    	set.add(null);
    	set.add("One");
    	
    	System.out.println("set: "+set);
    	set.remove("Two");
    	System.out.println("set: "+set);

    	for(String str : set)
    	{
    		System.out.println(str);
    	}
    }
}
//====================================

// HashMap

public class PracticeAll
{
    public static void main(String[] args) 
    {
    	HashMap<String , Integer> map = new HashMap<>();
    	map.put("K1", 1);
    	map.put("k2", 2);
    	map.put("k3", 3);
    	map.put("k4", 4);
    	
    	System.out.println(map);
    	System.out.println("Using iterator for map: ");
    	for(java.util.Map.Entry<String, Integer> entry : map.entrySet())
    	{
    		System.out.println(entry.getKey()+" : "+entry.getValue());
    	}
    	
    	HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);
        map1.put("Four", 4);
        map1.put("Five", 5);
        
        

        // Iterate over the map
        System.out.println("Iteration order:");
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Add more elements
        map1.put("Six", 6);
        map1.put("Seven", 7);

        // Iterate again
        System.out.println("\nIteration order after adding more elements:");
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
            System.out.println("value of six: "+map1.get("Six"));
            
            map.remove("K1");
            System.out.println(map);
            
            map.clear();
            System.out.println("map is empty: "+map.isEmpty());
            
            System.out.println("Map1 size: "+map1.size());
            
            System.out.println("Containkey : "+map1.containsKey("One"));
            System.out.println("COntainsValue: "+map1.containsValue(9));
        }
    }
}

//==========================================================================================

//LinkedHashMap
public class PracticeAll
{
    public static void main(String[] args) 
    {
    	LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
    	map.put(1, "Orange");
    	map.put(2, "Mango");
    	map.put(3, "Banana");
    	map.put(4, "Apple");
    	
    	System.out.println(map);
    	map.put(5, "Cherry");
    	map.put(6," Blackberry");
    	System.out.println("After insertion: \n"+map);
    	
    	System.out.println("\n Using HashMap: \n ");
    	
    	 HashMap<String, String> map1 = new HashMap<>();
         map1.put("Apple", "Red");
         map1.put("Orange", "Orange");
         map1.put("Banana", "Yellow");

         // Using `entrySet` and a `for-each` loop:
         System.out.println("Using `entrySet` and a `for-each` loop:");
         for (Map.Entry<String, String> entry : map1.entrySet()) 
         {
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());       
         }
         
         map1.put("Black", "Black");
         map1.put("XYZ", "XYZ");
         map1.put("a", "a");
         map1.put("b", "b");
         map1.put("c", "c");
         
         System.out.println("Using `entrySet` and a `for-each` loop-I:\n");
         
         System.out.println(map1);
         for (Map.Entry<String, String> entry : map1.entrySet()) 
         {
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());       
         }
    }
}


//==============================================================================

public class PracticeAll
{
    public static void main(String[] args) 
    {
    	 LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

         // Adding new key-value pairs to the LinkedHashMap
         dayNumberMapping.put("Mon", 1);
         dayNumberMapping.put("Tus", 2);
         dayNumberMapping.put("Wen", 3);
         dayNumberMapping.put("Thu", 4);
         dayNumberMapping.put("Fri", 5);
         dayNumberMapping.put("Sat", 6);
         
         System.out.println("Value for Fri: "+dayNumberMapping.get("Fri"));
         System.out.println("Contains Key Sat: "+dayNumberMapping.containsKey("Sat"));
         System.out.println("Contains value 3: "+dayNumberMapping.containsValue(3));
     
         dayNumberMapping.forEach((key,value) -> System.out.print(" "+key+" : "+value));
    
         for(Map.Entry<String,Integer> entry :dayNumberMapping.entrySet())
         {
        	 System.out.println(entry.getKey()+" : "+entry.getValue());
         }
    }
}
*/
//===========================================

//HashTable

class PracticeAll
{
	public static void main(String[] args)
	{
		Hashtable<String,Integer> hashtable = new Hashtable<>();
		
	}
}

