//Diane Margo
//CS240 
//Assignment 4 
//05/30/18

import java.io.*;

public class TaskCDemo {
	public static void main(String[] args) throws Exception
	{  
	  ArrayQueue<Integer> queue1 = new ArrayQueue<Integer>();  
	  
	  File file = new File("C1Answer.txt");

	  BufferedReader br = new BufferedReader(new FileReader(file));
	 
	  String st;
	  while ((st = br.readLine()) != null) {
		  System.out.print("add: ");
		  System.out.println(st);
		  queue1.enqueue(st);
	  }

	  
	  System.out.println("front: " +queue1.getFront());
	  System.out.println("back: "+ queue1.getBack());
	  
	  
	  
	} // end main
	
}
