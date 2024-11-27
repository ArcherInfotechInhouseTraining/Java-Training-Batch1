import java.util.*;
class DemoWhilePrime {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		
		int d=2;
		int flg=0;
		while(d<=no/2) {
			if(no%d==0) {
				flg=1;
				break;
			}
			d++;
		}
		if(flg==0 && no!=1) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}
	}
}
			


	