
public class ArrayUtility {
	
	//static ArrayUtility ar = new ArrayUtility();
	/*public static void main (String[] args)
	{
		System.out.print("i");
	}
	*/
	public static void rotateLeft(int[] a)
	{
		int a1 = a[0];
		for (int i = 0; i<a.length-1; i++)
		{
			a[i] = a[i+1];
			System.out.print(a[i] + " ");
		}
		System.out.print(a[a.length -1] = a1);
	}
	
	public static void rotateLeft(int[][] a)
	{
		//int col = a[0].length;
		int row = a.length;
		
		int col0 = a[0].length; //3
		int col1 = a[1].length; //4
		int col2 = a[2].length; //4
		int a1 = 0;
		
		for (int i = 0; i<row; i++)
		{
			for (int j = 0; j<a[i].length-1; j++)
			{
				{
					if (j==0)
						a1 = a[i][j];
					a[i][j] = a[i][j+1];
					System.out.print(a[i][j] + " ");

				}
			}
			System.out.println(a1);
			
		}
		
		

		
		
	}
}
