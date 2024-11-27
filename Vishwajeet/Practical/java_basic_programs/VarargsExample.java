class VarargsExample 
{
	static void display(String... values)
	{
		System.out.println("Number of arguments: "+ values.length);
		for(String s:values)
		{
			System.out.println(s);
		}
	}
	

	public static void main(String[] args) 
	{
		display();
		System.out.println();
		display("Hello");
		System.out.println();
		display("Hello","how","are","you");
		System.out.println();
		
	}
}
