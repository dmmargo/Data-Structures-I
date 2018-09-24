//Diane Margo
//CS240
//Assignment 1
//4/12/18
import java.util.Arrays;

public final class PileOfTextbooks implements PilingInterface
{
    private String[] books;
    private int numberOfBooks;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public PileOfTextbooks(){
        this(DEFAULT_CAPACITY);
    }

    public PileOfTextbooks(int initialCapacity)
    {
        books = new String[initialCapacity];
        numberOfBooks = 0;
        initialized = true;
    }

    private boolean isArrayFull()
    {
        return numberOfBooks >= books.length;
    }

    public void add(String newBook) //must
    {
        checkInitialization();
        if (isArrayFull())
        {
            doubleCapacity();
        }
        books[numberOfBooks] = newBook;
        numberOfBooks++;
    }


    public String remove() //must
    {
        checkInitialization();
        if(numberOfBooks == 0)
            return null;
        String result = books[numberOfBooks-1];
        books[numberOfBooks] = null;
        numberOfBooks--;
        return result;
    }

    public String getTopBook()
    {
        if(numberOfBooks == 0)
            return null;
        return books[numberOfBooks-1];
    }

    public boolean isEmpty()
    {
        return numberOfBooks == 0;
    }

    public void clear()
    {
        while(!isEmpty())
        {
            remove();
        }
    }

    private void doubleCapacity()
    {
        int newLength = 2 * books.length;
        checkCapacity(newLength);
        books = Arrays.copyOf(books, newLength);
    }

    private void checkCapacity(int capacity)
    {
        if (capacity > MAX_CAPACITY)
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds " +
                    "allowed maximum of " + MAX_CAPACITY);
    }

    private void checkInitialization()
    {
        if (!initialized)
            throw new SecurityException ("Uninitialized object used " +
                    "to call an ArrayBag method.");
    }

    public String[] toArray()
    {
        checkInitialization();
        @SuppressWarnings("unchecked")
        String[] result = (String[])new Object[numberOfBooks]; // Unchecked cast
        for (int index = 0; index < numberOfBooks; index++)
        {
            result[index] = books[index];
        }

        return result;
    }
}