public class InputConsole {
    public static void main(String[] args)
    {
        // Using Console to input data from user
		System.out.println("Enter any string ");
        String x = System.console().readLine();
        System.out.println("You entered string " + x);

		int y=200;
		System.out.println("\n (y>>2) is"+ (y>>2) );
		System.out.println("\n (y>>>2) is"+ (y>>>2) );
    }
}