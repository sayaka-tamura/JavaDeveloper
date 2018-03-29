import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 3. Letter at a time
 * 
 * Did you know that using a loop, you can examine a String one letter at a time? 
 * The two key built-in String methods are length() and charAt().
 * 
 * length() returns an int representing the total number of characters in the String 
 * charAt( int n ) returns character at position n of the string (the character positions start at 0)
 * 
 * Try using to print the character and position number for every character in a string from user input!
 * 
 * Your output could look like the following:
 * What is your message?
 * >Hello World
 * 
 * Here are all the characters, one at a time:
 * 0: 'H'
 * 1: 'e'
 * 2: 'l'
 * 3: 'l'
 * 4: 'o'
 * 5: ' '
 * 6: 'W'
 * 7: 'o'
 * 8: 'r'
 * 9: 'l'
 * 10: 'd'
 */

public class LetterAtaTime {
	public static void main(String[] args) {
		System.out.println("Type any word");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		
		for(int i=0; i<s.length();i++)
		{
			System.out.println(i + ": \'" + s.charAt(i) +"\'");
		}
	}
}
