import java.util.Random;

/**
 * @author Sayaka Tamura
 *
 * 3. Largest Value
 * 
 * Create an integer array of length 10 and fill it up with random numbers.
 * Print the values in the array for the user to see.
 * 
 * Locate the largest number in the array and print out that number and its position.
 * 
 */

public class LagestValueArray {
	public static void main(String[] args) {
		int [] a1 = new int [10];
		Random rnd = new Random();
		int maxPos = a1[0];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = rnd.nextInt(100)+1;
		} 
		
		System.out.println("Generated 10 random numbers: ");
		for(int a:a1)
			System.out.print(a + " ");
		
		
		for (int i = 1; i < a1.length; i++) {
			maxPos = a1[i] > a1[maxPos] ? i : maxPos;
		}
			
		System.out.println("");
		
		System.out.println("Max number in the array : " + a1[maxPos]);
		System.out.println("Position : " + maxPos);
	}
}
