//Diane Margo
//CS240 
//Assignment 2 
//05/03/2018
public class TaskCDemo {

	public static void main(String[] args) {   
	     
		StackInterface<String> stack = new LinkedStack<String>();
	   
	   System.out.println("prints null because stack empty: " + stack.peek2());
	   stack.push("first item");
	   
	   System.out.println("print null because there is only one item in stack: " + stack.peek2());
	   stack.push("second item");
	   
	   System.out.println("prints because there is already two items on stack: " + stack.peek2());
	   stack.push("third item");
	   
	   System.out.println("prints second item on three items in stack : " + stack.peek2());
 
	}   
	 
}
