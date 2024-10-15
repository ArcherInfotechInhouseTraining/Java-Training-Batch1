import java.util.Scanner;
class DemoUnary
{
	public static void main(String []ar)
	{		
		int x=0;
		int y=0;
		int z=0;

		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();

		System.out.println("x: "+x+"\t y: "+y );

		z=-x;
		x--;
		++y;

		System.out.println("x: "+x+"\t y: "+y+"\t z: "+z);

		z=++x+y++;
		
		System.out.println("z: "+z);
		
	}
}