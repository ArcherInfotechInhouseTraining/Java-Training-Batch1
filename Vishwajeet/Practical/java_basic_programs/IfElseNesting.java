class IfElseNesting {
	public static void main(String []args) {

		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int z= Integer.parseInt(args[2]);

		if(x>y) {
			if(x>z) {
			System.out.println(+x+" is Max");
			}
			else {
			System.out.println(+z+" is Max");
			}
		}
		else   {
			if(y>z) {
			System.out.println(+y+" is Max");
			}
			else {
			System.out.println(+z+" is Max");
			}
		}
	}
}

			
			
		
		
		