import java.awt.*;
import java.awt.event.*;



class MyFrame1 extends Frame implements ItemListener
{
    Choice choice;
    Label label;

    public MyFrame1()
    {
        super("Choice window");
        setSize(500 ,500);
        setLayout(new FlowLayout());

        choice = new Choice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");

        choice.addItemListener(this);

        label = new Label("Select a color");

        add(choice);
        add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        String selectedItem = choice.getSelectedItem();
        label.setText("Selected "+selectedItem);
    }

}
public class ChoiceExample {
public static void main(String[] args) {
    
    MyFrame1 mf = new MyFrame1();
    mf.setVisible(true);
}
}