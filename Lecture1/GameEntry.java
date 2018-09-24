public class GameEntry
{
    protected String name;	// name of the person earning this score
    protected int score;	// the score value

    /** Constructor to create a game entry */
    public GameEntry(String n, int s)
    {
      name = n;
      score = s;
    }

    /** Retrieves the name field */
    public String getName()
    {
      return name;
    }

    
    /** Retrieves the score field */
    public int getScore()
    {
      return score;
    }

    /** Returns a string representation of this entry */
    public String toString()
    {
      return "(" + name + ", " + score + ")";
    }
    public static void main(String[]args)
    {
    	//GameEntry ge = new GameEntry("James", 45);
    	//System.out.println(ge);
    	
    	for (int i=0; i<10; i++)
    	{
    		GameEntry ge = new GameEntry("James", 45);
    		System.out.print(ge);
    	}
    }
}
