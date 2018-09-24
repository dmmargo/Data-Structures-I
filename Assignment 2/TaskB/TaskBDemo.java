import java.util.Scanner;

//Diane Margo
//CS240 
//Assignment 2 
//05/03/2018

public class TaskBDemo 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
	
		PalindromeChecker obj = new PalindromeChecker();
		
		System.out.print("enter a string: ");
		String input = kb.nextLine();
		
		input = input.toLowerCase().replaceAll("\\W", ""); //extra credit
		
		String user = ""+ input;
		
		System.out.print("" + obj.Checking(user));

	}
}
