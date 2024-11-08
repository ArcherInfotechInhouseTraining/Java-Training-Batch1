//Example 1: In this example, we have created a custom exception class NegativeBalanceException,
//which extends Exception, as well as a class BankAccount, which includes a withdrawal method.
//If the balance is less than the amount withdrawn, an instance of NegativeBalanceException
//with an error message is thrown. The exception is then caught and the error message is printed
//in the main method.


class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String Message)
	{
		super(Message);
	}
}

class BankAccount
{
	private double balance;

	public BankAccount(double balance)
	{
		this.balance = balance;
	}

	public double getBalance()
	{
		return balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException
	{
		if(balance - amount < 0)
		{
			throw new NegativeBalanceException("Insufficient funds to withdraw " + amount + " rs.");
		}
		else
		{
			balance -= amount;
		}
	}
}

class  BankAccountException
{
	public static void main(String[] args) 
	{
		BankAccount ob = new BankAccount(100);

		try
		{
			ob.withdraw(20);
		}
		catch (NegativeBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println("Final amount is: "+ob.getBalance());
	}
}
