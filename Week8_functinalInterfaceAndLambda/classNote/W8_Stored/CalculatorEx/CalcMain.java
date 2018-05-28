package CalculatorEx;

import java.util.Scanner;

public class CalcMain{
	public static void main(String[] args) {
		Scanner uInput = new Scanner(System.in);
		String choice = "";
		float num1 = 0f;
		float num2 = 0f;
		
		MyCalc maths = new MyCalc();
		
		System.out.println("What is your first value?");
		num1 = uInput.nextFloat();
		System.out.println("What is your second value?");
		num2 = uInput.nextFloat();
		uInput.nextLine();
		
		System.out.println("What do you want to do? +, -, *, / ");
		choice = uInput.nextLine();
				
		switch(choice) {
			case "+":
				System.out.println(maths.add.compute((int)num1, (int)num2));
				break;
			case "-":
				System.out.println(maths.subtract.compute((int)num1, (int)num2));
				break;
			case "*":
				System.out.println(maths.multiply.compute(num1, num2));
				break;
			case "/":
				System.out.println(maths.divide.compute(num1, num2));
				break;
			default:
				break;
		}
	}	
	
}
