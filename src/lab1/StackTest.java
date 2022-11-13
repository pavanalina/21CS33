package lab1;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		int choice=0,size,newElement,deletedElement;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		size=input.nextInt();
		
		Stack myStack=new Stack(size);
		while(choice!=4)
		{
			System.out.println("\n 1.PUSH \n 2.POP \n 3.DISPLAY \n 4.EXIT");
			System.out.println("Enter your Choice:");
			choice=input.nextInt();
			switch(choice)
			{
			case 1: System.out.println("New Element:");
					newElement=input.nextInt();
					myStack.push(newElement);
					break;
			case 2: deletedElement=myStack.pop();
					break;
			case 3: myStack.display();
					break;
			}
			
		}
		
	}

}
