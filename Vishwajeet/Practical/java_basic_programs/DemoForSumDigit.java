import javax.swing.JOptionPane;
class DemoForSumDigit {
	public static void main(String []args) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
		int tot=0,t=0;	
		for(t=no;no!=0;no=no/10) {
			 tot = tot+(no%10);
		}
		System.out.println("Total of "+t+" is "+tot);
	}
}