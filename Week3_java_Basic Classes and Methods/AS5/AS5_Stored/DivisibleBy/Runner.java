
public class Runner {
	static final int number = 20;

	public static void main(String[] args) {
		DivisibleBy dv1 = new DivisibleBy();
		
		for (int i = 1; i < number; i++) {
			if(dv1.isEven(i) && dv1.isDivisibleBy3(i)) 
			{
				System.out.println(i + " <");
				System.out.println(i + " =");
			}	
			else if(dv1.isEven(i))
				System.out.println(i + " <");
			else if(dv1.isDivisibleBy3(i))
				System.out.println(i + " =");
			else
				System.out.println(i);
		}		
	}
}
