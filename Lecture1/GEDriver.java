import java.util.Scanner;

public class GEDriver {
	  public static void main(String[] args)
	  {
		Scores s= new Scores();
		Scanner kb = new Scanner(System.in);
		
		int maxEntries = 10;
		//System.out.print("How many entries?");
		//entries = kb.nextInt();   problem because entries is static
		//kb.nextLine();
		for (int i=0; i< maxEntries; i++)
	  	{
			System.out.print("What is the name?");
			String named = kb.nextLine();
			System.out.print("What is the score?");
			int scored = kb.nextInt();
			kb.nextLine();
			
	  		GameEntry ge = new GameEntry(named, scored);
	  		s.add(ge);
	  	}
			/*
			GameEntry ge1 = new GameEntry("a", 60);
			GameEntry ge2 = new GameEntry("b",80);
			GameEntry ge3 = new GameEntry("c", 11);
			GameEntry ge4 = new GameEntry("d", 11);
			GameEntry ge5 = new GameEntry("e", 11);
			GameEntry ge6= new GameEntry("f", 5);
			GameEntry ge7 = new GameEntry("g", 11);
			GameEntry ge8 = new GameEntry("h", 11);
			GameEntry ge9 = new GameEntry("i", 11);
			GameEntry ge10 = new GameEntry("j", 11);
			
			
			s.add(ge1);
			s.add(ge2);
			s.add(ge3);
			s.add(ge4);
			s.add(ge5);
			s.add(ge6);
			s.add(ge7);
			s.add(ge8);
			s.add(ge9);
			s.add(ge10);
			*/
			
			//s.toString(ge1);
	  	//}
		
		System.out.print(s.toString());
	  }
}
