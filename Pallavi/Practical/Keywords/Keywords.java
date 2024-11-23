
//--------------- This. -----------------------
/*
//1.
class Demo
	{
		private int x;
		public Demo()
		{
			x=10;
			System.out.println("X: "+x);
		}		
		public Demo(int x)
		{
			this.x=x;
			System.out.println("X: "+x);
		}
		public void in(int x)
		{

			this.x=x;
			System.out.println("X: "+x);
		}
	}


//2.

class Demo
	{
		private int x;
		public Demo()
		{ 
			this(23);
			x=10;
			System.out.println("x: "+x);
			//x=10;
			
		}		
		public Demo(int x)
		{
			//this(23);
			System.out.println("x: "+x);
			//this(23);  //error: call to this must be first statement in constructor
		}
		public void in(int x)
		{
			
		}
	}


//3.
class Demo
	{
		private int x;
		public Demo()
		{
			x=10;
		}		
		public Demo(int x)
		{
				
		}
		public void in(int x)
		{
			this.x=x;
			output(this);
		}
		public void output(Demo obj)
		{
			System.out.println("val of x is: "+obj.x);
		}
	}


class Person
		{
			//.......
			private int age;
			//.......
			public int getAge(int a)
			{
				return age;
			}
			public void setAge(int age)
			{
				this.age=age;
			}
			public  Person getElder(Person ob)
			{
				if(ob.age>age)
					return ob;
				else
					return this;
			}			
		}

class Keywords 
{
	public static void main(String[] args) 
	{
		//Demo d = new Demo();
		//d.in(33);


			Person p1=new Person();
			p1.getAge(23);

			Person p2=new Person();
			p2.getAge(22);

			Person p3=p1.getElder(p2);
	}
}
*/


//------------- super ---------------------

class Parent 
		{
			Parent(String name) 
			{
        			System.out.println("Constructor of Parent: " + name);
    			}
		}

class Child extends Parent 
	{
		Child()
	    {
      		super("Parent's name");
   			System.out.println("Constructor of Child"); 	
		}
	}

class Keywords 
{
	public static void main(String[] args) 
	{
			Child ob = new Child();
	}
}