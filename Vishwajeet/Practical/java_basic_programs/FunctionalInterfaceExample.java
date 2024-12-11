@FunctionalInterface
interface Message
{
	public void printMessage(int x,double y);
}
class FunctionalInterfaceExample 
{
	public static void main(String[] args) 
	{
		Message ob = (x,y)->System.out.println("Functional Interface value: "+x+" \t "+y);
		ob.printMessage(10,20.4567);	
	}
}
