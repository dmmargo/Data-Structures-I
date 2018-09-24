//Diane Margo
//CS240 
//Assignment 2 
//05/03/2018
public class TaskADemo {
	public static void main(String[] args) {
	
		StackInterface<String> myStack = new ArrayStack<String>();
		StackInterface<String> newStack = new ArrayStack<String>();
		
	
		myStack.push("Amy");
		myStack.push("Mary");
		myStack.push("Soup");
		
		
		while(!myStack.isEmpty())
		{
			newStack.push(myStack.pop());
			
		}
		while(!newStack.isEmpty())
		{
			System.out.println("item deleted: " + newStack.pop());
		}
		
	}
	
}