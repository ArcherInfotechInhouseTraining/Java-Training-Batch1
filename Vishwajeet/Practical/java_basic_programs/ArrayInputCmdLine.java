class ArrayInputCmdLine {
	public static void main(String []args) {
		int []x= new int[args.length];
		
	for(int i=0;i<args.length;i++) {
		x[i]=Integer.parseInt(args[i]);
	}
	System.out.println("Array elements are: ");
	for(int i=0;i<x.length;i++) {
		System.out.print("  "+x[i]);
	}
	}
}