/**
 * @author Sayaka Tamura
 * 1. The Legendary FizzBuzz
 *
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the number.
 * For the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and five print "FizzBuzz".
 *
 */

public class LegendaryFizzBuzz {
	public static void main(String[] args) {
		
        for (int i = 1; i < 100; i++) {
            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            
            System.out.println(output.isEmpty() ? i : output);
        }
	}
}
