import java.lang.reflect.Array;

public class ArrayUtilityDemo 
{
	public static void main(String[] args)
	{
		ArrayUtility a = new ArrayUtility();
		int[] array = {1, 2, 3, 4};
		
		System.out.println("An original 1D array:");
		
		for (int i = 0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Rotated to the left:");
		a.rotateLeft(array); 
		
		System.out.println();
		
		
		int[][] array2 = {{1, 2, 3}, 
						  {4, 5, 6, 7, 8}, 
						  {9, 10, 11, 12}};
		System.out.println("An original ragged 2D array:");
		
		int row = array2.length;
		
		int col0 = array2[0].length; //3
		int col1 = array2[1].length; //4
		int col2 = array2[2].length; //4
		
		for (int i = 0; i<row; i++)
		{
			for (int j = 0; j<array2[i].length; j++)
			{
				{
					System.out.print(array2[i][j] + " ");

				}
			}
			System.out.println();
		}

		System.out.println("Rotated to the left:");
		
		a.rotateLeft(array2);
		
		
	}

}
