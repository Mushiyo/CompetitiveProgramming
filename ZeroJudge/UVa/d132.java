/* Filename: d132.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d132 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gameNum = 1;

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			int[] secretCode = new int[N];
			for (int i = 0; i < secretCode.length; ++i) {
				secretCode[i] = input.nextInt();
			}

			System.out.printf("Game %d:\n", gameNum);
			while (true) {
				int[] guess = new int[N];
				for (int i = 0; i < guess.length; ++i) {
					guess[i] = input.nextInt();
				}

				if (isAll0(guess)) {
					break;
				}

				int strongMatch = 0;
				int[] countOther = new int[10];
				for (int i = 0; i < secretCode.length; ++i) {
					if (guess[i] == secretCode[i]) {
						++strongMatch;
					} else {
						++countOther[secretCode[i]];
					}
				}

				int weakMatch = 0;
				for (int i = 0; i < secretCode.length; ++i) {
					if (guess[i] != secretCode[i]) {
						if (countOther[guess[i]] > 0) {
							++weakMatch;
						}
						--countOther[guess[i]];
					}
				}

				System.out.printf("    (%d,%d)\n", strongMatch, weakMatch);
			}
			++gameNum;
		}
	}

	static boolean isAll0(int[] guess) {
		for (int i = 0; i < guess.length; ++i) {
			if (guess[i] != 0) {
				return false;
			}
		}

		return true;
	}
}
