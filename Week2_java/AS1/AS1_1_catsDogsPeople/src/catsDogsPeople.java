//Week4_Hands-onIf Statements.txt

public class catsDogsPeople {

	public static void main(String[] args) {
		// 1. What if...
		// Create three integers: [people], [cats] and [dogs]
		int cats=2;
		int dogs=3;
		int people=1;
		
		// Compare the number of people and cats
		if(people>cats)
			System.out.println("Too few cats than the number of people!");
		else
			System.out.println("Too many cats than the number of people!");
		
		// Compare the number of people and dogs
		if(people>dogs)
			System.out.println("Too few dogs than the number of people!");
		else
			System.out.println("Too many dogs than the number of people!");
		
	}
}
