package expressionEvaluation_Ex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		// Dequeue(= Stack) : LIFO (can use both function for Stack and Queue)
		Deque<String> ope1 = new ArrayDeque<String>();
		Deque<Integer> val1 = new ArrayDeque<Integer>();
		
		String token = "(1+2-3+5-8+13)";
		
		
		// 1. While there are still tokens to be read in
		while(token.hasNext != null) {
			// 1.2
			if(token instanceof Number)	//1.2.1
				val1.push(token);
			if (token == '(')			//1.2.2
				ope1.push(token);
			if (token == ')') {			//1.2.3
				String pk = ope1.peek();
				while(pk != '(') 		//1.2.3.1
				{
					ope1.pop(); //1.2.3.1.1
		            // 1.2.3.1.2. Pop the value stack twice, getting two operands.
		            val1.pop();
		            String op1 = ope1.getFirst();
		            val1.pop();
		            String op2 = ope1.getFirst();
		            
		            // 1.2.3.1.3. Apply the operator to the operands, in the correct order.
		            
		            // 1.2.3.1.4. Push the result onto the value stack.
		            val1.push(rslt);
				}
				
				//1.2.3.2 Pop the left parenthesis from the operator stack, and discard it.
				ope1.pop();
			}
			
			if(token = thisOp)	//1.2.4
				while ("operator stack" != null && the top thing on the "operator stack" has the same or greater precedence as thisOp) // 1.2.4.1
				{
					1. Pop the operator from the operator stack.
			        2. Pop the value stack twice, getting two operands.
			        3. Apply the operator to the operands, in the correct order.
			        4. Push the result onto the value stack.
				}
				
				Push thisOp onto the operator stack. //1.2.4.2		
		}
		
		// 2. While the operator stack is not empty
		while("operator stack" != null) {
			1 Pop the operator from the operator stack.
		    2 Pop the value stack twice, getting two operands.
		    3 Apply the operator to the operands, in the correct order.
		    4 Push the result onto the value stack.
		}
		
		// 3. At this point the operator stack should be empty, 
		// and the value stack should have only one value in it, which is the final result.
	
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
}
