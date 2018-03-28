// Make a program which displays a different message depending on the age given. 

package legalProblems;

import java.util.Scanner;

public class legalProblems {
	public static void main(String[] args) {
		System.out.println("Hey, what's your name? ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		input.close();
		
		System.out.println("Ok, " + name + ", how old are you?");

		int age = input.nextInt();
		// Check Input Score
		if (age>=0 && age<16)
			System.out.println("You can't drive, " + name);
		if (age>=0 && age<18)
			System.out.println("You can't vote, " + name);
		if (age>=0 && age<25)
			System.out.println("You can't rent a car, " + name);
		if (age>=0 && age>=25)
			System.out.println("You can do anything that's legal, " + name);
		if (age<0)
			System.out.println("Invalid Input");
	}
}
