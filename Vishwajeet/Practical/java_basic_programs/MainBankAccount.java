class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String message)
	{
		super(message);
	}
}
class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void withdraw(double amount)throws NegativeBalanceException
	{
		if(balance - amount<0)
		{
			throw new NegativeBalanceException("Insufficient funds to withdraw "+amount+" rs");
		}
		else
		{
			balance -=amount;
		}
	}
}
class MainBankAccount
{
	public static void main(String []args)
	{
		BankAccount ba = new BankAccount(100);
		try
		{
			ba.withdraw(200);
		}
		catch (NegativeBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Remainning balance: "+ba.getBalance());
	}
}