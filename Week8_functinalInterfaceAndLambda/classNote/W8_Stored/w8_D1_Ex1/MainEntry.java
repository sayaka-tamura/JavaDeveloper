package w8_D1_Ex1;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		// Calc add
		Calc add = new Calc() {
			int rslt = 0;
			
			@Override
			public void compute(Integer[] arr) {
				for (int num : arr) {
					rslt += num;
				}
				
				System.out.println("num1 + num2 is " + rslt);
			}
		};	
		// Calc sub
		Calc subtract = new Calc() {
			int rslt = 0;
			
			@Override
			public void compute(Integer[] arr) {
				for (int num : arr) {
					rslt -= num;
				}
				
				System.out.println("num1 - num2  is " + rslt);				
			}
		};
		// Calc mul
		Calc multiply = new Calc() {			
			@Override
			public void compute(Integer[] arr) {

				int rslt = arr[0]*arr[1];
				
				System.out.println("num1 * num2  is " + rslt);				
			}
							
		};
		// Calc div
		Calc divide = new Calc() {
			
			@Override
			public void compute(Integer[] arr) {
				int rslt = arr[0]/arr[1];
				
				System.out.println("num1 * num2  is " + rslt);		
				
			}
		};
		
		Scanner reader = new Scanner(System.in);
		Integer [] numbers;
		Integer quan = null;
		
		Integer choice = askcalc();

		if(choice <=4 && choice >0) {
			System.out.println("How many numbers?");
			quan = reader.nextInt();
		} else {
			quan = 2;
		}
		
		switch(choice) {
			case 1:
				numbers = builder(quan, reader);
				add.compute(numbers);
			break;
			case 2:
				numbers = builder(quan, reader);
				subtract.compute(numbers);
			break;
			case 3:
				numbers = builder(quan, reader);
				multiply.compute(numbers);
			break;
			case 4:
				numbers = builder(quan, reader);
				divide.compute(numbers);
			break;	
			default:
				System.out.println("I gave you four options, Right?");
		}
		
	}

	public static Integer[] builder(Integer quan, Scanner reader) {
		Integer counter = 0;
		Integer[] sub_numbers = new Integer[quan];
		while(counter<quan) {
			System.out.println("Enter #" + (counter + 1) + "Number: ");
			sub_numbers[counter] = reader.nextInt();
			counter++;
		}
		return sub_numbers;
	} // End Main
	
	private static int askcalc() {
		int choice = 0;

		System.out.println("How would like to calculate?");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		
		return choice;
		
	}

}
