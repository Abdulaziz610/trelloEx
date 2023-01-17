package questionO;

import java.util.Stack;
import java.util.Scanner;

	/**
	 * This program is to ask the user to enter a word and the program check if the word is palindrome
	 * or not and print the word.
	 * Using stack >> First in last out.
	 * And use: push >> to add the string.
	 * 			pop >> to extract the string.
	 * @author Lenovo
	 *
	 */



class plindromeString {
    public static void main(String[] args) {
    	System.out.print("Enter Any WORD: ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        Stack stackWord = new Stack();

        for (int i = 0; i < inputWord.length(); i++) {
            stackWord.push(inputWord.charAt(i));
        }
        String reverseString = "";
        while (!stackWord.isEmpty()) {
            reverseString = reverseString+stackWord.pop();
        }

        if (inputWord.equals(reverseString))
            System.out.println("The Word is a palindrome.");
        else
            System.out.println("The Word is NOT a palindrome.");

    }
}
