/*
 * * Class for storing high scores in an array in non-decreasing order. */
public class Scores
{
    public static final int maxEntries = 10; // number of high scores we keep
    private int numEntries; // number of actual entries
    private GameEntry[] entries; // array of game entries (names & scores)

    /** Default constructor */
    public Scores()
    {
      entries = new GameEntry[maxEntries];
      numEntries = 0;
    }



  /** Attempt to add a new score to the collection (if it is high enough) */
  public void add(GameEntry e)
  {
    int newScore = e.getScore();

    // is the new entry e really a high score?
    if (numEntries == maxEntries) // the array is full
    {
      if (newScore <= entries[numEntries-1].getScore()) // the new entry, e, is not a high score in this case
      {
        return;
      }
    }
    else // the array is not full
    {
      numEntries++;
    }

    // Locate the place that the new (high score) entry e belongs
    int i;
    for (i = numEntries-1 ; (i >= 1) && (newScore > entries[i-1].getScore()); i--)
    {
     // System.out.println("Moving element at position "+(i-1)+" ("+ entries[i-1] + ") to the right");
      entries[i] = entries[i - 1]; // move entry i one to the right / shifts all entries less than the number to the right
    }

    // add the new score to entries
    //System.out.println("Moving new element into position "+i+" ("+ e + ")");
    entries[i] = e;
  }



  /** Remove and return the high score at index i */
  public GameEntry remove(int i) throws IndexOutOfBoundsException // remove somethign that is out of bounds 
  //just remove method removes the entry into the garbage collector
  {
    if ((i < 0) || (i >= numEntries))
    {
      throw new IndexOutOfBoundsException( "Invalid index: " + i);
    }

    GameEntry temp = entries[i]; // temporarily save the object to be removed

    for (int j = i; j < numEntries-1; j++) // count up from i (not down)
    {
      entries[j] = entries[j+1]; // move one cell to the left because you removed the number that was entered
    }

    entries[numEntries -1 ] = null; // null out the old last score
    numEntries--;

    return temp; // return the removed object instead of garbage collector
  }
  
  public String toString()
  {
	  String output = "";
	  for (int i = 0; i< maxEntries; i++)
	  {
		  output += entries[i];
		  //output += "(" + m + ", " + n + ")";
	  }
	  return "[" + output + "]";
	  //return "(" + entries + ", " + entries + ")";
  }



}
