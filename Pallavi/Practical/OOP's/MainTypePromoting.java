

/// Example of Method Overloading with TypePromotion:

class Addition
{
	static int add(int a, int b)
	{
		System.out.println("int-int : ");
		return (a+b);
	}

	static float add(float a, int b)
	{
		System.out.println("float-int : ");
		return (a+b);
	}

	static double add(double a, int b)
	{
		System.out.println("double-int : ");
		return (a+b);
	}
}

class MainTypePromoting 
{
	public static void main(String[] args) 
	{
		Addition a = new Addition();

		System.out.println("int-int : "+a.add(2.2,3));
		
		System.out.println("float-int : "+a.add(2.2f,2));
		
		System.out.println("double-int : "+a.add(2.22,2));
	}
}
