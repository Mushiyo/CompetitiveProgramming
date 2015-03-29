//WA
package BASIC;

import java.util.Scanner;
import java.util.Arrays;

public class a291 {
	static int[] ans = new int[4];
	static int[] ansNumCount = new int[10];
	static int[] guess = new int[4];
	static int[] ansNumCountBackUp = new int[10];
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			Arrays.fill(ansNumCount, 0);
			
			String ansStr = input.nextLine();

			int index = 0;
			for (int i = 0; i < ansStr.length(); ++i) {
				if (Character.isDigit(ansStr.charAt(i))) {
					ans[index] = ansStr.charAt(i) - '0';
					++ansNumCount[ans[index]];
					++index;
				}
			}

			int n = input.nextInt();
			input.nextLine(); // eat change line

			while (n > 0) {
				for (int i = 0; i < ansNumCount.length; ++i) {
					ansNumCountBackUp[i] = ansNumCount[i];
				}

				String guessStr = input.nextLine();

				index = 0;

				for (int i = 0; i < guessStr.length(); ++i) {
					if (Character.isDigit(guessStr.charAt(i))) {
						guess[index] = guessStr.charAt(i) - '0';
						++index;
					}
				}

				int p = 0;
				int q = 0;
				for (int i = 0; i < guess.length; ++i) {
					if (guess[i] == ans[i]) {
						++p;
					}

					if (ansNumCountBackUp[guess[i]] > 0) {
						++q;
						--ansNumCountBackUp[guess[i]];
					}
				}

				q -= p;

				output.append(String.format("%dA%dB\n", p, q));

				--n;
			}

			if (input.hasNext()) {
				// eat change line
				input.nextLine();
			}
		}
		System.out.print(output);
	}
}
