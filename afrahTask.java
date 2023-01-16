package questionO;

public class afrahTask {
	
	/**
	 * This task prints out the two pairs of numbers that the sum of them equal to the 
	 * value of k.
	 * in this program k = 10;
	 * and the two numbers should be even number and the sum = 10
	 * @param arr
	 * @param k
	 */
	
	
	
	public static void sumPair(int[] arr, int k) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] % 2 == 0 && arr[j] % 2 == 0) {
					if(arr[i] + arr[j] == k)
						System.out.println(" The Two Numbers are: " + arr[i] + " and " + arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 10;
		sumPair(arrNumber, k);
	}

}
