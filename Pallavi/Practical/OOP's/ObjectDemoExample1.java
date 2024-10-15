class MyException extends Exception 
{
	String exp_info;

	public MyException(String t)
	{
		exp_info=t;
	}

	public String toString()
	{
		return exp_info;
	}
}
class ObjectDemoExample1
{
	public static void main(String[] args) 
	{
		MyException ob = new MyException("Exception Information");
		System.out.println("Object Information: "+ob);
	}
}
