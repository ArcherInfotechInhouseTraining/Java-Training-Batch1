@FunctionalInterface
interface MathOperation
{
	//Abstract method
	public double operate(double a, double b);
}
class FunctionalInterfaceExample2
{
	public static void main(String[] args) 
	{
		MathOperation ob = (a,b)->{return a+b;};
		double result = ob.operate(10,20);
		System.out.println("Result: "+result);
	}
}