import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		double area;
		boolean retry = false;
		
		AreaCalculator ac1 = new AreaCalculator();
		Scanner in = new Scanner (System.in);
		
		do {
			area = ac1.askArea();
			System.out.printf("The Area: %.2f \n",area);
			
			System.out.print("Do you want to try a different shape?[Y/N]:");
	        retry = in.next().equalsIgnoreCase("Y");
		} while (retry);
		
		System.out.println("Bye!");
		in.close();
	}
}
