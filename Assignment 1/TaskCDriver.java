//Diane Margo
//CS240
//Assignment 1
//4/12/18
public class TaskCDriver {
    public static void main(String[] args){
    	
        PileOfTextbooks pile = new PileOfTextbooks(25);

        //add
        pile.add("Physics");
        pile.add("Calculus");
        pile.add("Learn C++");
        pile.add("Learn Java");
        pile.add("Learn Python");
        pile.add("Learn HTML");
        
        //removed
        System.out.println("removed: \"" + pile.remove() + "\"");
        
        //gets top of pile
        System.out.println("top of pile of books: \"" + pile.getTopBook() + "\"");
        
        //empty everything 
        pile.clear();
        System.out.println("Removed all books");
        
        //confirm books are emptied out
        if(pile.isEmpty())
            System.out.println("Confirmation that all books are removed");
        else
            System.out.println("There is still books");



    }
}