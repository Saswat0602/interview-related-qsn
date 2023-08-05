
import java.util.Scanner;

/*
 * Banu is trying to find treasure clues were given to find that treasure but in reverse manner.
 * Banu can find the Treasure only if she reverse that clue.
 * 
 * Help Banu to develop an algorithm for reversing the given clue.For example, if the clue is
 * "rewot" then the clue should be "tower". 
 * 
 * sample input gnirtS
 * sample output String
 * */
public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String::");
	String str=sc.nextLine();
	char[] resultarray = str.toCharArray();
	for(int i=resultarray.length-1;i>=0;i--)
		System.out.print(resultarray[i]);

	}

}
