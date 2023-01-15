package questionO;

public class dupElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This Program prints out the duplicated numbers out of the array 
		 * if the number appears more than one the program will display the number.
		 */
		
		int[] arrNumber = {1, 1, 2, 2, 3, 4, 5, 6};
		for (int i = 0; i < arrNumber.length; i++) {
			for (int j = i + 1; j < arrNumber.length; j++) {
				if (arrNumber[i] == arrNumber[j]) {
					System.out.println(" The Duplicated Number is: " + arrNumber[i]);
				}
			}
			
		}
		
		
	}

}
