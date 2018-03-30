import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *
 * 5. Comma separated values
 * 
 * Ask the user to input multiple words separated by commas (,)
 * 
 * Put those words into a String array, and print out that String array 
 * for the user to see.
 * 
 */

public class CommaSeparatedValues {
	public static void main(String[] args) {
		
		System.out.println("Type multipule any words separated by commas(,)");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		String [] array = temp.split(",", 0);
		
		for (int i = 0; i < array.length; i++) 
		{	
			System.out.println("Element " + i + " is " + array[i]);
		}
		in.close();
	}
}
