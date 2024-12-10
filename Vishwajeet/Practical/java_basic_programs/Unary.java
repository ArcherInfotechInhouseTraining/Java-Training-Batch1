import java.util.Scanner;
class Unary {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		
		System.out.println("Enter the value of x,y and z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		System.out.println("x: "+x +  "\t y: "+y + "\t z: "+z);

		z=-x;
		x++;
		y--;
		System.out.println("x: "+x +  "\t y: "+y + "\t z: "+z);
	}
}

		
