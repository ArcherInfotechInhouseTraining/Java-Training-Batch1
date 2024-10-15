package driverpack;

import source.MainFrame;

public class MainProject {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		MainFrame frame = new MainFrame("Person Application");
		frame.setVisible(true);
	}

}
