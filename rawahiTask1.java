package questionO;

public class rawahiTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This is a program that display the largest number from an array of number
		 * and display the largest number
		 */
		
		
		
		System.out.println(" *******Program to Find the Largest Number ******* ");
		int[] num = {10, 35, 45, 55, 96, 1001, 1453};
		int largestNum = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] > largestNum ) {
				largestNum = num[i];
			}
		}
		System.out.println(" The Largest Number is " + largestNum);
	}

}
