abstract class Anonymous
{
	public abstract void mymethod();
}
class AnonymousInnerDemo 
{
	public static void main(String[] args) 
	{
		Anonymous inner = new Anonymous(){
		public void mymethod(){
			System.out.println("In the method of Anonymous inner class");
		}};
		inner.mymethod();
	}
}
