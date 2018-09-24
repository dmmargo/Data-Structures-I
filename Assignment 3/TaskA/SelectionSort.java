//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class SelectionSort {
	   // SELECTION SORT
	   /** Sorts the first n objects in an array into ascending order.
	       @param a  An array of Comparable objects.
	       @param n  An integer > 0. */
	   public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n)
	   {
		   System.out.println("SelectionSort Process: ");
	      for (int index = 0; index < n - 1; index++)
	      {
	         int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
	         
	         
	         for(int i = 0; i < n; i++) { //print array progress
	        	 System.out.print(a[i]);
	         }
	         System.out.println();
	         
	         swap(a, index, indexOfNextSmallest);
	         
	         
	         // Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
	      } // end for
	      System.out.println();
	   } // end selectionSort

	   // Finds the index of the smallest value in a portion of an array a.
	   // Precondition: a.length > last >= first >= 0.
	   // Returns the index of the smallest value among
	   // a[first], a[first + 1], . . . , a[last].
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
	            
	         } // end if
	         // Assertion: min is the smallest of a[first] through a[index].
	      } // end for

	      return indexOfMin;
	   } // end getIndexOfSmallest
	// Swaps the array entries a[i] and a[j].
	   private static void swap(Object[] a, int i, int j)
	   {
	      Object temp = a[i];
	      a[i] = a[j];
	      a[j] = temp;
	      //System.out.print(a);
	      
	   } // end swap
} // end Selection Sort


