import javax.swing.JOptionPane;
class InputUsingShowInDialog
{
	public static void main(String args[])
	{
		int x=0;
		double y=0.0;

		x=Integer.parseInt(JOptionPane.showInputDialog("Enter any int value: "));
		y=Double.parseDouble(JOptionPane.showInputDialog("Enter any double value: "));

		System.out.println("int value : "+x);
		System.out.println("double value: "+y);
	}
}
