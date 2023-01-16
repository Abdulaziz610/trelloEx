package questionO;
class randomQuestions {

	/**
	 * 
	 * This program is to find the maximum product number in an array of integer 
	 * Using multiple for loop 
	 * 
	 * 
	 * @param arrNumber
	 * @param n
	 * @return
	 */
	
	
	
	
	static int maxProduct(int[] arrNumber, int n) {

		
		/**
		 * Here is the function that will be called in the main class to go through the 4 numbers.
		 * Then multiply the 4 number and find the max product using MATH.max function.
		 */
		int maxProduct = 0;
		for (int i = 0; i < n - 3; i++)
			for (int j = i + 1; j < n - 2; j++)
				for (int k = j + 1; k < n - 1; k++)
					for (int m = k + 1; m < n ; m++)
					maxProduct = Math.max(maxProduct, arrNumber[i] * arrNumber[j] * arrNumber[k]* arrNumber[m]);
		
		return maxProduct;
		
	}

	
	//The main class >> 
	public static void main(String[] args) {
		int[] arrNumber = {1, 2, 3, 4, 5, 6};
		int arrLength = arrNumber.length;
		int maxProductNumber = maxProduct(arrNumber, arrLength);
		System.out.println("The Maximum Product is " + maxProductNumber);

	}
}