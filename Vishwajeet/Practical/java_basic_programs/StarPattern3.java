class StarPattern3 {
public static void main(String []args) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<5+i;j++) {
				if(j<=(5-i)) {
					System.out.print(" ");
				}
				else {
				System.out.print(i);	
				}
			}
			System.out.print("\n");
		}
	}
}