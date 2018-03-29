import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7. 
 * The expressions are to be typed in by the user. 
 * The input always consist of a number, followed by an operator, followed by another number. 
 * The operators that are allowed are +, -, *, and /. 
 * Your program should read an expression, print its value, read another expression, print its value, and so on. 
 * The program should end when the user enters 0 as the first number on the line.
 */

public class EvaluateExpressions {
	public static void main(String[] args) {
		System.out.println("Type any word");		
		
		Scanner in = new Scanner(System.in);
		Double num1 = 1.0;
				
		while(num1 != 0.0) {
			num1 = in.nextDouble();
			if(num1 != 0.0) {	
				String symbol = in.next();
				double num2 = in.nextDouble();
				
				double total = 0;	

				switch(symbol)
				{
					case "+":
						total = num1 + num2;
						break;
					case "-":
						total = num1 - num2;
						break;
					case "*":
						total = num1 * num2;
						break;
					case "/":
						total = num1 / num2;
						break;					
				}
				System.out.println("Your total is " + total);
			}
		}
		in.close();
	}
}
