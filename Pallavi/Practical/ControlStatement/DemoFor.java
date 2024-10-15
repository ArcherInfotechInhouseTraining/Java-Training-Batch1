import javax.swing.JOptionPane;
class DemoFor
{
	public static void main(String args[])
	{
		int t=0,tot=0;
		int no=Integer.parseInt(JOptionPane.showInputDialog("Enter any number : "));

		for(t=no;no!=0;no=no/10)
		{
			tot=tot+(no%10);
		}
		System.out.println("Addition of all digits from"+t+" is "+tot);
	}

}