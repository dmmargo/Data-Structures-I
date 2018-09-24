//Diane Margo
//CS240 
//Assignment 4 
//05/30/18

public class TaskBDemo {

    public static void main(String[] args){
        QueueInterface<String> deque1 = new DequeQueue<>();
        System.out.println("DequeQueue: ");
        deque1.enqueue("hello");
        deque1.enqueue("world");
        deque1.enqueue("soup");
        
        System.out.println("Removing front: " + deque1.dequeue());
        System.out.println("Removing front: " + deque1.dequeue());
        
        deque1.clear();
        System.out.println();

        StackInterface<String> stack1 = new DequeStack<>();
        System.out.println("DequeStack: ");
        stack1.push("hellos");
        stack1.push("worlds");
        stack1.push("soups");
        stack1.push("Paul");
        System.out.println("Removing front: " + stack1.pop());
        System.out.println("Removing front: " + stack1.pop());
        stack1.clear();
        System.out.println();

    }
}
