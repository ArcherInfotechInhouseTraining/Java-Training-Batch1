import java.util.*;
class Person
{
	private String name;
	private int age;

	public void in()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name: ");
		name=sc.nextLine();

		System.out.println("Enter the age: ");
		age=sc.nextInt();
	}
	public Person findElder(Person ob)
	{
		if(ob.age>age)
		return ob;
		else
			return this;
	}
	public void out()
	{
		System.out.println("Name : "+name+" \t Age: "+age);
	}
}
class PersonElder
{
	public static void main(String []args)
	{
		Person p1=new Person();
		p1.in();

		Person p2= new Person();
		p2.in();


		Person p3=p1.findElder(p2);
		System.out.println("Elder Person age is ");
		p3.out();
	}
}