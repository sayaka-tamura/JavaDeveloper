import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 2. The Halving Machine
 * 
 * Create a loop that will take an integer from user input.
 * If the integer is odd, add 1 and then divide that by 2 and print the new number.
 * If the integer is even, just divide by 2 and print the new number.
 * Continue doing this until you reach 1.
 * 
 * If the user enters 0 or negative number, 
 * print out "HEY! That's against the rules." and end the program.
 */

public class HavingMachine {
	public static void main(String[] args) {
		System.out.println("Type any Integer");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		if(num == 0 || num<0)
		{
			System.out.println("HEY! That's against the rules.");
		}
		else if(num%2 == 0) { 
			num /= 2;
			System.out.println(num);
		}
		else
		{
			while(num>1) 
			{
				num /= 2;
				System.out.println(num);
			}
		}
	}
}
