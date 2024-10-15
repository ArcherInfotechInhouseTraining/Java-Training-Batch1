import java.awt.*;
import java.awt.event.*;


class MyFrame4 extends Frame implements ActionListener
{

    Button button;

    public MyFrame4()
    {
        super("FileDialog Window");
        setSize(400, 300);
        setLayout(new FlowLayout());

        button = new Button("Open file dialog");
        button.addActionListener(this);

        add(button);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        FileDialog filedialog = new FileDialog(this, "select a file", FileDialog.LOAD);
        filedialog.setVisible(true);

        String directory = filedialog.getDirectory();
        String file = filedialog.getFile();

        if(file != null)
        {
            System.out.println("Selected file "+directory+" "+file);
        }
    }
    
}
public class FileDialogExample {
	public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
        mf.setVisible(true);
	}
}