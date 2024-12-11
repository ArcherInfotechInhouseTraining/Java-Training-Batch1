public class BooleanWrapperExample 
{
	public static void main(String[] args) 
	{
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");

		System.out.println("b1: "+b1+"\t b2: "+b2);

		//logical AND
		System.out.println(Boolean.logicalAnd(b1,b2));
		System.out.println(Boolean.logicalAnd(false,true));
		System.out.println(Boolean.logicalAnd(b1,true));
		System.out.println(Boolean.logicalAnd(false,b2));
		System.out.println("--------------------------------------");

		//logical OR
		System.out.println(Boolean.logicalOr(b1,b2));
		System.out.println(Boolean.logicalOr(false,true));
		System.out.println(Boolean.logicalOr(b1,true));
		System.out.println(Boolean.logicalOr(false,b2));
		System.out.println("--------------------------------------");

		//logical XOR
		System.out.println(Boolean.logicalXor(b1,b2));
		System.out.println(Boolean.logicalXor(false,true));
		System.out.println(Boolean.logicalXor(b1,true));
		System.out.println(Boolean.logicalXor(false,b2));
		System.out.println("--------------------------------------");
	}
}
