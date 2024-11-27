package driverpack;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SplashScreen extends JWindow {
	private static final long serialVersionUID = 1L;
	private int duration;

    public SplashScreen(int d) {
        duration = d;
    }

    public void showSplash() {
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.white);

        // Set the window's bounds, position the window in the center of the screen
        int width = 450;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        // Build the splash screen
        JLabel label = new JLabel(new ImageIcon("img\\splash_image.png"));
        JLabel copyrt = new JLabel("Copyright 2024, Archer Infotech - Student Project", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(156, 20, 20, 255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));

        // Display it
        setVisible(true);

        // Wait a little while, maybe while loading resources
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(false);
    }

    public void showSplashAndExit() {
        showSplash();
       // System.exit(0);
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // Throw a nice little title page up on the screen first
        SplashScreen splash = new SplashScreen(5000);
        splash.showSplashAndExit();

        // Start the application's main window
        MainAppFrame app = new MainAppFrame();
        app.setVisible(true);
    }
}
