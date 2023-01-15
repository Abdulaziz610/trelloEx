package questionO;

import java.util.HashSet;

public class appearsOnesInArray {

	public static void main(String[] args) {

		
		/**
		 * 
		 * This program remove the duplicates and get the unique elements( Appears once Elements )
		 * using hash set and function that add, contains, remove.
		 * add to ad elements
		 * remove to remove the duplicate elements.
		 * 
		 */
		int[] arrNumber = { 1, 2, 55, 55, 100, 1050, 256, 1050, 233, 500, 500 };
		HashSet<Integer> uniqueElements = new HashSet<>();
		HashSet<Integer> duplicateElements = new HashSet<>();
		
		
		for (int i = 0; i < arrNumber.length; i++) {
			if (!uniqueElements.contains(arrNumber[i])) {
				uniqueElements.add(arrNumber[i]);
			} else {
				duplicateElements.add(arrNumber[i]);

			}

		}

		uniqueElements.removeAll(duplicateElements);
		System.out.println("Elements that appear only once: " + uniqueElements);
		System.out.println("Duplicate Elements: " + duplicateElements);

	}

}
