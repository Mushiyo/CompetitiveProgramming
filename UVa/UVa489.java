/* Filename: UVa489.java
 * Author: Mushiyo
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UVa489 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == -1) {
				break;
			}

			String ans = input.next();
			String guess = input.next();

			Set<Character> ansWords = new HashSet<Character>();
			for (int i = 0; i < ans.length(); ++i) {
				ansWords.add(ans.charAt(i));
			}

			Set<Character> guessWords = new HashSet<Character>();

			int hangMan = 0;
			boolean win = false;
			for (int i = 0; i < guess.length(); ++i) {
				char currentGuess = guess.charAt(i);

				if (ansWords.contains(currentGuess)) {
					ansWords.remove(currentGuess);
					guessWords.add(currentGuess);
				} else {
					if (!guessWords.contains(currentGuess)) {
						++hangMan;
						guessWords.add(currentGuess);
					}
				}

				if (ansWords.isEmpty()) {
					win = true;
					break;
				}
				
				if(hangMan == 7){
					break;
				}
			}
			
			output.append("Round " + n + "\n");
			if(win){
				output.append("You win.\n");
			}
			else if (hangMan != 7){
				output.append("You chickened out.\n");
			}
			else{
				output.append("You lose.\n");
			}
		}
		System.out.print(output);
	}

}
