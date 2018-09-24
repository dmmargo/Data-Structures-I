//Diane Margo
//CS240 
//Assignment 4 
//05/30/18

import java.util.LinkedList;
import java.util.Queue;
public class TaskADemo {
	public static void main(String [] args)
	{
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		
		Queue<Integer> q2=new LinkedList<Integer>();
		q2.add(6);  
		q2.add(7);
		q2.add(8);
		q2.add(9);
		q2.add(10);
		QueueWithSplice qs=new QueueWithSplice(q1);
		
		//Queue contents before calling splice method

		System.out.println("Queue contents before calling splice method");
		System.out.println("first Queue:"+q1);
		System.out.println("Second Queue:"+q2);
		
		qs.splice(q2);
		
		//Queue contents after calling splice method
		
		System.out.println(" Queue contents after calling splice method");
		System.out.println("first Queue:" + q1);
		System.out.println("Second Queue:" + q2);
		
	}
}
