class A
{
    int x;
    public A()
    {
        System.out.println("In Parent constructor.");
        x = 10;
    }
    public void show()
    {
        System.out.println("In A "+x);
    }

}
class B extends A
{
    int y;
    public B()
    {
        //super();
        y=20;
    }
    public void show()
    {
        super.show();
        System.out.println("In B "+y);
    }
}
public class Demo {
public static void main(String[] args) {
    System.out.println("Hello");

    B b = new B();
    b.show();
}
}