/* Filename: GCJ2017QA.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJ2017QA {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner input = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("A-large.in"));
		 PrintWriter out = new PrintWriter(new File("pA.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				char[] S = input.next().toCharArray();
				int K = input.nextInt();

				int flip = 0;
				for (int i = 0; i + K < S.length; ++i) {
					if (S[i] != '+') {
						for (int j = 0; j < K; ++j) {
							S[i + j] = flip(S[i + j]);
						}

						++flip;
					}
				}

				boolean isPossible = true;
				for (int i = S.length - K + 1; i < S.length; ++i) {
					if (S[i] != S[i - 1]) {
						isPossible = false;
						break;
					}
				}

				if (isPossible) {
					if (S[S.length - 1] == '-') {
						++flip;
					}

					out.printf("Case #%d: %d\n", t, flip);
				} else {
					out.printf("Case #%d: IMPOSSIBLE\n", t);
				}
			}
		}

		out.close();
		input.close();
	}

	private static char flip(char pancake) {
		if (pancake == '+') {
			return '-';
		} else {
			return '+';
		}
	}
}
