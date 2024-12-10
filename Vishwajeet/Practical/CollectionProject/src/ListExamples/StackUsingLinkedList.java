package ListExamples;
import java.util.LinkedList;
import java.util.Scanner;
public class StackUsingLinkedList {
	public static void main(String[] args) {
		LinkedList <Integer>l1=new LinkedList<>();
		

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("-------MENU------------");
			System.out.println("1.Push \n 2.Pop \n 3.Display \n 4.Stop");
			System.out.println("Enter your option");
			int opt=sc.nextInt();
			switch(opt){
				case 1:
					System.out.println("Enter int value");
					l1.push(sc.nextInt());
					break;

				case 2:
					if(!l1.isEmpty()){
						System.out.println("pop()value: "+l1.pop());
					}
					else{
						System.out.println("Stack is empty");
					}
					break;

				case 3:
					System.out.println("Stack elements are: ");
					for(Integer element : l1){
						System.out.println(element);
					}
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}

