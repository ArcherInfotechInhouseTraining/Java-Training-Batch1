class InvalidCredentialsException extends Exception 
{
    	public InvalidCredentialsException(String message) 
	{
        	super(message);
    	}
}
class Login
{
	private String username;
	private String password;

	public Login(String username,String password)throws InvalidCredentialsException
	{
		if(username==null || username.isEmpty())
		{
			throw new InvalidCredentialsException("Username cannot be null or empty");
		}
		if(password==null || password.isEmpty())
		{
			throw new InvalidCredentialsException("Password cannot be null or empty");
		}
		this.username=username;
		this.password=password;
	}
	public boolean validate()
	{
		return true;
	}
}
class MainLoginApplication
{
	public static void main(String []args)
	{
		try
		{
			Login login = new Login("","password");
		}
		catch (InvalidCredentialsException ex) 
		{
			System.out.println(ex.getMessage());
       	}

		try
		{
			Login login = new Login("username","");
		}
		catch (InvalidCredentialsException ex) 
		{
			System.out.println(ex.getMessage());
       	}

		try
		{
			Login login=new Login("username","password");
			if(login.validate())
			{
				System.out.println("Login Successful!");
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		catch (InvalidCredentialsException ex) 
		{
			System.out.println(ex.getMessage());
        }
	}	
}