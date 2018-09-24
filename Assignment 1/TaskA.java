//Diane Margo
//CS240
//Assignment 1
//4/12/18

public class TaskA {
	public static void main(String[] args)
	{
		int removesoup = 0;
		BagInterface<String> grocerybag = new ResizableArrayBag<String>();
		
		grocerybag.add("soup");
		grocerybag.add("pineapples");
		grocerybag.add("melons");
		grocerybag.add("soup");
		grocerybag.add("dumplings");
		grocerybag.add("beats");
		grocerybag.add("tofu");
		grocerybag.add("soup");
		grocerybag.add("soup");
		grocerybag.add("soup");
		
		while(grocerybag.contains("soup"))
		{
			grocerybag.remove("soup");
			removesoup++;
		}
		/*
		for (int i =0; i< 10; i++)
		{
			if (groccerybag[i].equals("soup"))
			{
				remove();
			}
			else
				continue;
		}
		*/
		System.out.println(removesoup + " removed soup");
		
	}
	
}
