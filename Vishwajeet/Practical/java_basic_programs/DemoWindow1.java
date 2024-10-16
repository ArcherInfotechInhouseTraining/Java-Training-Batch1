import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    Button b1, b2, b3;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;
    Choice ColorChooser;
    Dialog d;
    FileDialog f;
    List list;

    public MyFrame() {
        super("First Frame");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Buttons
        b1 = new Button("Red");
        b1.addActionListener(this);

        b2 = new Button("Green");
        b2.addActionListener(this);

        b3 = new Button("Blue");
        b3.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);

        // Checkboxes
        c1 = new Checkbox("one");
        c2 = new Checkbox("two");
        c3 = new Checkbox("three");
        add(c1);
        add(c2);
        add(c3);

        cbg = new CheckboxGroup();
        add(new Checkbox("one", cbg, true));
        add(new Checkbox("two", cbg, false));
        add(new Checkbox("three", cbg, false));

        // Choice
        ColorChooser = new Choice();
        ColorChooser.add("Green");
        ColorChooser.add("Red");
        ColorChooser.add("Blue");
        add(ColorChooser);

        // Dialog and FileDialog
        d = new Dialog(this, "Dialog");
        f = new FileDialog(this, "File Dialog", FileDialog.LOAD);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        add(new Label("Hi Hello !"));
        add(new Label("Frame Label"));

        // List
        list = new List(4, false);
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        add(list);

        // Menu
        MenuBar mb = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        mb.add(fileMenu);

        Menu editMenu = new Menu("Edit");
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        mb.add(editMenu);

        setMenuBar(mb);
    }

    public void actionPerformed(ActionEvent e) {
        String str = ((Button) e.getSource()).getLabel();
        System.out.println(str + " Button Pressed");
    }
}

class DemoWindow1 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
    }
}
