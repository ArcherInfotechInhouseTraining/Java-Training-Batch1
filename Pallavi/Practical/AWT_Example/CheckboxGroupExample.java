import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    CheckboxGroup group;
    Checkbox  checkbox1 ,checkbox2 ,checkbox3;
    // Lable lable;

    public MyFrame()
    {
        super("Checkbox window");
        setSize(400 ,300);
        setLayout(new FlowLayout());

        group = new CheckboxGroup();

        checkbox1 = new Checkbox("option - 1" ,group ,false);
        checkbox2 = new Checkbox("option - 2" ,group ,false);
        checkbox3 = new Checkbox("option - 3" ,group ,false);

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);

        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox selectedCheckBox = group.getSelectedCheckbox();
        String status = selectedCheckBox.getLabel() + " is " + (selectedCheckBox.getState() ? "selected" : "deselected");
        System.out.println(status);

        if( selectedCheckBox != null)
        {
            System.out.println(selectedCheckBox+" selected");
        }
    }

}
public class CheckboxGroupExample {
public static void main(String[] args) {
    
    MyFrame mf = new MyFrame();
    mf.setVisible(true);
}
}