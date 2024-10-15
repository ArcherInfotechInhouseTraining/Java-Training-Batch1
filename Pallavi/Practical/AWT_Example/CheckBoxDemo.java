import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	Checkbox c1, c2, c3;

	public MyFrame()
	{
		super("Second Frame");
		setSize(400,300);
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(3 ,1));

		c1 = new Checkbox("checkBox-1");
		c1.addItemListener(this);

		c2 = new Checkbox("checkBox-2");
		c2.addItemListener(this);

		c3 = new Checkbox("checkBox-3");
		c3.addItemListener(this);

		add(c1);
		add(c2);
		add(c3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox checkbox = (Checkbox) e.getItemSelectable();
        String status = checkbox.getLabel() + " is " + (checkbox.getState() ? "selected" : "deselected");
        System.out.println(status);
    }

} 
public class CheckBoxDemo {

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
		mf.setVisible(true);
    }
}