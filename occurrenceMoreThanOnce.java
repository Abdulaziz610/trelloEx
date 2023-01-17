package questionO;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

	/**
	 * This Program is to get the number that occurred more than once and the most repeated number 
	 * in the array.
	 * 
	 *  For example in this code below 
	 *  20 appears more than one
	 *  but 15 is the most repeated number in the array.
	 * 
	 * @author Lenovo
	 *
	 */

	
public class occurrenceMoreThanOnce {
	public static void getMoreThenOneOccur(int[] Number, int value){
		int count = 0;
		for(int i=0; i<Number.length; i++) {
			if(Number[i] == value && value > 10) {
				count++;
			}
		}
		System.out.print(count);
	}
	public static void main(String[] args) {
		int[] arrNumber = {1, 2, 15, 20, 15, 30, 20, 15, 15};
		int value = 15;
		System.out.println("Number "+ value);
		getMoreThenOneOccur(arrNumber,value);
		System.out.println(" Appearnce time. ");
	}
}
