public class CharacterMethodsDemo 
{
	public static void main(String[] args) 
	{
		//character methods demo
		char ch = 'A';
		char ch = 'a';
		
		//is letter
		System.out.println("is letter('A'): "+Character.isLetter(ch));

		//is digit
		System.out.println("is digit('5'): "+Character.isDigit(ch));

		//is whitespace
		System.out.println("is whitespaces(' '): "+Character.isWhitespace(' '));

		//is uppercase
		System.out.println("is uppercase('A'): "+Character.isUpperCase(ch));

		//is lowercase
		System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch));

		//touppercase
		System.out.println("touppercase('a'): "+Character.toUpperCase(ch));

		//to lowercase
		System.out.println("toLowerCase('A'): " + Character.toLowerCase('A'));

		// getNumericValue
        System.out.println("getNumericValue('5'): " + Character.getNumericValue('5'));

        // compare
        System.out.println("compare('A', 'B'): " + Character.compare('A', 'B'));

        // toString
        System.out.println("toString('C'): " + Character.toString('C'));


	}
}
