package questionO;

import java.util.*;
import java.util.Arrays;

/**
 * This program prints the missing number in the array of integers
 * In this program the required is to find the missing number incrementing by 5
 * 
 * For Example: 
 * 5 10 20 25 30 35
 * The missing number here is 15
 * 
 * 
 * 
 * @author Lenovo
 *
 */


class missingNumbers {
    public static void MissingNumber(int[] arrNumber) {
    	int missingNum = 0;
    	for(int i = 0; i < arrNumber.length - 1; i++) {
    		if(arrNumber[i] + 5 != arrNumber[i+1]) {
    			missingNum = arrNumber[i] + 5;
    		}
    	}
    	System.out.println("Missing Number: " + missingNum);
    }
    public static void main(String[] args)
    {
        int[] arr = { 5, 10, 20, 25, 30, 35 };
        MissingNumber(arr);
     
    }
}
