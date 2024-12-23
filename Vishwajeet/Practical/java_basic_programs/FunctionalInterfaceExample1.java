@FunctionalInterface
interface MathOperation
{
	//Abstract method
	public double operate(double a, double b);

	//default method
	default void displayResult(double result){
		System.out.println("Result: "+result);
	}

	static void displayMessage(){
		System.out.println("Performing math operation");
	}

}
class Calculation implements MathOperation
{
	@Override
		public double operate(double a , double b){
		double sum = a+b;
		return sum;
	}

}
class FunctionalInterfaceExample1 
{
	public static void main(String[] args) 
	{
		Calculation addition = new Calculation();
		double result = addition.operate(10,20);
		addition.displayResult(result);
		MathOperation.displayMessage();
	}
}
