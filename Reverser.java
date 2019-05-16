import java.util.*;

public class Reverser 
{

	public static void main (String[] args)
	{
		System.out.println("Type your name:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();// changed from toString() to nextLine()
		System.out.println(reverse(name));
		
	}
	
	/**
	 * Takes in a String variable and returns it backwards
	 * @param str word(s) to be reversed
	 * @return the reversed String
	 */
	public static String reverse(String str)
	{
		String ans = " ";
		for (int i = str.length()-1; i > 0; i--)//changed str.length() to str.length()-1
		{
			ans += str.charAt(i);
		}
		return ans;
	}
}
