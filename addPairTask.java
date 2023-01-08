package additionTask;

import java.util.Scanner;

public class addTask {

	public static void main(String[] args) {
		/**
		 * Here is a program to extract a pair of two numbers, and the user enters the target number 
		 * 
		 * For Example: 
		 * 
		 * The user enters number 6 as a target number
		 * the pair will be:
		 * (2, 4)
		 * (5, 1)
		 * 
		 */
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			//List of Numbers
	        int[] numList = { 2, 3, 4, 5, 1, 7 , 10};
	        
	        System.out.print("Enter a target number: ");
	        int targetNum = sc.nextInt();
	        //Loop to go through each number in the list 
	        for (int i = 0; i < numList.length -1 ; i++)
	        {	            
	            for (int j = i + 1; j < numList.length; j++)
	            {	       
	                if (numList[i] + numList[j] == targetNum)
	                {
	                    System.out.printf("Pair found (%d, %d)\n", numList[i], numList[j]);
	                    
	                }
	                  	
	            }
	        }
	        	
	    }
	
	}


