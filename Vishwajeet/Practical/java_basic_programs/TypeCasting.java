import java.util.Scanner;
class TypeCasting {
	public static void main(String []args) {
		int x=0,y=0;
		double z=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		z=x/y;
		System.out.println("x: "+x +"\t y: "+y+"\t z: "+z);
		
		z=(double)x/y;
		System.out.println("x: "+x +"\t y: "+y+"\t z: "+z);

		z=x/(double)y;
		System.out.println("x: "+x +"\t y: "+y+"\t z: "+z);

		z=(double)x/(double)y;
		System.out.println("x: "+x +"\t y: "+y+"\t z: "+z);
	}
}

	