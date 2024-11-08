import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends Frame implements ActionListener
{
    List itemList;
    Button showSelection;

    public MyFrame5()
    {
        super("List Window");
        setSize(500,300);
        setLayout(new FlowLayout());

        itemList = new List(4, true);
        itemList.add("item-1");
        itemList.add("item-2");
        itemList.add("item-3");
        itemList.add("item-4");
        itemList.add("item-5");
        itemList.add("item-6");

        showSelection = new Button("Show Selection");

        showSelection.addActionListener(this);

        add(itemList);
        add(showSelection);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String[] selectedItems = itemList.getSelectedItems();
        System.out.println("Selected Items: ");

        for(String item : selectedItems)
        {
            System.out.println(item);
        }

    }

}
public class ListExample {
    public static void main(String[] args) {
    
        MyFrame5 mf = new MyFrame5();
        mf.setVisible(true);
    }
}