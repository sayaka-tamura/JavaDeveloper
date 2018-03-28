import java.util.Scanner;

// Note: DO THIS WITH A SWITCH-CASE STATEMENT
// Make a program which displays a different message depending on the age given.

public class SpecificLegalProblems {
		static String name;
		
	public static void main (String[] args) {
		System.out.println("Hey, what's your name? ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		System.out.println("Ok, " + name + ", how old are you?");

		int age = input.nextInt();
		input.close();
		
		// evaluate Input Score
		switch(age)
		{
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			case 10: case 11: case 12: case 13: case 14: case 15:
				cantDrive();
				break;
			case 16: case 17:
				cantVote();
				break;
			case 18: case 19: case 20: case 21: case 22: case 23: case 24:
				cantRent();
				break;
			default :
				doAnything();
				break;
		}
	}
	
	public static void cantDrive() { System.out.println("You can't drive, " + name); }
	public static void cantVote() { System.out.println("You can't vote, " + name); }
	public static void cantRent() { System.out.println("You can't rent a car, " + name); }
	public static void doAnything() { System.out.println("You can do anything that's legal, " + name); }
}
