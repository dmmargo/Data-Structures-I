//Diane Margo
//CS240 
//Assignment 4 
//05/30/18

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueWithSplice
{
   public static Queue<Integer> q1;
   public static Stack<Integer> tempStack;
   public static int queueLength,stackLength;

//constructor
   QueueWithSplice(Queue<Integer> presentQueue)
   {
       this.q1=presentQueue;
       tempStack=new Stack<Integer>();
   }

//implemented splice() method using recursion
   public void splice(Queue<Integer> anotherQueue)
   {
       if(anotherQueue.isEmpty())
       {
           return;
       }
       Integer temp=anotherQueue.remove();
       q1.add(temp);
       queueLength++;
       splice(anotherQueue);
       tempStack.add(temp);
       stackLength++;
       if(queueLength==stackLength)
       {
           while(!tempStack.isEmpty())
           {
               anotherQueue.add(tempStack.pop());
           }
       }
   }
}