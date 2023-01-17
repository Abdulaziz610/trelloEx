package questionO;
import java.util.Arrays;


public class decreasingNumbers {	
	 /**
	  * This program is to find the longest decreasnig subarray 
	  * using a function that have the lenght of the array and the while condition to see wheahter the current element is
	  * greater than the next element
	  * and the if condition is to keep updating the max length, end and the start.
	  * @param arrNumber
	  * @return
	  */
    public static int[] findLongestSubarray(int[] arrNumber) {
        int startElements = 0;
        int	endElements = 0;
        int	maxLength = 0;   
       for (int i = 0; i < arrNumber.length - 1; i++) {    
            int currentLength = 1;
            while (i < arrNumber.length - 1 && arrNumber[i] > arrNumber[i + 1]) {
                currentLength++;
                i++;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                endElements = i + 1;
                startElements = endElements - maxLength;
            }
        }
        return Arrays.copyOfRange(arrNumber, startElements, endElements);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findLongestSubarray(arr)));
    }
}