import java.util.Stack;
import java.util.Scanner;
class StackExample 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		System.out.println("Size of stack: "+stack.size()+"\t Capacity of stack: "+stack.capacity());

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("---------- MENU -------------");
			System.out.println("1.Push \t 2.Pop \t 3.Stop");
			System.out.println("Enter your option: ");
			int opt = sc.nextInt();

			switch(opt)
			{
				case 1:
					try
					{
						System.out.println("Enter any int value: ");
						stack.push(sc.nextInt());
					}
					catch (Exception e)
					{
						System.out.println("Enter only int value");
					}
					break;

				case 2:
					if(!stack.empty())
					{
						
						System.out.println("pop() value: "+stack.pop());
					}
					else
					{
						System.out.println("Stack is empty");
					}
					break;
				case 3:
					
					System.exit(0);
			}
		}
		System.out.println("peek(): "+stack.peek());
	}
}
