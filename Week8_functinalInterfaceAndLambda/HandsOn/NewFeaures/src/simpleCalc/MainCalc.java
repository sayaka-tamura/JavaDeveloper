package simpleCalc;

import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Integer[] numbers = null;
		Calc add = new Calc() {
			@Override
			public void compute(Integer[] numbers) {
				Integer total = 0;
				for(Integer n : numbers) {
					total += n;
				}
				System.out.println(total);
			}
		};
		Calc subtract = new Calc() {
			@Override
			public void compute(Integer[] numbers) {
				Integer total = 0;
				for(Integer n : numbers) {
					total -= n;
				}
				System.out.println(total);
			}
		};
		Calc multiply = new Calc() {
			@Override
			public void compute(Integer[] numbers) {
				Integer total = 1;
				for(Integer n : numbers) {
					total *= n;
				}
				System.out.println(total);
			}
		};
		Calc divide = new Calc() {
			@Override
			public void compute(Integer[] numbers) {
				Integer total = 0;
				total = numbers[0] / numbers[1];
				System.out.println(total);
			}
		};
		
		System.out.println("What do you want to do?");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		Integer choice = reader.nextInt();
		Integer quan = null;
		if(choice < 4 && choice > 0) {
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
				System.out.println("I gave you four options for a reason. Right?!");
		}
		
	}
	
	public static Integer[] builder(Integer quan, Scanner reader) {
		Integer counter = 0;
		Integer[] sub_numbers = new Integer[quan];
		while(counter < quan ) {
			System.out.println("Enter #"+ (counter + 1) + " number:");
			sub_numbers[counter] = reader.nextInt();
			counter++;
		}
		return sub_numbers;
	}

}
