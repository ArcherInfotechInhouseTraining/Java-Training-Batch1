import java.util.Scanner;
class DemoConditionalOperator1
{
	public static void main(String args[])
	{
		int x,y,z;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x , y and z: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();

		int max = (x>y) ? (x>z?x:z) : (y>z?y:z);

		System.out.println("Max is : "+max);
	}
}