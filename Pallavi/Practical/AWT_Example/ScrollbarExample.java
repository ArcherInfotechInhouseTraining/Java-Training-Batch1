import java.awt.*;
import java.awt.event.*;

/*
class MyFrame6 extends Frame implements AdjustmentListener
{
    private Label label;
    private Scrollbar scrollbar;

    public MyFrame6()
    {
        super("Scorllbar Window");
        setSize(400, 300);
        setLayout(new FlowLayout());

        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        
        scrollbar.addAdjustmentListener(this);

        label = new Label("Scrollbar value: 0");

        add(scrollbar);
        add(label);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int value = scrollbar.getValue();
        label.setText("Scrollbal value: "+value);
    }

}
public class ScrollbarExample {
    public static void main(String[] args) {
        MyFrame6 mf = new MyFrame6();
        mf.setVisible(true);
    }
}
*/
//============================================================================
//Vertical Scrollbar

class MyFrame6 extends Frame implements AdjustmentListener
{
    private Label label;
    private Scrollbar scrollbar;

    public MyFrame6()
    {
        super("Scorllbar Window");
        setSize(400, 300);
        setLayout(new FlowLayout());

        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);
        
        scrollbar.addAdjustmentListener(this);

        label = new Label("Scrollbar value: 0");

        add(scrollbar);
        add(label);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int value = scrollbar.getValue();
        label.setText("Scrollbal value: "+value);
    }

}
public class ScrollbarExample {
    public static void main(String[] args) {
        MyFrame6 mf = new MyFrame6();
        mf.setVisible(true);
    }
}