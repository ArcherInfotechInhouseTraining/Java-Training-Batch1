import javax.swing.JOptionPane;
class ArrayInputDialog
{
	public static void main(String []args)
	{
		int cnt=0;
	
		System.out.println("Enter the Element count: ");
		cnt=Integer.parseInt(JOptionPane.showInputDialog("Enter your cnt "));

		int []x=new int[cnt];

		System.out.println("\n Enter the "+cnt+" nos: ");
		for(int i=0;i<cnt;i++)
		{
			x[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter any integer"));
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}
	}
}
