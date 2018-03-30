import java.util.Arrays;
import java.util.Random;

/**
 * @author Sayaka Tamura
 *
 * 1. Copy an Array
 * 
 * Create an integer array of length 10 and fill it up with random numbers.
 * Create a second integer array of length 10.
 * 
 * Write a program that will copy the values of the first array into the second.
 * 
 * Print the values in both arrays at the end to prove your answer is valid.
 */

public class CopyAnArray {
	public static void main(String[] args) {
		int [] array1 = new int[10];
		
		Random rnd = new Random();
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rnd.nextInt(10) + 1;
		}
		
		int [] array2 = Arrays.copyOf(array1, array1.length);

		for(int a: array1)
			System.out.print(a + " ");
		
		System.out.println("");
		
		for(int b: array2)
			System.out.print(b + " ");
		
	}
}
