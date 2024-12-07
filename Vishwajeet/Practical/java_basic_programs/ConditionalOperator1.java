import java.util.Scanner;
class ConditionalOperator1 {
	public static void main(String []args) {
		int x=0,y=0,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		
		
		max=(x>y)?x:y;
		System.out.println("Max: "+max);
	}
}
