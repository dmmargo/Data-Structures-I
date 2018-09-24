//Diane Margo
//CS240 
//Assignment 2 
//05/03/2018
public class TaskDDemo {
	public static void main(String [] args) {
		StackInterface<String> myStack = new ArrayStack<String>();
		
		int stackSize = 0;

		myStack.push("Amy");
		stackSize++;
		myStack.push("Mary");
		stackSize++;
		myStack.push("Soup");
		stackSize++;
	
		while(stackSize!=0)
		{
			myStack.display();
			stackSize--;
		}

	}
}
