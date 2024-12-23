class CharacterMethodsDemo 
{
	public static void main(String[] args) 
	{
		char ch = 'A';

		//isLowerCase(char ch)
		System.out.println(" "+ch+" is lower case: "+Character.isLowerCase(ch));

		//isUpperCase(char ch)
		System.out.println(" "+ch+" is upper case: "+Character.isUpperCase(ch));

		//toString
		System.out.println("toString: "+Character.toString(ch));

		//isLetter
		System.out.println(" is Letter: "+Character.isLetter(ch));

		//isDigit
		System.out.println("is Digit: "+Character.isDigit(ch));

		//isWhiteSpace
		System.out.println("is WhiteSpace: "+Character.isWhitespace(ch));

		//toUppercase
		System.out.println("toUppercase: "+Character.toUpperCase(ch));

		//toLowercase
		System.out.println("toLowercase: "+Character.toLowerCase(ch));

		//getNumericValue
		System.out.println("getNumericValue of "+ch+": "+Character.getNumericValue(ch));
		System.out.println("getNumericValue of 'Z': "+Character.getNumericValue('Z'));

		//Compare
		System.out.println("Compare('A','B'): "+Character.compare('A','B'));
	}
}
