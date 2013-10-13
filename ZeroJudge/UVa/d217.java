package UVa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class d217 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

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
			
			System.out.println("Round " + n);
			if(win){
				System.out.println("You win.");
			}
			else if (hangMan != 7){
				System.out.println("You chickened out.");
			}
			else{
				System.out.println("You lose.");
			}
		}
	}

}
