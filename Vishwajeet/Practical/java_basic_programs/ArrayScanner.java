import java.util.Scanner;
class ArrayScanner {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int []x=new int[5];
		System.out.println("Enter 5 elements");
		for(int i=0;i<5;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<5;i++) {
			System.out.print(" "+x[i]);
		}
	}
}