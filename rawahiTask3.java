package questionO;

import java.util.Scanner;

public class rawahiTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This program is to find how many times the number found in the array, the input number is the user input
		 * the loop go through all the numbers and find the number that exist more than one time
		 */
		
		
		
		int[] number = {10, 10, 10, 22, 22, 29, 45, 70, 63, 63, 63, 50, 50, 100, 100};
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a number to see how many time appears: ");
		int userNum = sc.nextInt();
		int counter = 0;
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] == userNum) {
				counter ++;
				
			}
		}
		
		System.out.println(" The Number " + userNum + " Appears in " + counter + " Times ");
		
	}

}
