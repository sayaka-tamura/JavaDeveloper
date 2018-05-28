package CalculatorEx;

public class MyCalc {

	FunctinalLambdaCalc <Integer> add = (num1, num2) -> num1+num2;
	FunctinalLambdaCalc <Integer> subtract = (num1, num2) -> num1-num2;
	FunctinalLambdaCalc <Float> multiply = (num1, num2) -> num1*num2;
	FunctinalLambdaCalc <Float> divide = (num1, num2) -> {
		if(num2==0) {
			System.out.println("Cannot divide by 0");
			return -1f;
		}
		else
			return num1/num2;
	};

}
