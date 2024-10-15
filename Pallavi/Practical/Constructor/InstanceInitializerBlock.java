//Instance initializer block

public class InstanceInitializerBlock
{
    // Instance variable
    private int x;

    // Instance initializer block
    {
        System.out.println("Instance initializer block");
        x = 10; 
    }

    // Constructor
    public InstanceInitializerBlock() 
    {
        System.out.println("Constructor called");
    }

    public void displayX() 
    {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) 
    {
        InstanceInitializerBlock obj = new InstanceInitializerBlock();
        obj.displayX();
    }
}
