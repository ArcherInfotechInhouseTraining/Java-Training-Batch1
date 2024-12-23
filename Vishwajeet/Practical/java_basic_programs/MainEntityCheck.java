class InvalidEntityException extends Exception
{
	public InvalidEntityException(String message)
	{
		super(message);
	}
}
class Entity
{
	private String nm;
	private int age;

	public Entity(String nm,int age)throws InvalidEntityException
	{
		if(nm==null || nm.isEmpty())
		{
			throw new InvalidEntityException("Name cannot be null or empty");
		}
		if(age<0)
		{
			throw new InvalidEntityException("Age cannot be negative");
		}
		this.nm=nm;
		this.age=age;
	}
	public String getName()
	{
		return nm;
	}
	public int getAge()
	{
		return age;
	}
}
class MainEntityCheck
{
	public static void main(String []args)
	{
		try
		{
			Entity e = new Entity("Vishwajit",-23);
		}
		catch (InvalidEntityException ex) 
		{
			System.out.println(ex.getMessage());
        }
		try
		{
			Entity e = new Entity("",25);
		}
		catch (InvalidEntityException ex) 
		{
			System.out.println(ex.getMessage());
        }
		try
		{
			Entity e = new Entity("Vishwajeet",23);
			System.out.println("Name: "+e.getName());
			System.out.println("Age: "+e.getAge());
		}
		catch (InvalidEntityException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}


