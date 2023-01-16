package questionO;

import java.util.Arrays;

public class highestNumber {
	
	/**
	 * This program is to find the second highest number in an array of integers.
	 * For example:
	 * Array has numbers [1, 2, 3, 4, 5, 6]
	 * The highest number is 6
	 * The second highest number is 5
	 * 
	 * This question has been solved using Arrays
	 * 
	 * 
	 * @param hNumber
	 * @return
	 */
	public static int SecondHighestNumber(int[] hNumber) {
		Arrays.sort(hNumber);
		int arrLenght = hNumber.length;
		return hNumber[arrLenght - 3];
	}

	public static void main(String args[]) {
		int arrNumbers[] = { 100, 1050, 1049, 250, 300, 450, 500, 1, 2, 3};
		System.out.println(" The Second Largest Number is: " + SecondHighestNumber(arrNumbers));
		
	}
}