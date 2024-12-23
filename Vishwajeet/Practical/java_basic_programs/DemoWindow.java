import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	Button b1, b2, b3;

	Checkbox c1,c2,c3;

	CheckboxGroup cbg;

	Choice cl;
	
	Dialog d;

	FileDialog f;

	List list;

	Scrollbar sv, sh;

	TextArea t;

	TextField tf1, tf2, tf3, tf4;

	public MyFrame(){
		super("First Frame");
		setSize(900,800);
		setLayout(new FlowLayout());
		
		b1 = new Button("Red");
		b1.addActionListener(this);

		b2 = new Button("Green");
		b2.addActionListener(this);

		b3 = new Button("Blue");
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);

		c1 = new Checkbox("one");

		c2 = new Checkbox("two");

		c3 = new Checkbox("three");
		add(c1);
		add(c2);
		add(c3);

		setLayout(new GridLayout(3, 1));
		CheckboxGroup cbg = new CheckboxGroup();
		add(new Checkbox("one", cbg, true));
		add(new Checkbox("two", cbg, false));
		add(new Checkbox("three", cbg, false));

		Choice cl = new Choice();
		cl.add("Green");
		cl.add("Red");
		cl.add("Blue");
		add(cl);

		d = new Dialog(this, "Dialog");
        d.setVisible(true);

		f = new FileDialog(this, "File Dialog", FileDialog.LOAD);
		//f.setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		add(new Label("Hi Hello !"));
		add(new Label("Frame Label"));
    

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

		sv=new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 255);
		sv.setMinimum(0);
		sv.setMaximum(9);
		sv.setVisibleAmount(5);
		sv.setValue(10);
		add(sv);

		sh = new Scrollbar(Scrollbar.HORIZONTAL, 0, 60, 0, 300);
		add(sh);

		t = new TextArea("You can Text Here!!", 5, 40);
		add(t);

		tf1 = new TextField();
		// blank field of 20 columns
		tf2 = new TextField("", 20);
		 // predefined text displayed
		tf3 = new TextField("Hello!");
		// predefined text in 30 columns
		tf4 = new TextField("Hello", 30);

		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);

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

	public void actionPerformed(ActionEvent e){
		String str = ((Button)e.getSource()).getLabel();
		System.out.println(str+" Button Pressed");
	}
}
class DemoWindow
{
	 public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
	}
}
