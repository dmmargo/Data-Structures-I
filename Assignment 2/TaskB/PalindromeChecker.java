//Diane Margo
//CS240 
//Assignment 2 
//05/03/2018


public class PalindromeChecker {
	String revString = "";
	public String Checking(String userS)
	{
		StackInterface<String> myPalid = new ArrayStack<String>();
		int length = userS.length();
		
		for(int i = 0;i < length; i++)
		{
			String charT = ("" + userS.charAt(i));
			myPalid.push(charT);
	
		}
		
		
		for(int i = 0; i < length; i++)
		{
			revString += myPalid.pop();
		}
		
		if(userS.equalsIgnoreCase(revString))
		{
			return "string is a palindrone";
		}
		else
		{
			return "string isn't a palindrone";
		}
	}
	
	
}
