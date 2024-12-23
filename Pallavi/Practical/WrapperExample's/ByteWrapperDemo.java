class ByteWrapperDemo 
{
	public static void main(String[] args) 
	{
		//byte class fields
		System.out.println("Byte min value: "+Byte.MIN_VALUE);
		System.out.println("Byte max value: "+Byte.MAX_VALUE);
		System.out.println("Representing primitive type: "+Byte.TYPE);
		System.out.println("Space nedded in bytes: "+Byte.BYTES);
		System.out.println("Space nedded in bits: "+Byte.SIZE);

		//using byte class constructors
		Byte ob1 = new Byte((byte)10);
		byte b = 10;
		Byte ob2 = new Byte(b);
		Byte ob3 = new Byte("123");

		// Converting the value to different primitive type
		System.out.println("byte value: "+ob1.byteValue());
		System.out.println("short value: "+ob1.shortValue());
		System.out.println("int value: "+ob1.intValue());
		System.out.println("long value: "+ob1.longValue());

		float ft = ob1.floatValue();
		System.out.println("float value: "+ft);

		double db = ob1.doubleValue();
		System.out.println("double value: "+ob1.doubleValue());

		// using public int compareTo(Byte anotherByte)
		int t = ob1.compareTo(ob2);
		System.out.println("ob1 CompareTo ob2:  "+t);

		t = ob1.compareTo(ob3);
		System.out.println("ob1 CompareTo ob3: "+t);

		// using public boolean equals(Object obj):
		boolean ans = ob1.equals(ob2);
		System.out.println("ob1 is equals ob2: "+ans);

		ans = ob1.equals(ob3);
		System.out.println("ob1 is equals ob3: "+ans);

		// Using Parsing
		String num = "28";
		byte b1 = Byte.parseByte(num);
		System.out.println("b1 is: "+b1);

		// using toString()
		byte val1 = 56;
		String s = Byte.toString(val1);
		System.out.println("s is: "+s);

		String s1 = ob3.toString();
		System.out.println("String s1 is: "+s1);

		// using valueOf()
		byte val2 = 15;
		Byte ob4 = Byte.valueOf(val2);
		System.out.println("Ob4 is: "+ob4);

		String s2 = "52";
		Byte ob5 = Byte.valueOf(s2);
		System.out.println("ob5 is: "+ob5);


	}
}
