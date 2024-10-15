class ObDemo
{
	public void display()
	{
		System.out.println("ObDemo Display: ");
	}
}
class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Object ob = new Object();
		System.out.println("Ob prints: "+ob);
		System.out.println("Ob prints: "+ob.toString());

		ObDemo ob1 = new ObDemo();
		System.out.println("Ob prints: "+ob);
	}
}
