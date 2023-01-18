package questionO;

import java.util.Stack;
import java.util.Scanner;

class stackInput {
	
	/**
	 * This program is to provide a list of integers as an input from the user to the stack.
	 * Using simple scanner and for each loop. 
	 *
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		Stack<Integer> stackWord = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Numbers: ");
		stackWord.push(sc.nextInt());
		System.out.print("Enter a Numbers: ");
		stackWord.push(sc.nextInt());
		System.out.print("Enter a Numbers: ");
		stackWord.push(sc.nextInt());
		System.out.print("Enter a Numbers: ");
		stackWord.push(sc.nextInt());
		
		
		
		System.out.println("The list of Number user entered: ");
		for(Integer userStack: stackWord ) {
			System.out.println(userStack);
		}
	

	}
}