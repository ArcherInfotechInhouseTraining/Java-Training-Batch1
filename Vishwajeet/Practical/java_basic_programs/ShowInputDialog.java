import javax.swing.JOptionPane;
class ShowInputDialog {
	public static void main(String []args) {
		int x=0;
		double y=0.0;
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter int value "));
		y=Double.parseDouble(JOptionPane.showInputDialog("Enter fractional value "));

		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
}
		