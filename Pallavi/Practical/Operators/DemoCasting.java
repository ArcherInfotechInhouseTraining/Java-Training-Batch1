import java.util.Scanner;
class DemoCasting
{
	public static void main(String []args)
	{
		int x=0,y=0;
		double z=0.0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value of x and y: ");
		x=s.nextInt();
		y=s.nextInt();

		z=x/y;
		System.out.println("z : "+z);

		z=x/(double)y;
		System.out.println("z : "+z);

		z=(double)x/y;
		System.out.println("z : "+z);

		z=(double)x/(double)y;
		System.out.println("z : "+z);
	}
}