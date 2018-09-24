//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class InsertionSort {
	public static <T extends Comparable<? super T>>
	void insertionSort(T[] a, int n)
	{
		insertionSort(a, 0, n - 1);
	} // end insertionSort

	public static <T extends Comparable<? super T>>
    void insertionSort(T[] a, int first, int last)
	{
		System.out.println("InsertionSort Process: ");
		for (int unsorted = first + 1; unsorted <= last; unsorted++)
		{   // Assertion: a[first] <= a[first + 1] <= ... <= a[unsorted - 1]
			  for(int i = 0; i < a.length; i++) { //print array progress
		        	 System.out.print(a[i]);
		         }
		         System.out.println();
			T firstUnsorted = a[unsorted];

			insertInOrder(firstUnsorted, a, first, unsorted - 1);
		} // end for
		System.out.println();
	} // end insertionSort

	private static <T extends Comparable<? super T>>
     void insertInOrder(T anEntry, T[] a, int begin, int end)
	{
		int index = end;

		while ((index >= begin) && (anEntry.compareTo(a[index]) < 0))
		{
			a[index + 1] = a[index]; // Make room
			
			index--;
		} // end for

		// Assertion: a[index + 1] is available
		a[index + 1] = anEntry;  // Insert
	} // end insertInOrder
	
}
