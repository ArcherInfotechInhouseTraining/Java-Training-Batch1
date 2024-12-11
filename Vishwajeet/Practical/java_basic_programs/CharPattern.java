class CharPattern {
public static void main(String []args) {
		int i,j;
		char ch;
		for(i=0;i<5;i++) {
		ch='A';
			for(j=0;j<5+i;j++) {
				if(j<=(5-i)) {
					System.out.print(" ");
				}
				else {
				System.out.print(ch);
				ch++;	
				}
			}
			System.out.print("\n");
		}
	}
}