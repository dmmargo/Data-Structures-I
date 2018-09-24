//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class BubbleSortRecursive {
	public static final int MIN_SIZE = 5; // For quick sort

	// SELECTION SORT

	   /** Sorts the first n objects in an array into ascending order.
	       @param a  An array of Comparable objects.
	       @param n  An integer > 0. */
		public static <T extends Comparable<? super T>>
		       void selectionSort(T[] a, int n)
		{
		   selectionSort(a, 0, n - 1); // invoke recursive method
		} // end selectionSort

		public static <T extends Comparable<? super T>>
		       void selectionSort(T[] a, int first, int last)
		{
			if (first < last)
			{  // Place the smallest value at beginning of array:
				int indexOfNextSmallest = getIndexOfSmallest(a, first, last);
				swap(a, first, indexOfNextSmallest);
				selectionSort(a, first + 1, last);
			} // end if
		} // end selectionSort

	   // Returns the index of the smallest value in a portion of an array.
	   private static <T extends Comparable<? super T>>
	           int getIndexOfSmallest(T[] a, int first, int last)
	   {
	      T min = a[first];
	      int indexOfMin = first;
	      for (int index = first + 1; index <= last; index++)
	      {
	         if (a[index].compareTo(min) < 0)
	         {
	            min = a[index];
	            indexOfMin = index;
	            // Assertion: min is the smallest of a[first] through a[index].
	         } // end if
	      } // end for
	      return indexOfMin;
	   } // end getIndexOfSmallest
		  private static void swap(Object[] array, int i, int j)
		   {
		      Object temp = array[i];
		      array[i] = array[j];
		      array[j] = temp;
		   } // end swap
}
