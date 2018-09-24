//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class BubbleSortIterative
    {
        // SELECTION SORT
        /** Sorts the first n objects in an array into ascending order.
         @param a  An array of Comparable objects.*/

        public static <T extends Comparable<? super T>> void iterativeSort2(T[] a, int n)
        {
        	System.out.println("BubbleSort Interative Progress: ");
            for (int index = 0; index < n ; index++)
            {
                iterativeSort2(a, 0, n);
                for(int i = 0; i < n; i++) { //print array progress
   	        	 System.out.print(a[i]);
                }
               System.out.println();
            }
            System.out.println();
        }
        public static <T extends Comparable<? super T>> void iterativeSort2(T[] a, int first, int last)
        {
            T max = a[first];
            for (int index = first + 1; index <= last; index++)
            {
                if (a[index].compareTo(max) < 0)
                {
                    swap(a, index, index-1);
                    max = a[index-1];
                } // end if
                max = a[index];
                // Assertion: min is the smallest of a[first] through a[index].
            } // end for
        } // end getIndexOfSmallest
        private static void swap(Object[] array, int i, int j)
        {
           Object temp = array[i];
           array[i] = array[j];
           array[j] = temp;
        } // end swap


}


