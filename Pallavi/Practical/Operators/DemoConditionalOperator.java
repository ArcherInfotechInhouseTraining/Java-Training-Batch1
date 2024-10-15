import java.util.Scanner;
class DemoConditionalOperator
{
	public static void main(String args[])
	{
		int x,y;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x and y : ");
		x=sc.nextInt();
		y=sc.nextInt();

		int z = (x>y)?x:y;

		System.out.println(+z);
	}
}