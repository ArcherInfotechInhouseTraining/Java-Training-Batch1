import java.util.Scanner;
class ConditionalOperator2 {
	public static void main(String []args) {
		int x=0,y=0,z=0,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the x and y and z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		max=(x>y)?x:(y>z)?y:z;
		System.out.println("Max: "+max);
	}
}