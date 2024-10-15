
	// Example 3: User Defined exception in java for Validity of an Entity

class InvalidEntityException extends Exception
{
	public InvalidEntityException(String Message)
	{
		super(Message);
	}
}

class Entity 
{
	private String name;
	private int age;

	public Entity(String name,int age)throws InvalidEntityException
	{
		if(name==null || name.isEmpty())
		{
			throw new InvalidEntityException("name can not be null or empty...");
		}

		if(age<0)
		{
			throw new InvalidEntityException("age can not be negative...");
		}

		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
}
class  MainEntityCheck
{
	public static void main(String[] args) 
	{
		try
		{
			Entity ob = new Entity("",22);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

		try
		{
			Entity ob = new Entity("ABC",-21);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

		try
		{
			Entity ob = new Entity("XYZ",32);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
