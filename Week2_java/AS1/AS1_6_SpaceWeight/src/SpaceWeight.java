import java.util.Scanner;

// Create a program that will ask you for your current weight.

public class SpaceWeight {
	public static void main(String[] args) {
		double gravity;
		
		System.out.println("Please enter your current earth weight in pounds: ");
		Scanner in = new Scanner(System.in);
		int weight = in.nextInt();
		
		System.out.println("I have information for the following planets:\n" +
			"1. Venus\n" +
			"2. Mars\n" +
			"3. Jupiter\n" +
			"4. Saturn\n" +
			"5. Uranus\n" +
			"6. Neptune\n" +
			"Which planet are you visiting?" );
		
		
		int num = in.nextInt();
		in.close();
		
		switch(num)
		{
			case 1:
				gravity = 0.78;
				break;
			case 2:
				gravity = 0.39;
				break;
			case 3:
				gravity = 2.65;
				break;
			case 4:
				gravity = 1.17;
				break;
			case 5:
				gravity = 1.05;
				break;
			case 6:
				gravity = 1.23;
				break;
			default:
				gravity = -999;
				break;
		}
		
		if(gravity == -999)
			System.out.println("Invalid Input for pranets!");
		else
			System.out.println("Your weight would be " + weight*gravity + " pounds on that planet.");
	}
}
