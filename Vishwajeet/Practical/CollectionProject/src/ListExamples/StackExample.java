package ListExamples;
import java.util.Stack;
import java.util.Scanner;
class StackExample 
{
	public static void main(String[] args) 
	{
		Stack <Integer>stack=new Stack<>();
		System.out.println("Size of stack: "+stack.size()+"Capacity of stack: "+stack.capacity());

		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("-------MENU------------");
			System.out.println("1.Push \n 2.Pop \n 3.Display \n 4.Stop");
			System.out.println("Enter your option");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.println("Enter int value");
					stack.push(sc.nextInt());
					break;

				case 2:
					if(!stack.empty())
					{
						System.out.println("pop()value: "+stack.pop());
					}
					else
					{
						System.out.println("Stack is empty");
					}
					break;

				case 3:
					System.out.println("Stack elements are: ");
					for(Integer element : stack)
					{
						System.out.println(element);
					}
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}

