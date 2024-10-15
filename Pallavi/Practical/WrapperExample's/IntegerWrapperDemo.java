class IntegerWrapperDemo 
{
	public static void main(String[] args) 
	{
		//byte class fields

		System.out.println("Integer max value: "+Integer.MAX_VALUE);
		System.out.println("Integer min value: "+Integer.MIN_VALUE);
		System.out.println("Space Needed in bytes: "+Integer.BYTES);
		System.out.println("Space Needed in bits: "+Integer.SIZE);
		System.out.println("Representing primitive type: "+Integer.TYPE);

		//using integer class constructors
		Integer ob1 = new Integer(10);
		int i =  10;
		Integer ob2 = new Integer(i);
		Integer ob3 = new Integer("123");

		// Converting the value to different primitive type
		System.out.println("Converting into byte value: "+ob1.byteValue());
		System.out.println("Converting into int value: "+ob1.intValue());
		System.out.println("Converting into short value: "+ob1.shortValue());
		System.out.println("Converting into long value: "+ob1.longValue());

		float ft = ob1.floatValue();
		System.out.println("Converting into float value: "+ft);

		double db = ob1.doubleValue();
		System.out.println("Converting into double value: "+db);

		// using public int compareTo
		int t = ob1.compareTo(ob2);
		System.out.println("ob1 compare to ob2: "+t);

		t = ob1.compareTo(ob3);
		System.out.println("ob1 compare to ob3: "+t);

		// using public boolean equals(Object obj):
		boolean ans = ob1.equals(ob2);
		System.out.println("ob1 equal to ob2: "+ans);

		ans = ob1.equals(ob3);
		System.out.println("ob1 qeual to ob3: "+ans);

		// Using Parsing
		String num = "123";
		int n = Integer.parseInt(num);
		System.out.println("Integer n: "+n);

		//Using TOString
		int val = 789;
		String s1 = Integer.toString(val);
		System.out.println("String s1 is: "+s1);

		// using valueOf()
		String s2 = "52";
		Integer ob5 = Integer.valueOf(s2);
		System.out.println("String s2 is: "+s2);
	}
}
