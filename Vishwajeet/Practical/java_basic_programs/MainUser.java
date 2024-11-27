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
		if(age<0)
		{
			throw new InvalidAgeException("Age is cannot be negative");
		}
		if(age>150)
		{
			throw new InvalidAgeException("Age is more");
		}
		this.age=age;
	}
}
class MainUser
{
	public static void main(String []args)
	{
		try
		{
			User u =new User(-1);
		}
		catch (InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
		try
		{
			User u =new User(151);
		}
		catch (InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
		try
		{
			User u =new User(23);
			System.out.println("Age is valid");
		}
		catch (InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}