package questionO;
import java.util.Arrays;


/**
 * @author
 * 
 * Program to sort an array of integers while removing the duplicates
 * This method is unsorted array method.
 * 
 * For example:
 * Array = [1, 1, 2, 2, 3, 3, 4, 5,]
 * 
 * After sorting the array and using the method:
 * Result after Sorting: [1, 2, 3, 4, 5]
 *
 */
  
public class dupTaskUsingArray{  
public static int removeDuplicates(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];       
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {4, 4, 3, 3, 2, 2, 1, 1, 0, 0};  
        Arrays.sort(arr);
        int length = arr.length;  
        length = removeDuplicates(arr, length);   
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");
        System.out.println(" \nThere are " + length + " of Elements in the array ");
        
    }  
    
}  