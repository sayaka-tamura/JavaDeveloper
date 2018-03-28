// Create three integers named [people], [cars], and [buses].

public class CarsOrBuses {
	public static void main(String[] args) {
		int people = 5;
		int cars = 2;
		int buses = 2;
		
		if(cars>people)
			System.out.println("We should take the cars");
		else if(cars<people)
			System.out.println("We should not take the cars.");
		else
			System.out.println("We can't decide.");	
		
		if(buses>cars)
			System.out.println("That's too many buses.");
		else if(buses<cars)
			System.out.println("Maybe we should take the buses.");
		else
			System.out.println("We still can't decide.");
		
		if(people>buses)
			System.out.println("Alright, let's just take the buses");
		else
			System.out.println("Let's just take the cars.");
		
	}
}

// 1. What do you think else if and else are doing?
	// (If) The difference is that if the first if is true, all of the other else ifs won't be executed, even if they do evaluate to true.
	// (Else if)  If they were individual ifs, however, all of the ifs will be executed if they evaluate to true.

// 2. Remove the else from one of your else if statements. What differences does that make? Why?
// The answer from program will become ambiguous. Because the number of check for evaluation (T/F) decrease by removing the else statement.