//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class TaskADemo
{
	public static void main(String[] args)
	{
      Integer[] array = {5, 6, 3, 8, 2, 1};

      
      System.out.println("Before sort:");
		  display(array, array.length);
		  
      SelectionSort.selectionSort(array, array.length);
      //InsertionSort.insertionSort(array, array.length);

		  System.out.println("After selection sort:");
		  display(array, array.length);

	} // end testSort

	public static void display(Object[] array, int n)
	{
		for (int index = 0; index < n; index++)
			System.out.println(array[index]);
		System.out.println();
	} // end display
	


}  // end Driver

