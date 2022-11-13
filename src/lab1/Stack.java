package lab1;

public class Stack {
	private int stack[];
	private int top;
	private int size;
	// Constructor
	public Stack(int size) {
		stack= new int[size];
		this.top=-1;
		this.size=size;
	}
	
	//getters and setters method 
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	//is under flow 
	boolean isUnderFlow()
	{
		if(this.top==-1)
		{
			return true;
		}
		return false;
	}
	
	//is overflow
	boolean isOverFlow()
	{
		if(this.top>=size-1)
		{
			return true;
		}
		return false;	
	}
	
	//push function
	void push(int element)
	{
		if(this.isOverFlow())
		{
			System.out.println("The Stack is full");
		}
		else
		{
			this.top++;
			stack[top]=element;
			System.out.println("Insertion is sucessfull");
		}
	}
	
	//pop
	int pop()
	{
		int deletedElement;
		if(this.isUnderFlow())
		{
			System.out.println("Under Flow");
			deletedElement=999;
		}
		else
		{
			deletedElement=stack[this.top];
			this.top--;
			System.out.println("Deletion sucessfull");

		}
		return deletedElement;
	}
	
	//display
	void display()
	{
		if(isUnderFlow())
		{
			System.out.println("No elements to display");
		}
		else
		{
			System.out.println("Stack elements are :");
			for(int i=0;i<=top;i++)
			{
				System.out.print("\t");
				System.out.print(stack[i]);
			}
		}
	}
	
}
