import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements ActionListener
{
    private Dialog  dialog;
    private Button openDialogButton;

    public MyFrame3()
    {
          // Set the title of the frame
        super("Dialog Window");

         // Set the size of the frame
        setSize(400,300);

        // Set the layout for the frame
        setLayout(new FlowLayout());

        // Create a button to open the dialog
        openDialogButton = new Button("dialog button");
        openDialogButton.addActionListener(this);

        // Add the button to the frame
        add(openDialogButton);

         // Create a dialog
        dialog = new Dialog(this, "My Dialog", true);
        dialog.setSize(200, 150);
        dialog.setLayout(new FlowLayout());

        // Add a label and a button to the dialog
        Label dialogLabel = new Label("this is a dialog");
        dialog.add(dialogLabel);

        Button closeButton = new Button("close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                dialog.setVisible(false);
            }
        });
        dialog.add(closeButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        dialog.setVisible(true);
    }

}
public class DialogExample {
public static void main(String[] args) {
    MyFrame3 mf = new MyFrame3();
    mf.setVisible(true);
}
}