//Diane Margo
//CS240 
//Assignment 3 
//05/18/2018
public class TaskCDemo 
{
    public static void main(String[] args){
        Integer[] array = {8, 2, 6, 4, 9, 7, 1};
        System.out.println("Before Sorting");
        display(array, array.length);

        BubbleSortIterative.iterativeSort2(array,array.length-1);
        
        
        System.out.println("After Sorting");
        
        display(array, array.length);
    }
	public static void display(Object[] array, int n)
	{
		for (int index = 0; index < n; index++)
			System.out.println(array[index]);
		System.out.println();
	} // end display


}  // end Driver
