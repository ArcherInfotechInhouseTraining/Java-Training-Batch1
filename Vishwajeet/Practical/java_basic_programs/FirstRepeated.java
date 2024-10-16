import java.util.Scanner;
class FirstRepeated {
	public static void main(String []args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count");
		int cnt=sc.nextInt();
		int []x=new int[cnt];
		System.out.println("Enter array elements:");
		for(int i=0;i<cnt;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<x.length;i++) {
			System.out.print(" "+x[i]);
		}
		int flg=0,i,j;
		
		for(i=0;i<x.length;i++) {
			for(j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					flg=1;
					System.out.println("\n First Repeated"+x[i]);
					break;
				}
			}
			if(flg==1){
				break;
			}
			
		}
		if(flg==0) {
			System.out.println("no repeated eleemtns found");
			}
	}
}

		