import javax.swing.JOptionPane;
class ArrayInputDialog {
	public static void main(String []args) {
		int cnt = Integer.parseInt(JOptionPane.showInputDialog("Enter Count"));
		int []x= new int[cnt];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<cnt;i++) {
			x[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter any int number"));
		}
		System.out.println("Array elemtns are");
		for(int i=0;i<x.length;i++) {
			System.out.print(" "+x[i]);
		}
	}
}
