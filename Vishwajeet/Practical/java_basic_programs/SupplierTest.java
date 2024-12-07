import java.util.function.Supplier;
class SupplierTest 
{
	public static void main(String[] args) 
	{
		Supplier<String> message = ()->"Hello!";
		System.out.println(message.get());
	}
}
