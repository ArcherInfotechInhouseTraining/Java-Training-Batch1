import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

class MyFrame7 extends Frame implements ActionListener
{
    TextArea textArea;
    TextField textField;

    Button button1, button2;

    public MyFrame7()
    {
        super("TextArea Window");
        setSize(400, 300);
        setLayout(new FlowLayout());

        textField = new TextField(20);
        button2 = new Button("submit2");
        button2.addActionListener(this);

        textArea = new TextArea(5, 30);
        button1 = new Button("submit");
        button1.addActionListener(this);
        

        add(textField);
        add(button2);
        add(textArea);
        add(button1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText();
        System.out.println("Entered textField: "+inputText);
        String txt = textArea.getText();
        System.out.println("Text Entered "+txt);

    }

}
public class TextAreaExample {
    public static void main(String[] args) {
        MyFrame7  mf = new MyFrame7();
        mf.setVisible(true);
    }

}