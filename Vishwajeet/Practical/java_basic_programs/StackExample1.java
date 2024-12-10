import java.util.Stack;
import java.util.*;
class StackExample1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("\n ------------Menu-----------");
			System.out.println(" 1.Push \n 2.Pop \n 3.Stop");
			System.out.println("Enter your option: ");
			int opt = sc.nextInt();

			switch(opt)
			{
				case 1: 
					System.out.println("Enter int value: ");
					stack.push(sc.nextInt());
					break;
				case 2:
					if(!(stack.empty()))
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
	}
}
