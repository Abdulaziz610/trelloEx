package questionO;

import java.util.Scanner;

public class nextGreaterElements {

	/**
	 * 
	 * This Program is to find the next greater elements in the array(which is the second greater element)
	 * using two >> for loops, to read the first and the next number i, j loop.
	 * After reading the first and second element.
	 * using >> input[j] - 1, to find the second greater element
	 * 
	 * We used Scanner, the user will enter any 10 numbers to complete the array, then the code will find the next greater element.
	 * @param arrNumber
	 */
	public static void findNextGreaterElements(int[] arrNumber) {
		int secondGreaterElement = 0;
		for (int i = 0; i < arrNumber.length; i++) {

			for (int j = i + 1; j < arrNumber.length; j++) {
				if (arrNumber[j] > arrNumber[i]) {
					secondGreaterElement = arrNumber[j - 1] ;
				}
			}

		}            System.out.print("The Next Greater Elements in this array is: " + secondGreaterElement);

	}

	public static void main(String[] args) {
		
		
		//int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 Number to complete the array: ");
		int[] inputArray = new int[10];
		inputArray[0] = sc.nextInt();
		inputArray[1] = sc.nextInt();
		inputArray[2] = sc.nextInt();
		inputArray[3] = sc.nextInt();
		inputArray[4] = sc.nextInt();
		inputArray[5] = sc.nextInt();
		inputArray[6] = sc.nextInt();
		inputArray[7] = sc.nextInt();
		inputArray[8] = sc.nextInt();
		inputArray[9] = sc.nextInt();
		findNextGreaterElements(inputArray);

	}

}
