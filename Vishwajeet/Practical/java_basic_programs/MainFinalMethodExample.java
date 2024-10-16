class Parent
{
	final void display()
	{
		System.out.println("Final method display");
	}
}
class Child extends Parent
{
	void display()   // display() in Child cannot override display() in Parent	
	{				//	void display()
	}
}
class MainFinalMethodExample 
{
	public static void main(String[] args) 
	{
		Child ob = new Child();
		ob.display();
	}
}
