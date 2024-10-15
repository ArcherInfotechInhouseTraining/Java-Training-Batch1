import java.util.Scanner;

class InputUsingScannerObject
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int x = 0;
		double y = 0.0;
		char ch = '#';

		System.out.println("Enter any string : ");
		str = sc.nextLine();

		System.out.println("Enter any int value : ");
		x = sc.nextInt();

		System.out.println("Enter any float value : ");
		y = sc.nextDouble();

		System.out.println("Enter any character : ");
		ch = sc.next().charAt(1);

		System.out.println("String :  "+str);
		System.out.println("Int :  "+x);
		System.out.println("double :  "+y);
		System.out.println("char :  "+ch);
	}
}