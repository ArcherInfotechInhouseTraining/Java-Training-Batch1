
	// Example 4: User Defined exception in java for Validating the age of user

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

class MainInvalidAgeException
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
