
// Example 2: User Defined exception in java for Validating Login Credentials

class InvalidCredentialsException extends Exception
{
	public InvalidCredentialsException(String Message)
	{
		super(Message);
	}
}

class Login
{
	private String username;
	private String password;

	public Login(String username, String password) throws InvalidCredentialsException
	{
		if(username==null || username.isEmpty())
		{
			throw new InvalidCredentialsException("Username cannot be null or empty.");
		}

		if(password==null || password.isEmpty())
		{
			throw new InvalidCredentialsException("Password cannot be null or empty.");
		}
			
		this.username = username;
		this.password = password;
	}

	public boolean validate()
	{
		return true;
	}
}

class  MainLoginApplication
{
	public static void main(String[] args) 
	{
		try
		{
			Login login = new Login("","Password");
		}
		catch (InvalidCredentialsException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			Login login = new Login("Username","");
		}
		catch (InvalidCredentialsException e)
		{
			System.out.println(e.getMessage());
		}


		try
		{
			Login login = new Login("Username","Password");

			if(login.validate())
			{
				System.out.println("Login Successfully...");
			}
			else
			{
				System.out.println("Login Failed...");
			}
		}
		catch (InvalidCredentialsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
