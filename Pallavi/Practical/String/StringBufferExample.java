
class StringBufferExample 
{
	public static void main(String[] args) 
	{
		//constructors
		StringBuffer str1 = new StringBuffer();
		System.out.println(str1);

		StringBuffer str2 = new StringBuffer("Hello all");
		System.out.println(str2);
		System.out.println("-------------------------------");

		//Methods

		//append()

		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("By");
		System.out.println("append on s1(using string): "+s1.append(" all"));
		System.out.println("append on s1(using character): "+s1.append('A'));
		System.out.println("append on s1(using int): "+s1.append( 3));
		System.out.println("append on s1(using double): "+s1.append(s2));
		System.out.println("---------------------------------------------");

		//capacity()
		System.out.println("Capacity of s2: "+s2.capacity());
		
		//charAt()
		String s3 = "good day to all";
		System.out.println("charAt() for s3 at 3: "+s3.charAt(3));

		//codePointAt()
		System.out.println("codePointAt() for s3 at 3: "+s3.codePointAt(3));

		//codePointBefore()
		System.out.println("codePointBefore() for s3 at 2 : "+s3.codePointBefore(2));
		System.out.println("codePointBefore() for s3 at 3 : "+s3.codePointBefore(3));
		System.out.println("codePointBefore() for s3 at 4 : "+s3.codePointBefore(4));

		//codePointCount()
		System.out.println("codePointCount() for s3 from 2 to 7 : "+s3.codePointCount(2,7));

		//delete()
		System.out.println("delete from s1 : "+s1.delete(5,11));

		//deleteCharAt()
		System.out.println("deleteCharAt() from s1: "+s1.deleteCharAt(6));

		//ensureCapacity(int minimumCapacity)
		//System.out.println(" from s1: "+s1.ensureCapacity(2));

		//indexOf()
		System.out.println("indexOf() s3: "+s3.indexOf("all"));

		//insert(int offset, String str)
		StringBuffer s4 = new StringBuffer("Good Day");
		s4.insert(3,"mgh");
		System.out.println("String s4: "+s4);

		s4.setCharAt(0,'A');
		s4.setCharAt(5,'G');

		System.out.println("String s4: "+s4);
		System.out.println("Default capacity of s4: "+s4.capacity());

		s4.trimToSize();
		System.out.println("After trim size capacity of s4: "+s4.capacity());

		StringBuffer s5 = s4.delete(2,6);
		System.out.println("String  s5: "+s5);

		char c[] = new char[100];
		s3.getChars(2,8,c,0);
		String t = new String(c);
		System.out.println("gained characters: "+t);
	}
}
