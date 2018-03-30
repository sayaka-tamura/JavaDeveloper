import java.util.Random;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *
 * 4. How many times
 * 
 * Create an integer array of length 10 and fill it up with random numbers.
 * Print the values in the array for the user to see.
 * 
 * Ask the user for a value they'd like you to search for.
 * Search through the array.
 * Tell the user how many times that value appears in the array.
 * 
 */

public class HowManyTimes {
	public static void main(String[] args) {
		int [] a1 = new int [10];
		Random rnd = new Random();
		int counter = 0;
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = rnd.nextInt(10)+1;
		} 
		
		System.out.println("Generated 10 random numbers: ");
		for(int a:a1)
			System.out.print(a + " ");
		
		System.out.println("");
		System.out.println("Type a number you'd search the position in the array");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for (int i = 0; i < a1.length; i++) {
			if(num == a1[i])
				counter++;
		}
			
		System.out.println("");
		
		System.out.println("The number of " + num + " in the array: " + counter);
		in.close();
	}
}
