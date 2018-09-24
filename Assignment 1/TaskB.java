//Diane Margo
//CS240
//Assignment 1
//4/12/18

public class TaskB {
	public static void main(String[] args)
	{
		BagInterface<String> vowels = new ResizableArrayBag<String>();
		
		BagInterface<String> letters = new ResizableArrayBag<String>();
		letters.add("m");
		letters.add("n");
		letters.add("o");
		letters.add("p");
		letters.add("q");
		letters.add("r");
		letters.add("u");
		letters.add("u");
		
		BagInterface<String> vowelsempty = new ResizableArrayBag<String>();
		
		vowelsempty.add("a");
		vowelsempty.add("e");
		vowelsempty.add("i");
		vowelsempty.add("o");
		vowelsempty.add("u");
		
		int vowelcount = 0;
		

		for (int i = letters.getCurrentSize(); i >0; i--)
		{
			String letter = (String)letters.remove();
			
			if(vowelsempty.contains(letter))
			{
				vowels.add(letter);
			}
				
		}
		
		
		System.out.print("Number of vowels in the bag: " + vowels.getCurrentSize()); //number of vowels including vowels already added
		System.out.println();
		
		
		
	}

}
