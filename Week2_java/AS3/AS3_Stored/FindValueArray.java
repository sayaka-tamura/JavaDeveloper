import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *
 * 2. Find a value in an Array
 * 
 * Create an integer array of length 10 and fill it up with random numbers.
 * Print the values in the array for the user to see.
 * 
 * Ask the user for a value they'd like you to search for.
 * Search through the array.
 * If the value is in the array, tell them which position you found.
 * 
 * It's okay if the program prints the message more than once.
 */

public class FindValueArray {
	public static void main(String[] args) {
		Integer [] a1 = new Integer [10];
		Random rnd = new Random();
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = rnd.nextInt(100)+1;
		} 
		
		System.out.println("Generated 10 random numbers: ");
		for(int a:a1)
			System.out.print(a + " ");
		
		System.out.println("");
		System.out.println("Type a number you'd search the position in the array");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
//		for (int i = 0; i < a1.length; i++) {
//			if(num == a1[i])
//			{
//				pos = i;
//				break;
//			}
//		}
		
		System.out.println("The position of " + num + " : " + Arrays.asList(a1).indexOf(num));
		in.close();
	}
}
