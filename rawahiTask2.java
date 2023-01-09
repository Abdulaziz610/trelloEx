package questionO;

import java.util.Scanner;

public class rawahiTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Program that read two number and only accept numbers between 0-100
		 * the program will ask the user to enter a number between 0-100 and display error message if the numbers > 100
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" ******* Program that Accept two number less than 100 ******* ");
		Boolean condition = true;
	
		int num1=0;
		int num2=0;
		
		while(condition) {
			System.out.print("Enter the First Number: ");
			 num1 = sc.nextInt();
			if(num1 > 100) {
				System.out.println("Error: the First number should be less than 100.");
				//Return and ask the user to enter the number again
			}else {
					condition = false;
				}
			
			
		}condition = true;
		
			while(condition) {
				System.out.print("Enter the Second Number: ");
				 num2 = sc.nextInt();
			if(num2 > 100 ) {
				System.out.println("Error: the Second number should be less than 100.");
			}
			
			//Return and ask the user to enter the number again
			else{
				condition = false;
				
			}
			
			}
			
		
		
			System.out.println("The First Number is = " +num1);
			System.out.println("The Second Number is = " +num2);
			
			
			
	}
	

}
