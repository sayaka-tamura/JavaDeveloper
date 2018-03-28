import java.util.Scanner;

// Note: DO THIS WITH A SWITCH-CASE STATEMENT
// Create a method that accepts an integer and returns a string with the corresponding day of the week.
public class DayOfTheWeek {
	public static void main(String[] args) {
		String day;
		
		System.out.println("Please enter an integer (1-7): ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		switch(num)
		{
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				day = "Error";
				break;
		}
		
		if(day.equals("Error"))
			System.out.println(day + "!");
		else
			System.out.println("Weekday " + num + " is " +  day + "!");
	}
}
